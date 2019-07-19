package com.shenyue.exercise.service.impl;

import com.shenyue.exercise.dao.EmpMapper;
import com.shenyue.exercise.entity.EDInfo;
import com.shenyue.exercise.entity.Emp;
import com.shenyue.exercise.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务层实现类
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<EDInfo> findAll() {
        List<EDInfo> list = empMapper.selectAll();
        for (EDInfo ed : list) {
            System.err.println(ed);
        }
        return list;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer addEmp(Emp emp) {
        try {
            int row1 = empMapper.insertEmp(emp);
            empMapper.UpdateAddDepNum(emp.getDid());
            System.err.println("添加成功");
            return row1;
        } catch (Exception e) {
            System.err.println("添加失败");
        }
        return -1;
    }

    @Override
    public List<Emp> findEmp() {
        List<Emp> list = empMapper.selectEmp();
        for (Emp emp : list) {
            System.err.println(emp);
        }
        return list;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer deleteById(int id) {
        try {
            int did = empMapper.selectById(id);
            int row1 = empMapper.deleteById(id);
            empMapper.UpdateReduceDepNum(did);
            System.err.println("删除成功");
            return row1;
        } catch (Exception e) {
            System.err.println("删除失败");
        }
        return -1;
    }

    @Override
    public Map<String, String> selectEd() {
        List<EDInfo> list = empMapper.selectEd();
        Map<String, String> map = new HashMap<>();
        for (EDInfo edInfo : list) {
            map.put(edInfo.getUsername(), edInfo.getName());
        }
        return map;
    }
}

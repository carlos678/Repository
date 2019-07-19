package com.shenyue.exercise.service;

import com.shenyue.exercise.entity.EDInfo;
import com.shenyue.exercise.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * 业务层接口
 */
public interface IEmpService {
    Integer addEmp(Emp emp);

    List<Emp> findEmp();

    List<EDInfo> findAll();

    Integer deleteById(int id);

    Map<String, String> selectEd();
}

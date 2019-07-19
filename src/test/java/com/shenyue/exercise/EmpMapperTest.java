package com.shenyue.exercise;

import com.shenyue.exercise.dao.EmpMapper;
import com.shenyue.exercise.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpMapperTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void addEmp() {
        Emp emp = new Emp("admin", "admin", "man", "23",
                "111111", "admin@admin.com", 1);
        int row = empMapper.insertEmp(emp);
        System.err.println(row + " ：添加成功");
        int row1 = empMapper.UpdateAddDepNum(emp.getDid());
        System.err.println(row1 + ": 部门人数加一");
    }
}

package com.shenyue.exercise;

import com.shenyue.exercise.entity.Emp;
import com.shenyue.exercise.service.IEmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpServieceTest {
    @Autowired
    private IEmpService iEmpService;

    @Test
    public void addEmp() {
        Emp emp = new Emp("yunwei", "yunwei", "man", "23",
                "111111", "yunwei.com", 4);
        iEmpService.addEmp(emp);
    }

    @Test
    public void deleteEmp() {
        iEmpService.deleteById(5);
    }
}

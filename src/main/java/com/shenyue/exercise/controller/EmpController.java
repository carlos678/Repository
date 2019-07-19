package com.shenyue.exercise.controller;

import com.shenyue.exercise.entity.EDInfo;
import com.shenyue.exercise.entity.Emp;
import com.shenyue.exercise.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 控制器
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private IEmpService iEmpService;

    @RequestMapping(value = "/reg")
    public String regHtml() {
        return "reg";
    }

    @RequestMapping("/add")
    public String addEmp(@RequestParam("username") String username, @RequestParam("password") String password,
                         @RequestParam("gender") String gender, @RequestParam("age") String age,
                         @RequestParam("phone") String phone, @RequestParam("email") String email,
                         @RequestParam("did") int did) {
        Emp emp = new Emp(username, password, gender, age, phone, email, did);
        try {
            iEmpService.addEmp(emp);
            return "reg_success";
        } catch (Exception e) {
            return "reg_failed";
        }
    }

    @RequestMapping("/find")
    @ResponseBody
    public List<Emp> findEmp() {
        List<Emp> list = iEmpService.findEmp();
        return list;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<EDInfo> findAll() {
        List<EDInfo> list = iEmpService.findAll();
        return list;
    }

    @RequestMapping("/findEd")
    @ResponseBody
    public Map<String, String> findEd() {
        Map<String, String> map = iEmpService.selectEd();
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteById(@RequestParam("id") int id) {
        try {
            iEmpService.deleteById(id);
            return "success";
        } catch (Exception e) {
            return "failed";
        }
    }
}

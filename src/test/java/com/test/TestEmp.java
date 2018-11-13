package com.test;

import com.entity.Emp;
import com.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestEmp extends BaseTest {
    @Autowired
    EmpService empService;
    @Test
    public void findall(){
        List<Emp> emps = empService.queryAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}

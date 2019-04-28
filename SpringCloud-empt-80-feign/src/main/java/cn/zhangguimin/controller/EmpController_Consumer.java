package cn.zhangguimin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zhangguimin.entitys.Employee;
import cn.zhangguimin.service.EmpClientService;

@RestController
public class EmpController_Consumer {

    @Autowired
    private EmpClientService service;

    @RequestMapping(value = "/consumer/emp/add")
    public Integer add(Employee emp) {
        return service.add(emp);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Employee get(@PathVariable("id") Integer id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Employee> list() {
        return service.list();
    }

}

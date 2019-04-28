package cn.zhangguimin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.zhangguimin.entitys.Employee;
import cn.zhangguimin.service.EmployeeService;

@RestController
public class EmpController extends BaseController {
    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/emp/add", method = RequestMethod.POST)
    public Integer add(@RequestBody Employee employee) {

        return service.saveOrUpdate(employee);

    }

    @RequestMapping(value = "/emp/list", method = RequestMethod.GET)
    public List<Employee> list() {
        return service.list();
    }

    @RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Employee get(@PathVariable("id") Integer id) {
        Employee emp = service.get(id);
        //使抛出异常然后调用hystrixGet方法
        emp.getEmpName();
        return emp;
    }

    public Employee hystrixGet(@PathVariable("id") Integer id) {
        return new Employee().setDId(id).setEmpName("该ID" + id + "不存在对应信息,null--@HystrixCommand");
    }
}

package cn.zhangguimin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cn.zhangguimin.entitys.Employee;
import cn.zhangguimin.service.EmployeeService;

@RestController
public class EmpController extends BaseController {
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/emp/add", method = RequestMethod.POST)
	public Integer add(Employee employee) {

		return service.saveOrUpdate(employee);

	}

	@RequestMapping(value = "/emp/list", method = RequestMethod.GET)
	public List<Employee> list() {
		return service.list();
	}

	@RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable("id") Integer id) {
		return service.get(id);
	}
}

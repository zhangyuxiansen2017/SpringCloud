package cn.zhangguimin.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.zhangguimin.entitys.Employee;

@FeignClient(value = "SPRINGCLOUD-EMPT",fallbackFactory=EmpClientServiceFallbackFactory.class)
public interface EmpClientService {

	@RequestMapping(value = "/emp/add", method = RequestMethod.POST)
	public Integer add(Employee employee);

	@RequestMapping(value = "/emp/list", method = RequestMethod.GET)
	public List<Employee> list();

	@RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable("id") Integer id);
}

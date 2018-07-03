package cn.zhangguimin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import cn.zhangguimin.entitys.Employee;

@RestController
public class EmpController_Consumer {

	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-EMPT";
	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/emp/add")
	public boolean add(Employee emp) {
		boolean b=false;
		try {
			b = restTemplate.postForObject(REST_URL_PREFIX + "/emp/add", emp, Boolean.class);
		} catch (RestClientException e) {
			e.printStackTrace();
		}
		return b;
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Employee get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/emp/get/" + id, Employee.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Employee> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/emp/list", List.class);
	}

}

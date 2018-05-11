package cn.zhangguimin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhangguimin.dao.EmployeeMapper;
import cn.zhangguimin.entitys.Employee;
import cn.zhangguimin.entitys.EmployeeExample;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper mapper;

	public List<Employee> list() {
		EmployeeExample example = new EmployeeExample();
		example.setOrderByClause("create_date DESC LIMIT 0,10");
		return mapper.selectByExample(example);
	}

	public Integer saveOrUpdate(Employee emp) {
		if (emp.getEmpId() != null) {
			return mapper.updateByPrimaryKey(emp);
		} else {
			return mapper.insertSelective(emp);
		}
	}

	public Employee get(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
}

package cn.zhangguimin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhangguimin.dao.DepartmentMapper;
import cn.zhangguimin.entitys.Department;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentMapper mapper;

	public List<Department> list() {
		return mapper.selectByExample(null);
	}

	public Department get(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
}

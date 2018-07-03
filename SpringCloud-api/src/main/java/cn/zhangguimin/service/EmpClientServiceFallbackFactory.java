package cn.zhangguimin.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.zhangguimin.entitys.Employee;
import feign.hystrix.FallbackFactory;

@Component
public class EmpClientServiceFallbackFactory implements FallbackFactory<EmpClientService>  {

	@Override
	public EmpClientService create(Throwable cause) {
		return new EmpClientService() {
			
			@Override
			public List<Employee> list() {
				return null;
			}
			
			@Override
			public Employee get(Integer id) {
				return new Employee().setEmpName("查询不存在,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
			}
			
			@Override
			public Integer add(Employee employee) {
				return null;
			}
		};
	}

}

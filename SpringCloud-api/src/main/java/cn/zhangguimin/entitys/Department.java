package cn.zhangguimin.entitys;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Department {
	private Integer deptId;
	private String deptName;
}
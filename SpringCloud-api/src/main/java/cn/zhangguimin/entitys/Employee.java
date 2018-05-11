package cn.zhangguimin.entitys;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Employee {
	private Integer empId;
	private String empName;
	private String gender;
	private String email;
	private Integer dId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
}
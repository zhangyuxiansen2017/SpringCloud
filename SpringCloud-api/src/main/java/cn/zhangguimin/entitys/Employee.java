package cn.zhangguimin.entitys;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Employee implements Serializable{
	private Integer empId;
	private String empName;
	private String gender;
	private String email;
	private Integer dId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
}
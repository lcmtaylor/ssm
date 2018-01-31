package com.sxt.ssm.service;

import com.sxt.ssm.entity.Student;


/**
 * 
 * @author luchunmeng
 * @date 2018年1月25日
 */
public interface StudentService {

	/**
	 * 添加新部门
	 * @param dept 部门对象
	 * @return	
	 */
	public boolean addStudent(Student stu);
	
}

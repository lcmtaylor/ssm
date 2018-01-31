package com.sxt.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.ssm.dao.StudentDao;
import com.sxt.ssm.entity.Student;
import com.sxt.ssm.service.StudentService;

@Service("stuService")
public class StudentServiceImpl implements StudentService {

	//准备Dao对象
	@Resource(name="studentDao")
	private StudentDao stuDao;
	
	@Override
	public boolean addStudent(Student stu) {
		
		return stuDao.insertSelective(stu) > 0 ? true : false;
	}
}

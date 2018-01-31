package com.sxt.ssm.dao;

import com.sxt.ssm.entity.Student;

public interface StudentDao {
    int deleteByPrimaryKey(Short stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Short stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
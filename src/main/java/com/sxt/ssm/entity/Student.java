package com.sxt.ssm.entity;

import java.util.Date;

public class Student {
    private Short stuId;
    private String stuName;
    private Short stuAge;
    private Date stuBirth;
    private String photo;

    public Short getStuId() {
        return stuId;
    }

    public void setStuId(Short stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Short getStuAge() {
        return stuAge;
    }

    public void setStuAge(Short stuAge) {
        this.stuAge = stuAge;
    }

    public Date getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(Date stuBirth) {
        this.stuBirth = stuBirth;
    }

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
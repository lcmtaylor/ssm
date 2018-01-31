package com.sxt.ssm.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sxt.ssm.entity.Student;
import com.sxt.ssm.service.StudentService;

/**
 * 
 * @author luchunmeng
 * @date 2018年1月25日
 */

@Controller
public class StudentController {

	//准备业务层对象
	@Resource(name="stuService")
	private StudentService stuService;
	
	@RequestMapping("/addStudent.action")
	public String addDept(Student stu,MultipartFile photoes,HttpServletRequest request,Model model) throws Exception{
		//获取文件名
		String fileName = photoes.getOriginalFilename();
		//获取路径
		String path = request.getSession().getServletContext().getRealPath("/photoes");
		//构建目标文件
		File destFile = new File(path,fileName);
		//将图片保存到目标文件
		photoes.transferTo(destFile);
		//保存文件名到Student对象
		stu.setPhoto(fileName);
		//调用业务层方法保存部门对象
		stuService.addStudent(stu);
		
		model.addAttribute("stu", stu);
		
		return "forward:/page/ok.jsp";
	}
	
	@RequestMapping("/download.action")
	public void download(String fileName,HttpServletRequest request,HttpServletResponse response){
		
	}
}

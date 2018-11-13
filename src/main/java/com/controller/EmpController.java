package com.controller;

import com.entity.Emp;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;



@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/queryAll")
	public String queryAll(HttpServletRequest request){
		List<Emp> list = empService.queryAll();
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		return "redirect:/back/emp/emplist.jsp";
	}
	
	@RequestMapping("/save")
	public String save(Emp emp){
		empService.save(emp);
		return "back/emp/addEmp";
	}
	
	@RequestMapping("/del")
	public String del(String id){
		System.out.println(id);
		empService.del(id);
		return "forward:/emp/queryAll";
	}
	
	@RequestMapping("/update")
	public String update(Emp emp){
		empService.update(emp);
		return "back/emp/updateEmp";
	}

}

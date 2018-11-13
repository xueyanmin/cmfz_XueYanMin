package com.service;

import com.entity.Emp;

import java.util.List;


public interface EmpService {
	List<Emp> queryAll();
	void del(String id);
	void update(Emp emp);
	void save(Emp emp);
}

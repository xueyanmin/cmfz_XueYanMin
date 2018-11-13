package com.dao;


import com.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDAO {
	List<Emp> queryAll();
	void del(@Param("id") String id);
	void update(Emp emp);
	void save(Emp emp);
}

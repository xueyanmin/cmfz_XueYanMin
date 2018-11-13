package com.service;

import com.dao.EmpDAO;
import com.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDAO empDAO;
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Emp> queryAll() {
		List<Emp> list = empDAO.queryAll();
		return list;
	}

	@Override
	public void del(String id) {
		empDAO.del(id);

	}

	@Override
	public void update(Emp emp) {
		empDAO.update(emp);

	}

	@Override
	public void save(Emp emp) {
		emp.setId(UUID.randomUUID().toString());
		empDAO.save(emp);

	}

}

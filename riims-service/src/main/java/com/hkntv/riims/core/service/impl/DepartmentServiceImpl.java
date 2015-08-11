package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Department;
import com.hkntv.riims.core.repository.DepartmentRepository;
import com.hkntv.riims.core.model.DepartmentModel;
import com.hkntv.riims.core.service.DepartmentService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private DepartmentRepository departmentRepo;

	@Transactional
	@Override
	public int create(DepartmentModel departmentModel) {
		return departmentRepo.insert(beanMapper.map(departmentModel, Department.class));
	}

	@Transactional
	@Override
	public int createSelective(DepartmentModel departmentModel) {
		return departmentRepo.insertSelective(beanMapper.map(departmentModel, Department.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return departmentRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public DepartmentModel findByPrimaryKey(String id) {
		Department department = departmentRepo.selectByPrimaryKey(id);
		return beanMapper.map(department, DepartmentModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(DepartmentModel departmentModel) {
		return departmentRepo.selectCount(beanMapper.map(departmentModel, Department.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(DepartmentModel departmentModel) {
		return departmentRepo.updateByPrimaryKey(beanMapper.map(departmentModel, Department.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(DepartmentModel departmentModel) {
		return departmentRepo.updateByPrimaryKeySelective(beanMapper.map(departmentModel, Department.class));
	}

}

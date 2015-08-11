
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.DepartmentModel;

public interface DepartmentService{
	
	public int create(DepartmentModel departmentModel);
	
	public int createSelective(DepartmentModel departmentModel);
	
	public DepartmentModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(DepartmentModel departmentModel);
	
	public int updateByPrimaryKeySelective(DepartmentModel departmentModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(DepartmentModel departmentModel);
	
}
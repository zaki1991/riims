
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.AdminModel;

public interface AdminService{
	
	public int create(AdminModel adminModel);
	
	public int createSelective(AdminModel adminModel);

	public AdminModel login(String userId, String password);
	
	public AdminModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(AdminModel adminModel);
	
	public int updateByPrimaryKeySelective(AdminModel adminModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(AdminModel adminModel);
	
}
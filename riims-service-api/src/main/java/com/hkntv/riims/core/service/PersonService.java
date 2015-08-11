
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.PersonModel;

import java.util.List;

public interface PersonService{
	
	public int create(PersonModel personModel);
	
	public int createSelective(PersonModel personModel);

	public PersonModel login(String userId, String password);
	
	public PersonModel findByPrimaryKey(String id);

	public List<PersonModel> selectPage(PersonModel personModel, Integer page, Integer pageSize);
	
	public int updateByPrimaryKey(PersonModel personModel);
	
	public int updateByPrimaryKeySelective(PersonModel personModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(PersonModel personModel);
	
}
package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Person;
import com.hkntv.riims.core.repository.PersonRepository;
import com.hkntv.riims.core.model.PersonModel;
import com.hkntv.riims.core.service.PersonService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private PersonRepository personRepo;

	@Transactional
	@Override
	public int create(PersonModel personModel) {
		return personRepo.insert(beanMapper.map(personModel, Person.class));
	}

	@Transactional
	@Override
	public int createSelective(PersonModel personModel) {
		return personRepo.insertSelective(beanMapper.map(personModel, Person.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return personRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public PersonModel findByPrimaryKey(String id) {
		Person person = personRepo.selectByPrimaryKey(id);
		return beanMapper.map(person, PersonModel.class);
	}

	@Override
	public PersonModel login(String workId, String password) {
		Person person = personRepo.selectByWorkId(workId);
		String pwd;
		if(person!=null){
			pwd = person.getPassword();
		}else{
			pwd=null;
		}
		if(pwd!=null&&pwd.equals(password)){
			return beanMapper.map(person,PersonModel.class);
		}else {
			return null;
		}
	}

	@Override
	public List<PersonModel> selectPage(PersonModel personModel, Integer page, Integer pageSize) {
		Person person = beanMapper.map(personModel, Person.class);
		return beanMapper.mapAsList(personRepo.selectPage(person, new PageRequest(page, pageSize)), PersonModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(PersonModel personModel) {
		return personRepo.selectCount(beanMapper.map(personModel, Person.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(PersonModel personModel) {
		return personRepo.updateByPrimaryKey(beanMapper.map(personModel, Person.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(PersonModel personModel) {
		return personRepo.updateByPrimaryKeySelective(beanMapper.map(personModel, Person.class));
	}

}

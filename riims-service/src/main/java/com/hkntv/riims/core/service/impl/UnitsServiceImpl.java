package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Units;
import com.hkntv.riims.core.repository.UnitsRepository;
import com.hkntv.riims.core.model.UnitsModel;
import com.hkntv.riims.core.service.UnitsService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class UnitsServiceImpl implements UnitsService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private UnitsRepository unitsRepo;

	@Transactional
	@Override
	public int create(UnitsModel unitsModel) {
		return unitsRepo.insert(beanMapper.map(unitsModel, Units.class));
	}

	@Transactional
	@Override
	public int createSelective(UnitsModel unitsModel) {
		return unitsRepo.insertSelective(beanMapper.map(unitsModel, Units.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return unitsRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public UnitsModel findByPrimaryKey(String id) {
		Units units = unitsRepo.selectByPrimaryKey(id);
		return beanMapper.map(units, UnitsModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(UnitsModel unitsModel) {
		return unitsRepo.selectCount(beanMapper.map(unitsModel, Units.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(UnitsModel unitsModel) {
		return unitsRepo.updateByPrimaryKey(beanMapper.map(unitsModel, Units.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(UnitsModel unitsModel) {
		return unitsRepo.updateByPrimaryKeySelective(beanMapper.map(unitsModel, Units.class));
	}

}

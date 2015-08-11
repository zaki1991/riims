package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.DamageInfo;
import com.hkntv.riims.core.repository.DamageInfoRepository;
import com.hkntv.riims.core.model.DamageInfoModel;
import com.hkntv.riims.core.service.DamageInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

import java.util.List;

@Service
public class DamageInfoServiceImpl implements DamageInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private DamageInfoRepository damageInfoRepo;

	@Transactional
	@Override
	public int create(DamageInfoModel damageInfoModel) {
		return damageInfoRepo.insert(beanMapper.map(damageInfoModel, DamageInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(DamageInfoModel damageInfoModel) {
		return damageInfoRepo.insertSelective(beanMapper.map(damageInfoModel, DamageInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return damageInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public DamageInfoModel findByPrimaryKey(String id) {
		DamageInfo damageInfo = damageInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(damageInfo, DamageInfoModel.class);
	}

	@Override
	public List<DamageInfoModel> selectPage(DamageInfoModel damageInfoModel, Integer page, Integer pageSize) {
		DamageInfo damageInfo = beanMapper.map(damageInfoModel, DamageInfo.class);
		return beanMapper.mapAsList(damageInfoRepo.selectPage(damageInfo, new PageRequest(page, pageSize)), DamageInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(DamageInfoModel damageInfoModel) {
		return damageInfoRepo.selectCount(beanMapper.map(damageInfoModel, DamageInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(DamageInfoModel damageInfoModel) {
		return damageInfoRepo.updateByPrimaryKey(beanMapper.map(damageInfoModel, DamageInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(DamageInfoModel damageInfoModel) {
		return damageInfoRepo.updateByPrimaryKeySelective(beanMapper.map(damageInfoModel, DamageInfo.class));
	}

}

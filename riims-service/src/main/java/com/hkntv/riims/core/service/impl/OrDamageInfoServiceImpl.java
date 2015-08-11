package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.OrDamageInfo;
import com.hkntv.riims.core.repository.OrDamageInfoRepository;
import com.hkntv.riims.core.model.OrDamageInfoModel;
import com.hkntv.riims.core.service.OrDamageInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

import java.util.List;

@Service
public class OrDamageInfoServiceImpl implements OrDamageInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private OrDamageInfoRepository orDamageInfoRepo;

	@Transactional
	@Override
	public int create(OrDamageInfoModel orDamageInfoModel) {
		return orDamageInfoRepo.insert(beanMapper.map(orDamageInfoModel, OrDamageInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(OrDamageInfoModel orDamageInfoModel) {
		return orDamageInfoRepo.insertSelective(beanMapper.map(orDamageInfoModel, OrDamageInfo.class));
	}

	@Override
	public List<OrDamageInfoModel> selectPage(OrDamageInfoModel orDamageInfoModel, Integer page, Integer pageSize){
		OrDamageInfo orDamageInfo = beanMapper.map(orDamageInfoModel,OrDamageInfo.class);
		return beanMapper.mapAsList(orDamageInfoRepo.selectPage(orDamageInfo, new PageRequest(page, pageSize)), OrDamageInfoModel.class);
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return orDamageInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public OrDamageInfoModel findByPrimaryKey(String id) {
		OrDamageInfo orDamageInfo = orDamageInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(orDamageInfo, OrDamageInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(OrDamageInfoModel orDamageInfoModel) {
		return orDamageInfoRepo.selectCount(beanMapper.map(orDamageInfoModel, OrDamageInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(OrDamageInfoModel orDamageInfoModel) {
		return orDamageInfoRepo.updateByPrimaryKey(beanMapper.map(orDamageInfoModel, OrDamageInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(OrDamageInfoModel orDamageInfoModel) {
		return orDamageInfoRepo.updateByPrimaryKeySelective(beanMapper.map(orDamageInfoModel, OrDamageInfo.class));
	}

}

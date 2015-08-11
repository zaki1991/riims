package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.LineAreaInfo;
import com.hkntv.riims.core.repository.LineAreaInfoRepository;
import com.hkntv.riims.core.model.LineAreaInfoModel;
import com.hkntv.riims.core.service.LineAreaInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class LineAreaInfoServiceImpl implements LineAreaInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private LineAreaInfoRepository lineAreaInfoRepo;

	@Transactional
	@Override
	public int create(LineAreaInfoModel lineAreaInfoModel) {
		return lineAreaInfoRepo.insert(beanMapper.map(lineAreaInfoModel, LineAreaInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(LineAreaInfoModel lineAreaInfoModel) {
		return lineAreaInfoRepo.insertSelective(beanMapper.map(lineAreaInfoModel, LineAreaInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return lineAreaInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public LineAreaInfoModel findByPrimaryKey(String id) {
		LineAreaInfo lineAreaInfo = lineAreaInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(lineAreaInfo, LineAreaInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(LineAreaInfoModel lineAreaInfoModel) {
		return lineAreaInfoRepo.selectCount(beanMapper.map(lineAreaInfoModel, LineAreaInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(LineAreaInfoModel lineAreaInfoModel) {
		return lineAreaInfoRepo.updateByPrimaryKey(beanMapper.map(lineAreaInfoModel, LineAreaInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(LineAreaInfoModel lineAreaInfoModel) {
		return lineAreaInfoRepo.updateByPrimaryKeySelective(beanMapper.map(lineAreaInfoModel, LineAreaInfo.class));
	}

}

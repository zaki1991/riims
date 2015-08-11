package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.TrackDivisionInfo;
import com.hkntv.riims.core.repository.TrackDivisionInfoRepository;
import com.hkntv.riims.core.model.TrackDivisionInfoModel;
import com.hkntv.riims.core.service.TrackDivisionInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class TrackDivisionInfoServiceImpl implements TrackDivisionInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private TrackDivisionInfoRepository trackDivisionInfoRepo;

	@Transactional
	@Override
	public int create(TrackDivisionInfoModel trackDivisionInfoModel) {
		return trackDivisionInfoRepo.insert(beanMapper.map(trackDivisionInfoModel, TrackDivisionInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(TrackDivisionInfoModel trackDivisionInfoModel) {
		return trackDivisionInfoRepo.insertSelective(beanMapper.map(trackDivisionInfoModel, TrackDivisionInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return trackDivisionInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public TrackDivisionInfoModel findByPrimaryKey(String id) {
		TrackDivisionInfo trackDivisionInfo = trackDivisionInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(trackDivisionInfo, TrackDivisionInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(TrackDivisionInfoModel trackDivisionInfoModel) {
		return trackDivisionInfoRepo.selectCount(beanMapper.map(trackDivisionInfoModel, TrackDivisionInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(TrackDivisionInfoModel trackDivisionInfoModel) {
		return trackDivisionInfoRepo.updateByPrimaryKey(beanMapper.map(trackDivisionInfoModel, TrackDivisionInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(TrackDivisionInfoModel trackDivisionInfoModel) {
		return trackDivisionInfoRepo.updateByPrimaryKeySelective(beanMapper.map(trackDivisionInfoModel, TrackDivisionInfo.class));
	}

}

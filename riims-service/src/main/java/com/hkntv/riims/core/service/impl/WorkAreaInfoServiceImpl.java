package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.WorkAreaInfo;
import com.hkntv.riims.core.repository.WorkAreaInfoRepository;
import com.hkntv.riims.core.model.WorkAreaInfoModel;
import com.hkntv.riims.core.service.WorkAreaInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class WorkAreaInfoServiceImpl implements WorkAreaInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private WorkAreaInfoRepository workAreaInfoRepo;

	@Transactional
	@Override
	public int create(WorkAreaInfoModel workAreaInfoModel) {
		return workAreaInfoRepo.insert(beanMapper.map(workAreaInfoModel, WorkAreaInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(WorkAreaInfoModel workAreaInfoModel) {
		return workAreaInfoRepo.insertSelective(beanMapper.map(workAreaInfoModel, WorkAreaInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return workAreaInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public WorkAreaInfoModel findByPrimaryKey(String id) {
		WorkAreaInfo workAreaInfo = workAreaInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(workAreaInfo, WorkAreaInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(WorkAreaInfoModel workAreaInfoModel) {
		return workAreaInfoRepo.selectCount(beanMapper.map(workAreaInfoModel, WorkAreaInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(WorkAreaInfoModel workAreaInfoModel) {
		return workAreaInfoRepo.updateByPrimaryKey(beanMapper.map(workAreaInfoModel, WorkAreaInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(WorkAreaInfoModel workAreaInfoModel) {
		return workAreaInfoRepo.updateByPrimaryKeySelective(beanMapper.map(workAreaInfoModel, WorkAreaInfo.class));
	}

}

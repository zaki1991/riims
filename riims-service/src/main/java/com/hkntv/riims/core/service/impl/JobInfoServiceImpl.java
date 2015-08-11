package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.JobInfo;
import com.hkntv.riims.core.repository.JobInfoRepository;
import com.hkntv.riims.core.model.JobInfoModel;
import com.hkntv.riims.core.service.JobInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class JobInfoServiceImpl implements JobInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private JobInfoRepository jobInfoRepo;

	@Transactional
	@Override
	public int create(JobInfoModel jobInfoModel) {
		return jobInfoRepo.insert(beanMapper.map(jobInfoModel, JobInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(JobInfoModel jobInfoModel) {
		return jobInfoRepo.insertSelective(beanMapper.map(jobInfoModel, JobInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return jobInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public JobInfoModel findByPrimaryKey(String id) {
		JobInfo jobInfo = jobInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(jobInfo, JobInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(JobInfoModel jobInfoModel) {
		return jobInfoRepo.selectCount(beanMapper.map(jobInfoModel, JobInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(JobInfoModel jobInfoModel) {
		return jobInfoRepo.updateByPrimaryKey(beanMapper.map(jobInfoModel, JobInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(JobInfoModel jobInfoModel) {
		return jobInfoRepo.updateByPrimaryKeySelective(beanMapper.map(jobInfoModel, JobInfo.class));
	}

}

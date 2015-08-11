package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.LineInfo;
import com.hkntv.riims.core.repository.LineInfoRepository;
import com.hkntv.riims.core.model.LineInfoModel;
import com.hkntv.riims.core.service.LineInfoService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class LineInfoServiceImpl implements LineInfoService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private LineInfoRepository lineInfoRepo;

	@Transactional
	@Override
	public int create(LineInfoModel lineInfoModel) {
		return lineInfoRepo.insert(beanMapper.map(lineInfoModel, LineInfo.class));
	}

	@Transactional
	@Override
	public int createSelective(LineInfoModel lineInfoModel) {
		return lineInfoRepo.insertSelective(beanMapper.map(lineInfoModel, LineInfo.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return lineInfoRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public LineInfoModel findByPrimaryKey(String id) {
		LineInfo lineInfo = lineInfoRepo.selectByPrimaryKey(id);
		return beanMapper.map(lineInfo, LineInfoModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(LineInfoModel lineInfoModel) {
		return lineInfoRepo.selectCount(beanMapper.map(lineInfoModel, LineInfo.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(LineInfoModel lineInfoModel) {
		return lineInfoRepo.updateByPrimaryKey(beanMapper.map(lineInfoModel, LineInfo.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(LineInfoModel lineInfoModel) {
		return lineInfoRepo.updateByPrimaryKeySelective(beanMapper.map(lineInfoModel, LineInfo.class));
	}

}

package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Station;
import com.hkntv.riims.core.repository.StationRepository;
import com.hkntv.riims.core.model.StationModel;
import com.hkntv.riims.core.service.StationService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class StationServiceImpl implements StationService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private StationRepository stationRepo;

	@Transactional
	@Override
	public int create(StationModel stationModel) {
		return stationRepo.insert(beanMapper.map(stationModel, Station.class));
	}

	@Transactional
	@Override
	public int createSelective(StationModel stationModel) {
		return stationRepo.insertSelective(beanMapper.map(stationModel, Station.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return stationRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public StationModel findByPrimaryKey(String id) {
		Station station = stationRepo.selectByPrimaryKey(id);
		return beanMapper.map(station, StationModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(StationModel stationModel) {
		return stationRepo.selectCount(beanMapper.map(stationModel, Station.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(StationModel stationModel) {
		return stationRepo.updateByPrimaryKey(beanMapper.map(stationModel, Station.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(StationModel stationModel) {
		return stationRepo.updateByPrimaryKeySelective(beanMapper.map(stationModel, Station.class));
	}

}

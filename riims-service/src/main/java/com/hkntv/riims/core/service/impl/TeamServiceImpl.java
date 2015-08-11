package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Team;
import com.hkntv.riims.core.repository.TeamRepository;
import com.hkntv.riims.core.model.TeamModel;
import com.hkntv.riims.core.service.TeamService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private TeamRepository teamRepo;

	@Transactional
	@Override
	public int create(TeamModel teamModel) {
		return teamRepo.insert(beanMapper.map(teamModel, Team.class));
	}

	@Transactional
	@Override
	public int createSelective(TeamModel teamModel) {
		return teamRepo.insertSelective(beanMapper.map(teamModel, Team.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return teamRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public TeamModel findByPrimaryKey(String id) {
		Team team = teamRepo.selectByPrimaryKey(id);
		return beanMapper.map(team, TeamModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(TeamModel teamModel) {
		return teamRepo.selectCount(beanMapper.map(teamModel, Team.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(TeamModel teamModel) {
		return teamRepo.updateByPrimaryKey(beanMapper.map(teamModel, Team.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(TeamModel teamModel) {
		return teamRepo.updateByPrimaryKeySelective(beanMapper.map(teamModel, Team.class));
	}

}

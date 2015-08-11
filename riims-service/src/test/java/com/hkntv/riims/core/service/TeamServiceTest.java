		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.TeamService;
import com.hkntv.riims.core.model.TeamModel;


public class TeamServiceTest extends BaseDbTest{

	@Autowired
	private TeamService teamService;

	@Test
	public void testCreate() throws Exception {
		TeamModel teamModel = new TeamModel();
		teamModel.setGuid("74084fc5-a04d-45b1-9fb7-cbd5f8d7c111");
		teamModel.setTeamId("d458c0a5-4e5c-40e9-b");
		teamModel.setTeamName("2a721e4c-43ec-45a4-bf1f-f5ce155cc0c4");
		String pkValue = teamModel.getGuid();
		saveModel(teamModel);

		TeamModel findModel = teamService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(teamModel.getTeamId(), findModel.getTeamId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		TeamModel teamModel = new TeamModel();
		teamModel.setGuid("ea7ab464-bc0f-4c73-81bb-3c405c8f2863");
		teamModel.setTeamId("1162a786-168f-4778-9");
		teamModel.setTeamName("edf01b3e-50f2-4286-a8b7-b2ce9213c8be");
		String pkValue = teamModel.getGuid();
		saveModel(teamModel);

		TeamModel findModel = teamService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(teamModel.getTeamId(), findModel.getTeamId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		TeamModel teamModel = new TeamModel();
		teamModel.setGuid("92db4e98-f657-417f-8d0e-c71f88602ba1");
		teamModel.setTeamId("9c868756-508c-4a20-8");
		teamModel.setTeamName("f749fe53-71cd-4691-b095-b6aa30e8e0fa");
		String pkValue = teamModel.getGuid();
		saveModel(teamModel);

		//TeamModel updateModel = createModel();
		TeamModel updateModel = new TeamModel();
		updateModel.setGuid("a47c72ff-45c9-41ff-9683-713954d43c7a");
		updateModel.setTeamId("00431460-87c8-4770-b");
		updateModel.setTeamName("b3ebbfdd-db44-4823-bf9f-3af3098860d5");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = teamService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		TeamModel findModel = teamService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getTeamId(), findModel.getTeamId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		TeamModel teamModel = new TeamModel();
		teamModel.setGuid("a5058b94-fd69-4407-aa39-2d3edca4f14f");
		teamModel.setTeamId("a5837e3b-ded3-4e8c-9");
		teamModel.setTeamName("5fc4bf25-2cdb-4270-9987-3101ccf516fa");
		String pkValue = teamModel.getGuid();
		saveModel(teamModel);
	
		Integer deleteResult = teamService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		TeamModel findModel = teamService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(TeamModel teamModel) throws Exception {
		Integer createResult = teamService.create(teamModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = teamService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private TeamModel createModel() {
		TeamModel teamModel = new TeamModel();
		teamModel.setGuid("8bf61bf5-64ad-47ac-838b-08ababde4aa1");
		teamModel.setTeamId("ebe62320-a67b-40a2-8");
		teamModel.setTeamName("a5a28f1c-c1a6-4a23-9a02-88fd350916c6");
		return teamModel;
	}


}

		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.StationService;
import com.hkntv.riims.core.model.StationModel;


public class StationServiceTest extends BaseDbTest{

	@Autowired
	private StationService stationService;

	@Test
	public void testCreate() throws Exception {
		StationModel stationModel = new StationModel();
		stationModel.setGuid("fd6e10b6-9ccd-45b1-8744-1fc472d6b44e");
		stationModel.setStationId("6202b9e0-a0ef-49be-9");
		stationModel.setStationName("cce2b05e-da99-4702-a60d-bc196a768e57");
		String pkValue = stationModel.getGuid();
		saveModel(stationModel);

		StationModel findModel = stationService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(stationModel.getStationId(), findModel.getStationId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		StationModel stationModel = new StationModel();
		stationModel.setGuid("210a6af7-956d-42bd-a5c2-01a0f95edead");
		stationModel.setStationId("34b60110-261b-439b-a");
		stationModel.setStationName("2ab7b3c8-5a7f-480f-b7ce-213b566b44c5");
		String pkValue = stationModel.getGuid();
		saveModel(stationModel);

		StationModel findModel = stationService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(stationModel.getStationId(), findModel.getStationId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		StationModel stationModel = new StationModel();
		stationModel.setGuid("6b4a5154-03fd-43c4-af5e-b49497dbd461");
		stationModel.setStationId("2b48521c-01b8-41e8-a");
		stationModel.setStationName("82e9a181-8b86-4999-83c1-a847c2514469");
		String pkValue = stationModel.getGuid();
		saveModel(stationModel);

		//StationModel updateModel = createModel();
		StationModel updateModel = new StationModel();
		updateModel.setGuid("0d79a9ff-77d9-4deb-ba83-a405088b1cf9");
		updateModel.setStationId("21a706f4-ba04-4d52-8");
		updateModel.setStationName("36cb6691-6d34-4ef0-9ac2-f79ab8d36b15");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = stationService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		StationModel findModel = stationService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getStationId(), findModel.getStationId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		StationModel stationModel = new StationModel();
		stationModel.setGuid("95f38a02-7574-40af-9763-d185ee3f37f4");
		stationModel.setStationId("d051d5ea-216e-4772-b");
		stationModel.setStationName("ad60ea41-bffb-4318-8c1b-260d393c0f89");
		String pkValue = stationModel.getGuid();
		saveModel(stationModel);
	
		Integer deleteResult = stationService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		StationModel findModel = stationService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(StationModel stationModel) throws Exception {
		Integer createResult = stationService.create(stationModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = stationService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private StationModel createModel() {
		StationModel stationModel = new StationModel();
		stationModel.setGuid("cec8cea7-212b-4c28-bcb6-907a2fe7de3a");
		stationModel.setStationId("d5f580f3-2555-431c-a");
		stationModel.setStationName("fc233244-d1c9-42e8-b210-5d75a85a2e1a");
		return stationModel;
	}


}

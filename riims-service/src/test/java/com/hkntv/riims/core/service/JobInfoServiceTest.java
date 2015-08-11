		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.JobInfoService;
import com.hkntv.riims.core.model.JobInfoModel;

import java.util.Date;

public class JobInfoServiceTest extends BaseDbTest{

	@Autowired
	private JobInfoService jobInfoService;

	@Test
	public void testCreate() throws Exception {
		JobInfoModel jobInfoModel = new JobInfoModel();
		jobInfoModel.setGuid("f188b");
		jobInfoModel.setUnitId("b5fae");
		jobInfoModel.setLineId("5f57");
		jobInfoModel.setTrackDivision("10962");
		jobInfoModel.setWorkAreaId("eb4a9");
		jobInfoModel.setLineName("bad1624c-0");
		jobInfoModel.setLineDirection("3d");
		jobInfoModel.setTrackId("71a3a757-de2");
		jobInfoModel.setStationId("03fb929");
		jobInfoModel.setTurnoutId("81ef619f-72ae-4a");
		jobInfoModel.setWeldLineId("a7e4122f-32af-4b05-b");
		jobInfoModel.setMileage(0.32187883806092066);
		jobInfoModel.setLeftRightTrack("fd");
		jobInfoModel.setEnteringDate(new Date());
		jobInfoModel.setEnteringPerson("e37f73d9-3405-4803-9");
		jobInfoModel.setDeviceId("26f7a");
		jobInfoModel.setSlightWoundNumber(49162570);
		jobInfoModel.setSevereWoundNumber(51673787);
		jobInfoModel.setTaskId("1966a530-2899-40cf-b");
		String pkValue = jobInfoModel.getGuid();
		saveModel(jobInfoModel);

		JobInfoModel findModel = jobInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(jobInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		JobInfoModel jobInfoModel = new JobInfoModel();
		jobInfoModel.setGuid("0ec10");
		jobInfoModel.setUnitId("2cfcb");
		jobInfoModel.setLineId("882c");
		jobInfoModel.setTrackDivision("40e5a");
		jobInfoModel.setWorkAreaId("95557");
		jobInfoModel.setLineName("bfe5aa38-7");
		jobInfoModel.setLineDirection("68");
		jobInfoModel.setTrackId("d6ce433a-fed");
		jobInfoModel.setStationId("3ab8356");
		jobInfoModel.setTurnoutId("e35a213a-bacd-4e");
		jobInfoModel.setWeldLineId("d0c4ada5-66c0-4ff4-b");
		jobInfoModel.setMileage(0.34036449676714486);
		jobInfoModel.setLeftRightTrack("8d");
		jobInfoModel.setEnteringDate(new Date());
		jobInfoModel.setEnteringPerson("72d1a685-4d61-4501-a");
		jobInfoModel.setDeviceId("18bd0");
		jobInfoModel.setSlightWoundNumber(61936730);
		jobInfoModel.setSevereWoundNumber(36902055);
		jobInfoModel.setTaskId("f8c1fe42-126b-4368-9");
		String pkValue = jobInfoModel.getGuid();
		saveModel(jobInfoModel);

		JobInfoModel findModel = jobInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(jobInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		JobInfoModel jobInfoModel = new JobInfoModel();
		jobInfoModel.setGuid("ad5c8");
		jobInfoModel.setUnitId("fbdf3");
		jobInfoModel.setLineId("e1d9");
		jobInfoModel.setTrackDivision("2b567");
		jobInfoModel.setWorkAreaId("4b5cc");
		jobInfoModel.setLineName("6fac5a99-a");
		jobInfoModel.setLineDirection("f5");
		jobInfoModel.setTrackId("e4914599-fb0");
		jobInfoModel.setStationId("5268651");
		jobInfoModel.setTurnoutId("ee585dc7-d976-4b");
		jobInfoModel.setWeldLineId("d1a39bdc-aeeb-434b-a");
		jobInfoModel.setMileage(0.9535114713170098);
		jobInfoModel.setLeftRightTrack("40");
		jobInfoModel.setEnteringDate(new Date());
		jobInfoModel.setEnteringPerson("8f2c36a6-b056-45d4-8");
		jobInfoModel.setDeviceId("032ae");
		jobInfoModel.setSlightWoundNumber(11337000);
		jobInfoModel.setSevereWoundNumber(94072482);
		jobInfoModel.setTaskId("5793edb7-9411-431b-b");
		String pkValue = jobInfoModel.getGuid();
		saveModel(jobInfoModel);

		//JobInfoModel updateModel = createModel();
		JobInfoModel updateModel = new JobInfoModel();
		updateModel.setGuid("e8e82");
		updateModel.setUnitId("4d40f");
		updateModel.setLineId("0da3");
		updateModel.setTrackDivision("28530");
		updateModel.setWorkAreaId("0f16c");
		updateModel.setLineName("52a1b82c-e");
		updateModel.setLineDirection("f0");
		updateModel.setTrackId("38d1e105-8d4");
		updateModel.setStationId("fa96145");
		updateModel.setTurnoutId("4324b600-3c92-4b");
		updateModel.setWeldLineId("49600f0a-1e80-4446-a");
		updateModel.setMileage(0.01920800946131007);
		updateModel.setLeftRightTrack("4a");
		updateModel.setEnteringDate(new Date());
		updateModel.setEnteringPerson("23d9a262-02a5-4b10-b");
		updateModel.setDeviceId("cbafc");
		updateModel.setSlightWoundNumber(99764910);
		updateModel.setSevereWoundNumber(86236944);
		updateModel.setTaskId("d20286f6-0595-41c2-a");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = jobInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		JobInfoModel findModel = jobInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		JobInfoModel jobInfoModel = new JobInfoModel();
		jobInfoModel.setGuid("870fe");
		jobInfoModel.setUnitId("245ca");
		jobInfoModel.setLineId("0fd8");
		jobInfoModel.setTrackDivision("c9557");
		jobInfoModel.setWorkAreaId("b2aff");
		jobInfoModel.setLineName("dc6addb7-e");
		jobInfoModel.setLineDirection("d8");
		jobInfoModel.setTrackId("0b50d9a3-538");
		jobInfoModel.setStationId("626a265");
		jobInfoModel.setTurnoutId("588e24ab-ecff-45");
		jobInfoModel.setWeldLineId("43c3fdfc-31fb-42a7-b");
		jobInfoModel.setMileage(0.769584648062995);
		jobInfoModel.setLeftRightTrack("c9");
		jobInfoModel.setEnteringDate(new Date());
		jobInfoModel.setEnteringPerson("c5138dda-6c3e-4748-8");
		jobInfoModel.setDeviceId("fe014");
		jobInfoModel.setSlightWoundNumber(34572168);
		jobInfoModel.setSevereWoundNumber(88399291);
		jobInfoModel.setTaskId("edd48b32-286e-431d-b");
		String pkValue = jobInfoModel.getGuid();
		saveModel(jobInfoModel);
	
		Integer deleteResult = jobInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		JobInfoModel findModel = jobInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(JobInfoModel jobInfoModel) throws Exception {
		Integer createResult = jobInfoService.create(jobInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = jobInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private JobInfoModel createModel() {
		JobInfoModel jobInfoModel = new JobInfoModel();
		jobInfoModel.setGuid("70861");
		jobInfoModel.setUnitId("f7e39");
		jobInfoModel.setLineId("970e");
		jobInfoModel.setTrackDivision("f49fd");
		jobInfoModel.setWorkAreaId("21cdd");
		jobInfoModel.setLineName("46337f19-0");
		jobInfoModel.setLineDirection("05");
		jobInfoModel.setTrackId("ab6693d5-e68");
		jobInfoModel.setStationId("bdcb9b9");
		jobInfoModel.setTurnoutId("1247e886-38ab-4b");
		jobInfoModel.setWeldLineId("622bd6d9-5ff5-47a9-9");
		jobInfoModel.setMileage(0.32835818959967955);
		jobInfoModel.setLeftRightTrack("1c");
		jobInfoModel.setEnteringDate(new Date());
		jobInfoModel.setEnteringPerson("747d0fa5-a823-4a4a-a");
		jobInfoModel.setDeviceId("1fcd2");
		jobInfoModel.setSlightWoundNumber(46327811);
		jobInfoModel.setSevereWoundNumber(26583947);
		jobInfoModel.setTaskId("e29e5124-1fc7-48c5-a");
		return jobInfoModel;
	}


}

		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.TrackDivisionInfoService;
import com.hkntv.riims.core.model.TrackDivisionInfoModel;

import java.util.Date;

public class TrackDivisionInfoServiceTest extends BaseDbTest{

	@Autowired
	private TrackDivisionInfoService trackDivisionInfoService;

	@Test
	public void testCreate() throws Exception {
		TrackDivisionInfoModel trackDivisionInfoModel = new TrackDivisionInfoModel();
		trackDivisionInfoModel.setGuid("f6de268f-ba96-4aeb-b4f6-3ed897eb88a2");
		trackDivisionInfoModel.setId("6074a037-bb7b-4");
		trackDivisionInfoModel.setTrackDivisionName("36401");
		trackDivisionInfoModel.setLineId("8312");
		trackDivisionInfoModel.setLineName("d4ecf");
		trackDivisionInfoModel.setLineDirection("cd");
		trackDivisionInfoModel.setStartMileage(0.3408601696792891);
		trackDivisionInfoModel.setEndMileage(0.9124805090783269);
		trackDivisionInfoModel.setExtensionLength(0.21157131574332733);
		trackDivisionInfoModel.setRailLayingDate(new Date());
		trackDivisionInfoModel.setRailType("eadaa2");
		trackDivisionInfoModel.setPreYearPassWeight(0.19154095625672185);
		trackDivisionInfoModel.setMinYearlyInspectionNumber(36536284);
		trackDivisionInfoModel.setFindSevereWound(19248152);
		trackDivisionInfoModel.setExistingWoundNumber(83722586);
		trackDivisionInfoModel.setWoundRate(0.6249477996673818);
		trackDivisionInfoModel.setCurrentRailStatusEvaluate("fb0fcaa1-faf9-4");
		trackDivisionInfoModel.setYearlyInspectionNumber(25780161);
		trackDivisionInfoModel.setInspectionAreaInspBlockNumber(12157503);
		trackDivisionInfoModel.setResponsibleInspecitonArea("cc822");
		trackDivisionInfoModel.setRemark("a6da789f-c722-41f7-911b-3bc3ed2677ac");
		String pkValue = trackDivisionInfoModel.getGuid();
		saveModel(trackDivisionInfoModel);

		TrackDivisionInfoModel findModel = trackDivisionInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(trackDivisionInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		TrackDivisionInfoModel trackDivisionInfoModel = new TrackDivisionInfoModel();
		trackDivisionInfoModel.setGuid("0db546d4-b129-4d63-9a80-cc9858dca9de");
		trackDivisionInfoModel.setId("a1ec9ed5-4228-4");
		trackDivisionInfoModel.setTrackDivisionName("78506");
		trackDivisionInfoModel.setLineId("4d69");
		trackDivisionInfoModel.setLineName("2d543");
		trackDivisionInfoModel.setLineDirection("dd");
		trackDivisionInfoModel.setStartMileage(0.09579248900803294);
		trackDivisionInfoModel.setEndMileage(0.584705489078756);
		trackDivisionInfoModel.setExtensionLength(0.4590098028648719);
		trackDivisionInfoModel.setRailLayingDate(new Date());
		trackDivisionInfoModel.setRailType("a46a16");
		trackDivisionInfoModel.setPreYearPassWeight(0.1425392716926025);
		trackDivisionInfoModel.setMinYearlyInspectionNumber(80325554);
		trackDivisionInfoModel.setFindSevereWound(64507695);
		trackDivisionInfoModel.setExistingWoundNumber(27681370);
		trackDivisionInfoModel.setWoundRate(0.9724380192599262);
		trackDivisionInfoModel.setCurrentRailStatusEvaluate("dd916c51-8862-4");
		trackDivisionInfoModel.setYearlyInspectionNumber(68643783);
		trackDivisionInfoModel.setInspectionAreaInspBlockNumber(64971337);
		trackDivisionInfoModel.setResponsibleInspecitonArea("7afd3");
		trackDivisionInfoModel.setRemark("a04a2b45-8e40-4fd0-8251-75f0b64f9f70");
		String pkValue = trackDivisionInfoModel.getGuid();
		saveModel(trackDivisionInfoModel);

		TrackDivisionInfoModel findModel = trackDivisionInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(trackDivisionInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		TrackDivisionInfoModel trackDivisionInfoModel = new TrackDivisionInfoModel();
		trackDivisionInfoModel.setGuid("55729c1c-7c6d-4b89-82ee-95c8a79eee34");
		trackDivisionInfoModel.setId("b427a589-9cfa-4");
		trackDivisionInfoModel.setTrackDivisionName("6b515");
		trackDivisionInfoModel.setLineId("a20d");
		trackDivisionInfoModel.setLineName("06d8b");
		trackDivisionInfoModel.setLineDirection("a2");
		trackDivisionInfoModel.setStartMileage(0.20773289159158892);
		trackDivisionInfoModel.setEndMileage(0.0526397335230141);
		trackDivisionInfoModel.setExtensionLength(0.7440977675579372);
		trackDivisionInfoModel.setRailLayingDate(new Date());
		trackDivisionInfoModel.setRailType("642a73");
		trackDivisionInfoModel.setPreYearPassWeight(0.5841444991469726);
		trackDivisionInfoModel.setMinYearlyInspectionNumber(40365851);
		trackDivisionInfoModel.setFindSevereWound(95915810);
		trackDivisionInfoModel.setExistingWoundNumber(34420167);
		trackDivisionInfoModel.setWoundRate(0.44794669810517396);
		trackDivisionInfoModel.setCurrentRailStatusEvaluate("b6e88b15-01fc-4");
		trackDivisionInfoModel.setYearlyInspectionNumber(86944877);
		trackDivisionInfoModel.setInspectionAreaInspBlockNumber(18210542);
		trackDivisionInfoModel.setResponsibleInspecitonArea("4a134");
		trackDivisionInfoModel.setRemark("427abdb8-65cc-4597-beab-990da5155608");
		String pkValue = trackDivisionInfoModel.getGuid();
		saveModel(trackDivisionInfoModel);

		//TrackDivisionInfoModel updateModel = createModel();
		TrackDivisionInfoModel updateModel = new TrackDivisionInfoModel();
		updateModel.setGuid("05964cf3-8084-4f09-b480-bb01e83182ef");
		updateModel.setId("4cddcdf9-592d-4");
		updateModel.setTrackDivisionName("e91c7");
		updateModel.setLineId("7021");
		updateModel.setLineName("04c9d");
		updateModel.setLineDirection("e4");
		updateModel.setStartMileage(0.7260852268957168);
		updateModel.setEndMileage(0.7414709479037365);
		updateModel.setExtensionLength(0.22583080052735294);
		updateModel.setRailLayingDate(new Date());
		updateModel.setRailType("a79842");
		updateModel.setPreYearPassWeight(0.4662395297858265);
		updateModel.setMinYearlyInspectionNumber(62907356);
		updateModel.setFindSevereWound(80559031);
		updateModel.setExistingWoundNumber(43867939);
		updateModel.setWoundRate(0.6264519933989945);
		updateModel.setCurrentRailStatusEvaluate("287db094-3cdd-4");
		updateModel.setYearlyInspectionNumber(32202992);
		updateModel.setInspectionAreaInspBlockNumber(74533326);
		updateModel.setResponsibleInspecitonArea("e05b4");
		updateModel.setRemark("96c5b15f-a9cc-4635-8b0b-80f09847808a");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = trackDivisionInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		TrackDivisionInfoModel findModel = trackDivisionInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		TrackDivisionInfoModel trackDivisionInfoModel = new TrackDivisionInfoModel();
		trackDivisionInfoModel.setGuid("ec529549-4b85-4c11-8d17-6574492aec0c");
		trackDivisionInfoModel.setId("239f1a65-b6d9-4");
		trackDivisionInfoModel.setTrackDivisionName("f5cf9");
		trackDivisionInfoModel.setLineId("e213");
		trackDivisionInfoModel.setLineName("07ad4");
		trackDivisionInfoModel.setLineDirection("6c");
		trackDivisionInfoModel.setStartMileage(0.5922680946138595);
		trackDivisionInfoModel.setEndMileage(0.7676268767644522);
		trackDivisionInfoModel.setExtensionLength(0.9190244702718955);
		trackDivisionInfoModel.setRailLayingDate(new Date());
		trackDivisionInfoModel.setRailType("3b1d55");
		trackDivisionInfoModel.setPreYearPassWeight(0.054628828590528866);
		trackDivisionInfoModel.setMinYearlyInspectionNumber(35057862);
		trackDivisionInfoModel.setFindSevereWound(37945238);
		trackDivisionInfoModel.setExistingWoundNumber(64686766);
		trackDivisionInfoModel.setWoundRate(0.9934834054073419);
		trackDivisionInfoModel.setCurrentRailStatusEvaluate("b0f9c9de-b5a2-4");
		trackDivisionInfoModel.setYearlyInspectionNumber(11224029);
		trackDivisionInfoModel.setInspectionAreaInspBlockNumber(98522934);
		trackDivisionInfoModel.setResponsibleInspecitonArea("5d63f");
		trackDivisionInfoModel.setRemark("4d29bd9f-34fb-43d8-8757-e56113f4e293");
		String pkValue = trackDivisionInfoModel.getGuid();
		saveModel(trackDivisionInfoModel);
	
		Integer deleteResult = trackDivisionInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		TrackDivisionInfoModel findModel = trackDivisionInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(TrackDivisionInfoModel trackDivisionInfoModel) throws Exception {
		Integer createResult = trackDivisionInfoService.create(trackDivisionInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = trackDivisionInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private TrackDivisionInfoModel createModel() {
		TrackDivisionInfoModel trackDivisionInfoModel = new TrackDivisionInfoModel();
		trackDivisionInfoModel.setGuid("b3469dc6-be6d-460b-86df-95041be2ce1c");
		trackDivisionInfoModel.setId("612de77d-e95c-4");
		trackDivisionInfoModel.setTrackDivisionName("3d501");
		trackDivisionInfoModel.setLineId("6aab");
		trackDivisionInfoModel.setLineName("b865c");
		trackDivisionInfoModel.setLineDirection("45");
		trackDivisionInfoModel.setStartMileage(0.6230551553484566);
		trackDivisionInfoModel.setEndMileage(0.6722339298780193);
		trackDivisionInfoModel.setExtensionLength(0.10977057259044887);
		trackDivisionInfoModel.setRailLayingDate(new Date());
		trackDivisionInfoModel.setRailType("41bb29");
		trackDivisionInfoModel.setPreYearPassWeight(0.6820951305632386);
		trackDivisionInfoModel.setMinYearlyInspectionNumber(77203723);
		trackDivisionInfoModel.setFindSevereWound(66805249);
		trackDivisionInfoModel.setExistingWoundNumber(33562880);
		trackDivisionInfoModel.setWoundRate(0.7346076824302341);
		trackDivisionInfoModel.setCurrentRailStatusEvaluate("df600a5b-2cca-4");
		trackDivisionInfoModel.setYearlyInspectionNumber(57939705);
		trackDivisionInfoModel.setInspectionAreaInspBlockNumber(30402297);
		trackDivisionInfoModel.setResponsibleInspecitonArea("621f0");
		trackDivisionInfoModel.setRemark("425371d4-9629-4a2f-a6da-9f1455100bd9");
		return trackDivisionInfoModel;
	}


}

		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.LineInfoService;
import com.hkntv.riims.core.model.LineInfoModel;

import java.util.Date;

public class LineInfoServiceTest extends BaseDbTest{

	@Autowired
	private LineInfoService lineInfoService;

	@Test
	public void testCreate() throws Exception {
		LineInfoModel lineInfoModel = new LineInfoModel();
		lineInfoModel.setGuid("53851d19-4cd9-418f-a83d-5c729c9a9ab9");
		lineInfoModel.setId("7918");
		lineInfoModel.setLineName("e3f0f");
		lineInfoModel.setLineDirection("d8");
		lineInfoModel.setStartMileage(0.7387903377771321);
		lineInfoModel.setEndMileage(0.604517077077108);
		lineInfoModel.setExtensionLength(0.4541633366537222);
		lineInfoModel.setRailLayingDate(new Date());
		lineInfoModel.setRailType("b86283");
		lineInfoModel.setPreYearPassWeight(0.8717553854745193);
		lineInfoModel.setMinYearlyInspectionNumber(32591092);
		lineInfoModel.setFindSevereWound(22868224);
		lineInfoModel.setExistingWoundNumber(85503593);
		lineInfoModel.setWoundRate(0.709906756076391);
		lineInfoModel.setCurrentRailStatusEvaluate("23c964e9-00d7-4");
		lineInfoModel.setYearlyInspectionNumber(60284123);
		lineInfoModel.setInspectionAreaInspBlockNumber(95690090);
		lineInfoModel.setResponsibleInspecitonArea("d5dea");
		lineInfoModel.setRemark("29498b6a-6b06-4502-be9a-c4e4ed0c85ee");
		String pkValue = lineInfoModel.getGuid();
		saveModel(lineInfoModel);

		LineInfoModel findModel = lineInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(lineInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		LineInfoModel lineInfoModel = new LineInfoModel();
		lineInfoModel.setGuid("e1995f7d-eda0-491d-8a24-fb12eefaf2ca");
		lineInfoModel.setId("f422");
		lineInfoModel.setLineName("7ca1c");
		lineInfoModel.setLineDirection("72");
		lineInfoModel.setStartMileage(0.7839132403645463);
		lineInfoModel.setEndMileage(0.3987360446878109);
		lineInfoModel.setExtensionLength(0.5555286357747653);
		lineInfoModel.setRailLayingDate(new Date());
		lineInfoModel.setRailType("ab796f");
		lineInfoModel.setPreYearPassWeight(0.9626971911912748);
		lineInfoModel.setMinYearlyInspectionNumber(83598962);
		lineInfoModel.setFindSevereWound(71801723);
		lineInfoModel.setExistingWoundNumber(28916328);
		lineInfoModel.setWoundRate(0.23739790905502456);
		lineInfoModel.setCurrentRailStatusEvaluate("7980783d-856b-4");
		lineInfoModel.setYearlyInspectionNumber(41478411);
		lineInfoModel.setInspectionAreaInspBlockNumber(46968695);
		lineInfoModel.setResponsibleInspecitonArea("dde1a");
		lineInfoModel.setRemark("662560ee-1dd6-4d52-a0b3-0216996f1848");
		String pkValue = lineInfoModel.getGuid();
		saveModel(lineInfoModel);

		LineInfoModel findModel = lineInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(lineInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		LineInfoModel lineInfoModel = new LineInfoModel();
		lineInfoModel.setGuid("3e4c10f0-78f8-4542-8be6-04f588237563");
		lineInfoModel.setId("2756");
		lineInfoModel.setLineName("c5061");
		lineInfoModel.setLineDirection("e8");
		lineInfoModel.setStartMileage(0.14549493541432768);
		lineInfoModel.setEndMileage(0.3360996108088796);
		lineInfoModel.setExtensionLength(0.21142305748305534);
		lineInfoModel.setRailLayingDate(new Date());
		lineInfoModel.setRailType("7b4e0e");
		lineInfoModel.setPreYearPassWeight(0.9067227971059386);
		lineInfoModel.setMinYearlyInspectionNumber(42590700);
		lineInfoModel.setFindSevereWound(77927402);
		lineInfoModel.setExistingWoundNumber(55452864);
		lineInfoModel.setWoundRate(0.8500293636984254);
		lineInfoModel.setCurrentRailStatusEvaluate("efff71dc-6b6f-4");
		lineInfoModel.setYearlyInspectionNumber(90899419);
		lineInfoModel.setInspectionAreaInspBlockNumber(91421376);
		lineInfoModel.setResponsibleInspecitonArea("c751f");
		lineInfoModel.setRemark("0ace6c10-8051-4d0b-bb11-725219dd69d0");
		String pkValue = lineInfoModel.getGuid();
		saveModel(lineInfoModel);

		//LineInfoModel updateModel = createModel();
		LineInfoModel updateModel = new LineInfoModel();
		updateModel.setGuid("5b9b4fd2-1ea1-4a30-807a-4b299630b995");
		updateModel.setId("6a17");
		updateModel.setLineName("03821");
		updateModel.setLineDirection("7d");
		updateModel.setStartMileage(0.284209480659496);
		updateModel.setEndMileage(0.5504586075528308);
		updateModel.setExtensionLength(0.9871338121493248);
		updateModel.setRailLayingDate(new Date());
		updateModel.setRailType("5388b2");
		updateModel.setPreYearPassWeight(0.6079278596429719);
		updateModel.setMinYearlyInspectionNumber(94558783);
		updateModel.setFindSevereWound(26312983);
		updateModel.setExistingWoundNumber(90559927);
		updateModel.setWoundRate(0.4527705300363797);
		updateModel.setCurrentRailStatusEvaluate("21d0c7b4-fd39-4");
		updateModel.setYearlyInspectionNumber(19493005);
		updateModel.setInspectionAreaInspBlockNumber(65438142);
		updateModel.setResponsibleInspecitonArea("9e451");
		updateModel.setRemark("ab4d472d-35e3-413f-ac59-fc5dabb40862");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = lineInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		LineInfoModel findModel = lineInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		LineInfoModel lineInfoModel = new LineInfoModel();
		lineInfoModel.setGuid("49b34a28-39a0-442c-869f-867012a3d559");
		lineInfoModel.setId("cbc1");
		lineInfoModel.setLineName("87dfc");
		lineInfoModel.setLineDirection("37");
		lineInfoModel.setStartMileage(0.5317072276135106);
		lineInfoModel.setEndMileage(0.5674842275580331);
		lineInfoModel.setExtensionLength(0.8270422307197172);
		lineInfoModel.setRailLayingDate(new Date());
		lineInfoModel.setRailType("a08d75");
		lineInfoModel.setPreYearPassWeight(0.5360586319141157);
		lineInfoModel.setMinYearlyInspectionNumber(16512744);
		lineInfoModel.setFindSevereWound(87128512);
		lineInfoModel.setExistingWoundNumber(77794726);
		lineInfoModel.setWoundRate(0.012146711364777074);
		lineInfoModel.setCurrentRailStatusEvaluate("ef164ae2-4083-4");
		lineInfoModel.setYearlyInspectionNumber(63088675);
		lineInfoModel.setInspectionAreaInspBlockNumber(16825043);
		lineInfoModel.setResponsibleInspecitonArea("beb46");
		lineInfoModel.setRemark("e29ff886-e148-4631-929f-769d4232e040");
		String pkValue = lineInfoModel.getGuid();
		saveModel(lineInfoModel);
	
		Integer deleteResult = lineInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		LineInfoModel findModel = lineInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(LineInfoModel lineInfoModel) throws Exception {
		Integer createResult = lineInfoService.create(lineInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = lineInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private LineInfoModel createModel() {
		LineInfoModel lineInfoModel = new LineInfoModel();
		lineInfoModel.setGuid("bcfc0a82-135c-41fb-a8b9-5e40ae0f955b");
		lineInfoModel.setId("e9f3");
		lineInfoModel.setLineName("3587b");
		lineInfoModel.setLineDirection("8f");
		lineInfoModel.setStartMileage(0.3651886474602509);
		lineInfoModel.setEndMileage(0.5552492925394984);
		lineInfoModel.setExtensionLength(0.7285521524753014);
		lineInfoModel.setRailLayingDate(new Date());
		lineInfoModel.setRailType("fbd61c");
		lineInfoModel.setPreYearPassWeight(0.001567086722987554);
		lineInfoModel.setMinYearlyInspectionNumber(47123437);
		lineInfoModel.setFindSevereWound(18917436);
		lineInfoModel.setExistingWoundNumber(40440586);
		lineInfoModel.setWoundRate(0.4209501482026883);
		lineInfoModel.setCurrentRailStatusEvaluate("e30ba848-462d-4");
		lineInfoModel.setYearlyInspectionNumber(83488887);
		lineInfoModel.setInspectionAreaInspBlockNumber(84972878);
		lineInfoModel.setResponsibleInspecitonArea("9f7f3");
		lineInfoModel.setRemark("1f532da0-a530-4b50-b860-5fb58f2e9643");
		return lineInfoModel;
	}


}

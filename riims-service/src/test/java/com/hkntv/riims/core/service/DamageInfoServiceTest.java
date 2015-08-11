		package com.hkntv.riims.core.service;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.model.DamageInfoModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DamageInfoServiceTest extends BaseDbTest{

	@Autowired
	private DamageInfoService damageInfoService;

	@Test
	public void testCreate() throws Exception {
		DamageInfoModel damageInfoModel = new DamageInfoModel();
		damageInfoModel.setGuid("bc7d4573-41e6-4b39-af8d-d8db2e75403b");
		damageInfoModel.setUnitId("1af32");
		damageInfoModel.setWorkAreaId("cd514");
		damageInfoModel.setLineId("7cd5");
		damageInfoModel.setLineDirection("9b");
		damageInfoModel.setTrackId("acbd97f0-36c");
		damageInfoModel.setStationId("85cb971");
		damageInfoModel.setTurnoutId("d8baf452-9620-46");
		damageInfoModel.setAlarmChannel("41f68238-eda9-4592-a");
		damageInfoModel.setStationType("d4ec2f97-7");
		damageInfoModel.setWeldId("9c926dab-6b73-46e3-8");
		damageInfoModel.setTeamId("94bdd");
		damageInfoModel.setMileage("K0+222.33");
		damageInfoModel.setLeftRightTrack("92");
		damageInfoModel.setFindTime(new Date());
		damageInfoModel.setFindPersonId("d7bae9e5-de3a-4f17-b");
		damageInfoModel.setDamageType("35c76");
		damageInfoModel.setDamageStatus("388df");
		damageInfoModel.setDamageId("222e2091-2685-4522-a892-68a3549fdee9");
		damageInfoModel.setInspectionCarId("759e9982-3a58-4668-9acf-b048deadb247");
		damageInfoModel.setRailId("73c07e8b-a145-45");
		damageInfoModel.setUploadPersonId("a2c7d325-851a-4344-8");
		damageInfoModel.setUploadDate(new Date());
		damageInfoModel.setIsWeldType("1ae795e0-d");
		damageInfoModel.setImagePath("dce61e3c-1256-4d57-8927-2f8ff79dd315");
		damageInfoModel.setWeldType("dc560");
		damageInfoModel.setIsTurnout("44539");
		damageInfoModel.setRailType("a2035");
		String pkValue = damageInfoModel.getGuid();
		saveModel(damageInfoModel);

		DamageInfoModel findModel = damageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(damageInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		DamageInfoModel damageInfoModel = new DamageInfoModel();
		damageInfoModel.setGuid("147d0340-9609-481b-bb2e-754c5352ba6d");
		damageInfoModel.setUnitId("e1ede");
		damageInfoModel.setWorkAreaId("71004");
		damageInfoModel.setLineId("0b7e");
		damageInfoModel.setLineDirection("8d");
		damageInfoModel.setTrackId("8f90c5f0-3f9");
		damageInfoModel.setStationId("2797669");
		damageInfoModel.setTurnoutId("79b244e1-cc65-42");
		damageInfoModel.setAlarmChannel("5db5c05a-04cd-4ea3-8");
		damageInfoModel.setStationType("a0adb418-d");
		damageInfoModel.setWeldId("12e4bea1-9473-4964-8");
		damageInfoModel.setTeamId("ea38f");
		damageInfoModel.setMileage("K0+222.33");
		damageInfoModel.setLeftRightTrack("71");
		damageInfoModel.setFindTime(new Date());
		damageInfoModel.setFindPersonId("0298d7ef-442d-47f7-9");
		damageInfoModel.setDamageType("41fb6");
		damageInfoModel.setDamageStatus("03cd0");
		damageInfoModel.setDamageId("47cc6c16-76b4-4d77-abbd-f377d0cf641d");
		damageInfoModel.setInspectionCarId("09c4e957-c68e-4a05-b9f9-34717745f152");
		damageInfoModel.setRailId("422fd13d-96b1-48");
		damageInfoModel.setUploadPersonId("aee95d7b-6d24-468e-a");
		damageInfoModel.setUploadDate(new Date());
		damageInfoModel.setIsWeldType("3ade5faf-b");
		damageInfoModel.setImagePath("d241460f-b8bc-4bbe-b88e-b08eda99e8b7");
		damageInfoModel.setWeldType("868a3");
		damageInfoModel.setIsTurnout("93dd4");
		damageInfoModel.setRailType("bfb79");
		String pkValue = damageInfoModel.getGuid();
		saveModel(damageInfoModel);

		DamageInfoModel findModel = damageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(damageInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		DamageInfoModel damageInfoModel = new DamageInfoModel();
		damageInfoModel.setGuid("dd4c6184-2c34-4163-989c-15fbf3d70ffd");
		damageInfoModel.setUnitId("70244");
		damageInfoModel.setWorkAreaId("c6e7f");
		damageInfoModel.setLineId("5402");
		damageInfoModel.setLineDirection("36");
		damageInfoModel.setTrackId("ed09a16c-423");
		damageInfoModel.setStationId("1f033a1");
		damageInfoModel.setTurnoutId("2491507c-2395-47");
		damageInfoModel.setAlarmChannel("2b787e9d-2585-4f89-b");
		damageInfoModel.setStationType("853cab8b-2");
		damageInfoModel.setWeldId("c200189d-713d-43b8-9");
		damageInfoModel.setTeamId("97fd6");
		damageInfoModel.setMileage("K0+222.33");
		damageInfoModel.setLeftRightTrack("a5");
		damageInfoModel.setFindTime(new Date());
		damageInfoModel.setFindPersonId("8111ea30-fb9a-4a1e-a");
		damageInfoModel.setDamageType("ebe60");
		damageInfoModel.setDamageStatus("9e90f");
		damageInfoModel.setDamageId("dfcef998-c65c-4374-bf2e-e98f8bf776a8");
		damageInfoModel.setInspectionCarId("cea8291b-f05a-48f8-b980-b854c625d7b6");
		damageInfoModel.setRailId("f962a44f-7bc2-47");
		damageInfoModel.setUploadPersonId("8183eb7b-ced0-4f5b-8");
		damageInfoModel.setUploadDate(new Date());
		damageInfoModel.setIsWeldType("116de3fc-d");
		damageInfoModel.setImagePath("4fc018b6-9a73-4042-9699-88f4c40ddb22");
		damageInfoModel.setWeldType("49f89");
		damageInfoModel.setIsTurnout("a958e");
		damageInfoModel.setRailType("25d30");
		String pkValue = damageInfoModel.getGuid();
		saveModel(damageInfoModel);

		//DamageInfoModel updateModel = createModel();
		DamageInfoModel updateModel = new DamageInfoModel();
		updateModel.setGuid("991b9f22-6d97-4881-b06e-206588067b76");
		updateModel.setUnitId("1e31c");
		updateModel.setWorkAreaId("6a98c");
		updateModel.setLineId("7082");
		updateModel.setLineDirection("f0");
		updateModel.setTrackId("f190c50b-272");
		updateModel.setStationId("a914fdf");
		updateModel.setTurnoutId("6fa53f07-c98c-4c");
		updateModel.setAlarmChannel("ae79bf7f-bc57-4d05-8");
		updateModel.setStationType("17b17f5d-b");
		updateModel.setWeldId("e19a6a8b-a072-4586-9");
		updateModel.setTeamId("51eb6");
		updateModel.setMileage("K0+222.33");
		updateModel.setLeftRightTrack("4b");
		updateModel.setFindTime(new Date());
		updateModel.setFindPersonId("5be7193b-4f65-4ec1-a");
		updateModel.setDamageType("0e03d");
		updateModel.setDamageStatus("97843");
		updateModel.setDamageId("48d21319-fee5-4063-8c62-eec7601cf342");
		updateModel.setInspectionCarId("b032ec2f-399b-4ac4-8a8a-558fc3bc3d0f");
		updateModel.setRailId("b40b1ab2-b6a3-40");
		updateModel.setUploadPersonId("9785e926-3cc7-421e-9");
		updateModel.setUploadDate(new Date());
		updateModel.setIsWeldType("0eb1df1c-b");
		updateModel.setImagePath("60110097-99a8-4127-bd8c-54fb330285c2");
		updateModel.setWeldType("1dbb4");
		updateModel.setIsTurnout("bcbf0");
		updateModel.setRailType("256d9");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = damageInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		DamageInfoModel findModel = damageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		DamageInfoModel damageInfoModel = new DamageInfoModel();
		damageInfoModel.setGuid("9a8e9cb6-7fa6-445a-99b5-956f37422cc6");
		damageInfoModel.setUnitId("c7dc4");
		damageInfoModel.setWorkAreaId("00a0f");
		damageInfoModel.setLineId("7b06");
		damageInfoModel.setLineDirection("1f");
		damageInfoModel.setTrackId("a4785064-764");
		damageInfoModel.setStationId("5fbadaa");
		damageInfoModel.setTurnoutId("c9ec6df5-f291-43");
		damageInfoModel.setAlarmChannel("9db245d4-39c8-4ea3-a");
		damageInfoModel.setStationType("68a29955-a");
		damageInfoModel.setWeldId("52b34e48-609c-468a-a");
		damageInfoModel.setTeamId("b5b2d");
		damageInfoModel.setMileage("K0+222.33");
		damageInfoModel.setLeftRightTrack("1d");
		damageInfoModel.setFindTime(new Date());
		damageInfoModel.setFindPersonId("ac4190ab-e4f9-44ce-b");
		damageInfoModel.setDamageType("a7b93");
		damageInfoModel.setDamageStatus("0c712");
		damageInfoModel.setDamageId("289459c6-2fde-4ed7-85fa-8b0f4766351e");
		damageInfoModel.setInspectionCarId("5789cc51-8a92-414d-b215-94dfbfa2b668");
		damageInfoModel.setRailId("6793a1ec-528f-45");
		damageInfoModel.setUploadPersonId("345b6f04-ff52-433c-b");
		damageInfoModel.setUploadDate(new Date());
		damageInfoModel.setIsWeldType("4b215bc2-9");
		damageInfoModel.setImagePath("1fbcce6c-7b8c-4636-902f-571b56f7d118");
		damageInfoModel.setWeldType("89dd0");
		damageInfoModel.setIsTurnout("33b3c");
		damageInfoModel.setRailType("ebb06");
		String pkValue = damageInfoModel.getGuid();
		saveModel(damageInfoModel);
	
		Integer deleteResult = damageInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		DamageInfoModel findModel = damageInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(DamageInfoModel damageInfoModel) throws Exception {
		Integer createResult = damageInfoService.create(damageInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = damageInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private DamageInfoModel createModel() {
		DamageInfoModel damageInfoModel = new DamageInfoModel();
		damageInfoModel.setGuid("f34f03fa-c15f-437a-ab65-c3161dd60c7c");
		damageInfoModel.setUnitId("3d9bf");
		damageInfoModel.setWorkAreaId("0e3ad");
		damageInfoModel.setLineId("79d1");
		damageInfoModel.setLineDirection("71");
		damageInfoModel.setTrackId("ac666edb-941");
		damageInfoModel.setStationId("0264789");
		damageInfoModel.setTurnoutId("194b7ace-46b6-41");
		damageInfoModel.setAlarmChannel("aa0222c9-76d9-46b1-b");
		damageInfoModel.setStationType("717c868c-6");
		damageInfoModel.setWeldId("c9062e1a-51c5-4ad9-9");
		damageInfoModel.setTeamId("23877");
		damageInfoModel.setMileage("K0+222.33");
		damageInfoModel.setLeftRightTrack("39");
		damageInfoModel.setFindTime(new Date());
		damageInfoModel.setFindPersonId("2defaf5b-0958-446b-9");
		damageInfoModel.setDamageType("fefb6");
		damageInfoModel.setDamageStatus("14741");
		damageInfoModel.setDamageId("c877065a-4c20-4417-bb6a-1949837054cc");
		damageInfoModel.setInspectionCarId("7f893d10-03d4-417b-b2ea-2238c7ce09d2");
		damageInfoModel.setRailId("0426fbbe-45d2-4c");
		damageInfoModel.setUploadPersonId("994e07d4-2ed7-4846-a");
		damageInfoModel.setUploadDate(new Date());
		damageInfoModel.setIsWeldType("90db7600-8");
		damageInfoModel.setImagePath("e52032f3-ddac-43df-8547-75052e144db4");
		damageInfoModel.setWeldType("bca46");
		damageInfoModel.setIsTurnout("9cf59");
		damageInfoModel.setRailType("19ad1");
		return damageInfoModel;
	}


}

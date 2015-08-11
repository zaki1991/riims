		package com.hkntv.riims.core.service;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.model.OrDamageInfoModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OrDamageInfoServiceTest extends BaseDbTest{

	@Autowired
	private OrDamageInfoService orDamageInfoService;

	@Test
	public void testCreate() throws Exception {
		OrDamageInfoModel orDamageInfoModel = new OrDamageInfoModel();
		orDamageInfoModel.setGuid("6f11ead8-dc2d-45ea-902b-23be86d5fdd8");
		orDamageInfoModel.setUnitId("75847");
		orDamageInfoModel.setWorkAreaId("166cc");
		orDamageInfoModel.setLineId("1791");
		orDamageInfoModel.setLineDirection("28");
		orDamageInfoModel.setTrackId("d1a1419d-918");
		orDamageInfoModel.setStationId("73a9fd8");
		orDamageInfoModel.setTurnoutId("7c331435-6977-46");
		orDamageInfoModel.setAlarmChannel("e41764d4-b308-4699-b");
		orDamageInfoModel.setStationType("15dacbf7-5");
		orDamageInfoModel.setWeldId("90a1d9d9-b871-4241-a");
		orDamageInfoModel.setTeamId("cbbcd");
		orDamageInfoModel.setMileage("K0+222.33");
		orDamageInfoModel.setLeftRightTrack("42");
		orDamageInfoModel.setUploadDate(new Date());
		orDamageInfoModel.setFindTime(new Date());
		orDamageInfoModel.setUploadPersonId("d9df8dce-430c-463d-b");
		orDamageInfoModel.setFindPersonId("0d193ab0-087b-4d68-b");
		orDamageInfoModel.setDamageType("cc341");
		orDamageInfoModel.setDamageStatus("3178c");
		orDamageInfoModel.setDamageId("2406118b-cd8b-41f6-9de8-168b4cb46809");
		orDamageInfoModel.setInspectionCarId("2f971751-5730-44b8-9f73-3d0b06eee79a");
		orDamageInfoModel.setRailId("c53a317c-cd80-49");
		orDamageInfoModel.setImagePath("88f13b09-563e-4347-9d20-0267160c87a9");
		orDamageInfoModel.setWeldType("a1c24");
		orDamageInfoModel.setIsTurnout("65cae");
		orDamageInfoModel.setIsWeldType("9979c8ad-1");
		orDamageInfoModel.setRailType("22c5c");
		String pkValue = orDamageInfoModel.getGuid();
		saveModel(orDamageInfoModel);

		OrDamageInfoModel findModel = orDamageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(orDamageInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		OrDamageInfoModel orDamageInfoModel = new OrDamageInfoModel();
		orDamageInfoModel.setGuid("a41fbcf7-8b1e-4d18-9df6-0df1f71b8ebd");
		orDamageInfoModel.setUnitId("d6fd3");
		orDamageInfoModel.setWorkAreaId("9c079");
		orDamageInfoModel.setLineId("96f6");
		orDamageInfoModel.setLineDirection("45");
		orDamageInfoModel.setTrackId("17c8164d-25b");
		orDamageInfoModel.setStationId("6dc05ae");
		orDamageInfoModel.setTurnoutId("9aa3b390-0c82-4c");
		orDamageInfoModel.setAlarmChannel("613739d8-1194-4a2e-b");
		orDamageInfoModel.setStationType("529e7169-a");
		orDamageInfoModel.setWeldId("6437dcf0-aeca-46f8-8");
		orDamageInfoModel.setTeamId("cc1db");
		orDamageInfoModel.setMileage("K0+222.33");
		orDamageInfoModel.setLeftRightTrack("42");
		orDamageInfoModel.setUploadDate(new Date());
		orDamageInfoModel.setFindTime(new Date());
		orDamageInfoModel.setUploadPersonId("67b06b44-8470-4a36-b");
		orDamageInfoModel.setFindPersonId("89ffde73-c89a-4859-9");
		orDamageInfoModel.setDamageType("4462b");
		orDamageInfoModel.setDamageStatus("840c9");
		orDamageInfoModel.setDamageId("934f1247-c071-4980-a1ce-96d2590ce483");
		orDamageInfoModel.setInspectionCarId("baf7c616-95f4-4b7a-ba4d-115526f11d08");
		orDamageInfoModel.setRailId("8b6f6282-475d-4e");
		orDamageInfoModel.setImagePath("645946b4-2fa4-4942-a98a-8afbd27330c3");
		orDamageInfoModel.setWeldType("249e3");
		orDamageInfoModel.setIsTurnout("874f6");
		orDamageInfoModel.setIsWeldType("4e61de6f-6");
		orDamageInfoModel.setRailType("d9319");
		String pkValue = orDamageInfoModel.getGuid();
		saveModel(orDamageInfoModel);

		OrDamageInfoModel findModel = orDamageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(orDamageInfoModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		OrDamageInfoModel orDamageInfoModel = new OrDamageInfoModel();
		orDamageInfoModel.setGuid("c95507e6-e520-4281-8eda-126308204f57");
		orDamageInfoModel.setUnitId("0a8e8");
		orDamageInfoModel.setWorkAreaId("fb5be");
		orDamageInfoModel.setLineId("9b5d");
		orDamageInfoModel.setLineDirection("cf");
		orDamageInfoModel.setTrackId("fad58bb0-669");
		orDamageInfoModel.setStationId("2ff7213");
		orDamageInfoModel.setTurnoutId("9edf6199-6cd2-4b");
		orDamageInfoModel.setAlarmChannel("eb031d80-002f-4dd0-9");
		orDamageInfoModel.setStationType("dd6b8d65-2");
		orDamageInfoModel.setWeldId("6437ed2f-2cb4-41b5-b");
		orDamageInfoModel.setTeamId("b6147");
		orDamageInfoModel.setMileage("K0+222.33");
		orDamageInfoModel.setLeftRightTrack("ac");
		orDamageInfoModel.setUploadDate(new Date());
		orDamageInfoModel.setFindTime(new Date());
		orDamageInfoModel.setUploadPersonId("b4911baa-d52c-48da-a");
		orDamageInfoModel.setFindPersonId("77d206ec-3d65-4def-8");
		orDamageInfoModel.setDamageType("20ee8");
		orDamageInfoModel.setDamageStatus("75c1b");
		orDamageInfoModel.setDamageId("83780737-789f-4803-bcf6-44e7f04f7f37");
		orDamageInfoModel.setInspectionCarId("b0d0f16f-6393-4985-8263-1f06bce481c5");
		orDamageInfoModel.setRailId("88136195-2d59-4d");
		orDamageInfoModel.setImagePath("a5e63f61-2651-4e01-8b65-110be32bba5f");
		orDamageInfoModel.setWeldType("6115c");
		orDamageInfoModel.setIsTurnout("22966");
		orDamageInfoModel.setIsWeldType("bf99e574-c");
		orDamageInfoModel.setRailType("8f1e8");
		String pkValue = orDamageInfoModel.getGuid();
		saveModel(orDamageInfoModel);

		//OrDamageInfoModel updateModel = createModel();
		OrDamageInfoModel updateModel = new OrDamageInfoModel();
		updateModel.setGuid("99235541-7807-4962-9c2c-0bb1a88ecb89");
		updateModel.setUnitId("adbf9");
		updateModel.setWorkAreaId("5d028");
		updateModel.setLineId("5030");
		updateModel.setLineDirection("57");
		updateModel.setTrackId("c34cf432-2d4");
		updateModel.setStationId("7b9e6c5");
		updateModel.setTurnoutId("111eb71c-d115-4a");
		updateModel.setAlarmChannel("b296e5bc-c75a-4e27-b");
		updateModel.setStationType("855b48fc-3");
		updateModel.setWeldId("0e1cf915-086f-411d-b");
		updateModel.setTeamId("14bbd");
		updateModel.setMileage("K0+222.33");
		updateModel.setLeftRightTrack("6c");
		updateModel.setUploadDate(new Date());
		updateModel.setFindTime(new Date());
		updateModel.setUploadPersonId("1f8e5d5d-184b-4436-a");
		updateModel.setFindPersonId("1b356384-c4e7-4723-9");
		updateModel.setDamageType("03f96");
		updateModel.setDamageStatus("500ae");
		updateModel.setDamageId("f9fc05fe-263e-4bbc-8dd7-58560f909713");
		updateModel.setInspectionCarId("e112e552-95a2-4664-a360-d596b098d0aa");
		updateModel.setRailId("853f1df0-1f50-4f");
		updateModel.setImagePath("731189f5-5e80-4a5e-b0a3-081149df9c89");
		updateModel.setWeldType("3787a");
		updateModel.setIsTurnout("d83e2");
		updateModel.setIsWeldType("78e7aecc-7");
		updateModel.setRailType("b67e5");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = orDamageInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		OrDamageInfoModel findModel = orDamageInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		OrDamageInfoModel orDamageInfoModel = new OrDamageInfoModel();
		orDamageInfoModel.setGuid("d80901a6-d5e4-42cf-a2a5-8de6df719e35");
		orDamageInfoModel.setUnitId("43738");
		orDamageInfoModel.setWorkAreaId("a1ff5");
		orDamageInfoModel.setLineId("05d0");
		orDamageInfoModel.setLineDirection("dd");
		orDamageInfoModel.setTrackId("8cd8dd68-f0b");
		orDamageInfoModel.setStationId("50650dc");
		orDamageInfoModel.setTurnoutId("29801449-e55d-4e");
		orDamageInfoModel.setAlarmChannel("7fc7d352-b3b6-44d5-8");
		orDamageInfoModel.setStationType("e3c0f0e7-3");
		orDamageInfoModel.setWeldId("2d680930-91db-4fef-8");
		orDamageInfoModel.setTeamId("f135b");
		orDamageInfoModel.setMileage("K0+222.33");
		orDamageInfoModel.setLeftRightTrack("4b");
		orDamageInfoModel.setUploadDate(new Date());
		orDamageInfoModel.setFindTime(new Date());
		orDamageInfoModel.setUploadPersonId("fba414e4-17f3-4262-a");
		orDamageInfoModel.setFindPersonId("cc6274cc-265f-4345-b");
		orDamageInfoModel.setDamageType("cbfbc");
		orDamageInfoModel.setDamageStatus("bfcb9");
		orDamageInfoModel.setDamageId("9ce36d0d-8cad-4be2-a5a6-4b0da3bd94cb");
		orDamageInfoModel.setInspectionCarId("7759a2d6-80f2-40cb-83f2-6392ec0aca36");
		orDamageInfoModel.setRailId("6478051a-d7dd-4d");
		orDamageInfoModel.setImagePath("26c7c139-a9b1-4539-a531-db79c7430315");
		orDamageInfoModel.setWeldType("c8c2e");
		orDamageInfoModel.setIsTurnout("12be2");
		orDamageInfoModel.setIsWeldType("8140bd4f-2");
		orDamageInfoModel.setRailType("12738");
		String pkValue = orDamageInfoModel.getGuid();
		saveModel(orDamageInfoModel);
	
		Integer deleteResult = orDamageInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		OrDamageInfoModel findModel = orDamageInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(OrDamageInfoModel orDamageInfoModel) throws Exception {
		Integer createResult = orDamageInfoService.create(orDamageInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = orDamageInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private OrDamageInfoModel createModel() {
		OrDamageInfoModel orDamageInfoModel = new OrDamageInfoModel();
		orDamageInfoModel.setGuid("e9aec08d-4d56-4a0f-b73c-66e64a20a813");
		orDamageInfoModel.setUnitId("08846");
		orDamageInfoModel.setWorkAreaId("f2133");
		orDamageInfoModel.setLineId("38b1");
		orDamageInfoModel.setLineDirection("85");
		orDamageInfoModel.setTrackId("131607f8-e1b");
		orDamageInfoModel.setStationId("470d412");
		orDamageInfoModel.setTurnoutId("b73cc05f-cab7-46");
		orDamageInfoModel.setAlarmChannel("21689213-fc76-4059-b");
		orDamageInfoModel.setStationType("ce794b5b-2");
		orDamageInfoModel.setWeldId("2435a039-c24f-492b-9");
		orDamageInfoModel.setTeamId("3b0d8");
		orDamageInfoModel.setMileage("K0+222.33");
		orDamageInfoModel.setLeftRightTrack("cb");
		orDamageInfoModel.setUploadDate(new Date());
		orDamageInfoModel.setFindTime(new Date());
		orDamageInfoModel.setUploadPersonId("67f0273e-6992-4b8d-b");
		orDamageInfoModel.setFindPersonId("ae07434d-d28f-4c38-b");
		orDamageInfoModel.setDamageType("7347a");
		orDamageInfoModel.setDamageStatus("65db7");
		orDamageInfoModel.setDamageId("9be95615-866e-43de-b49c-d3e9c3d7990d");
		orDamageInfoModel.setInspectionCarId("b6d024d2-b334-46f5-968c-e77bbd14ed26");
		orDamageInfoModel.setRailId("74491975-ae81-48");
		orDamageInfoModel.setImagePath("0a04e046-b118-4edb-9419-e9b26b83311c");
		orDamageInfoModel.setWeldType("1519c");
		orDamageInfoModel.setIsTurnout("0f74b");
		orDamageInfoModel.setIsWeldType("8cfba7ef-f");
		orDamageInfoModel.setRailType("c406a");
		return orDamageInfoModel;
	}


}

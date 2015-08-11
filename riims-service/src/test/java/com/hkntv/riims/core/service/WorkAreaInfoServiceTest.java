		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.WorkAreaInfoService;
import com.hkntv.riims.core.model.WorkAreaInfoModel;


public class WorkAreaInfoServiceTest extends BaseDbTest{

	@Autowired
	private WorkAreaInfoService workAreaInfoService;

	@Test
	public void testCreate() throws Exception {
		WorkAreaInfoModel workAreaInfoModel = new WorkAreaInfoModel();
		workAreaInfoModel.setGuid("3e7bb0bd-a6bf-422c-9f23-40d245853246");
		workAreaInfoModel.setId("a279b5d6-79a6-4");
		workAreaInfoModel.setInspectionAreaName("32f91");
		String pkValue = workAreaInfoModel.getGuid();
		saveModel(workAreaInfoModel);

		WorkAreaInfoModel findModel = workAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(workAreaInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		WorkAreaInfoModel workAreaInfoModel = new WorkAreaInfoModel();
		workAreaInfoModel.setGuid("4281bcb3-9189-4d54-94b8-b554ba0fe694");
		workAreaInfoModel.setId("4ec5e295-98aa-4");
		workAreaInfoModel.setInspectionAreaName("4e630");
		String pkValue = workAreaInfoModel.getGuid();
		saveModel(workAreaInfoModel);

		WorkAreaInfoModel findModel = workAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(workAreaInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		WorkAreaInfoModel workAreaInfoModel = new WorkAreaInfoModel();
		workAreaInfoModel.setGuid("83c538a8-aa0e-4718-ae55-5eef71d064e3");
		workAreaInfoModel.setId("40b3d4e1-532f-4");
		workAreaInfoModel.setInspectionAreaName("fc059");
		String pkValue = workAreaInfoModel.getGuid();
		saveModel(workAreaInfoModel);

		//WorkAreaInfoModel updateModel = createModel();
		WorkAreaInfoModel updateModel = new WorkAreaInfoModel();
		updateModel.setGuid("00cc22fa-026a-4e78-b2de-e1014c534864");
		updateModel.setId("20079383-3ea2-4");
		updateModel.setInspectionAreaName("3ac9f");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = workAreaInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		WorkAreaInfoModel findModel = workAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		WorkAreaInfoModel workAreaInfoModel = new WorkAreaInfoModel();
		workAreaInfoModel.setGuid("f3b3713f-7754-42c7-a7ce-c90ba07520ab");
		workAreaInfoModel.setId("7b1b66c4-b4c8-4");
		workAreaInfoModel.setInspectionAreaName("fb3c5");
		String pkValue = workAreaInfoModel.getGuid();
		saveModel(workAreaInfoModel);
	
		Integer deleteResult = workAreaInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		WorkAreaInfoModel findModel = workAreaInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(WorkAreaInfoModel workAreaInfoModel) throws Exception {
		Integer createResult = workAreaInfoService.create(workAreaInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = workAreaInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private WorkAreaInfoModel createModel() {
		WorkAreaInfoModel workAreaInfoModel = new WorkAreaInfoModel();
		workAreaInfoModel.setGuid("fef0e6f9-ee56-4825-bdff-853ee80489c3");
		workAreaInfoModel.setId("12e968c9-ef86-4");
		workAreaInfoModel.setInspectionAreaName("196c1");
		return workAreaInfoModel;
	}


}

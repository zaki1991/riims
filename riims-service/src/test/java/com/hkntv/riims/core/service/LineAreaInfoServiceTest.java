		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.LineAreaInfoService;
import com.hkntv.riims.core.model.LineAreaInfoModel;


public class LineAreaInfoServiceTest extends BaseDbTest{

	@Autowired
	private LineAreaInfoService lineAreaInfoService;

	@Test
	public void testCreate() throws Exception {
		LineAreaInfoModel lineAreaInfoModel = new LineAreaInfoModel();
		lineAreaInfoModel.setGuid("a0b71175-9149-44c0-a06d-99ef5bcba4ed");
		lineAreaInfoModel.setId("b35c94b2-0af4-4");
		lineAreaInfoModel.setLineAreaName("e35f0");
		String pkValue = lineAreaInfoModel.getGuid();
		saveModel(lineAreaInfoModel);

		LineAreaInfoModel findModel = lineAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(lineAreaInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		LineAreaInfoModel lineAreaInfoModel = new LineAreaInfoModel();
		lineAreaInfoModel.setGuid("65855c9b-dd6b-4c5f-a302-72d4a16c7dd4");
		lineAreaInfoModel.setId("94f8f47e-31a6-4");
		lineAreaInfoModel.setLineAreaName("16828");
		String pkValue = lineAreaInfoModel.getGuid();
		saveModel(lineAreaInfoModel);

		LineAreaInfoModel findModel = lineAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(lineAreaInfoModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		LineAreaInfoModel lineAreaInfoModel = new LineAreaInfoModel();
		lineAreaInfoModel.setGuid("eb855bd4-2b13-4553-9f8b-22ef89c677b1");
		lineAreaInfoModel.setId("70062868-5ab9-4");
		lineAreaInfoModel.setLineAreaName("5a6d8");
		String pkValue = lineAreaInfoModel.getGuid();
		saveModel(lineAreaInfoModel);

		//LineAreaInfoModel updateModel = createModel();
		LineAreaInfoModel updateModel = new LineAreaInfoModel();
		updateModel.setGuid("9afd936a-1854-4fc8-9698-a095302d0248");
		updateModel.setId("f49eec03-bf55-4");
		updateModel.setLineAreaName("a290a");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = lineAreaInfoService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		LineAreaInfoModel findModel = lineAreaInfoService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getId(), findModel.getId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		LineAreaInfoModel lineAreaInfoModel = new LineAreaInfoModel();
		lineAreaInfoModel.setGuid("a5ef432a-9034-46cf-9e98-b315017211d0");
		lineAreaInfoModel.setId("220f6751-e250-4");
		lineAreaInfoModel.setLineAreaName("fa4b4");
		String pkValue = lineAreaInfoModel.getGuid();
		saveModel(lineAreaInfoModel);
	
		Integer deleteResult = lineAreaInfoService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		LineAreaInfoModel findModel = lineAreaInfoService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(LineAreaInfoModel lineAreaInfoModel) throws Exception {
		Integer createResult = lineAreaInfoService.create(lineAreaInfoModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = lineAreaInfoService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private LineAreaInfoModel createModel() {
		LineAreaInfoModel lineAreaInfoModel = new LineAreaInfoModel();
		lineAreaInfoModel.setGuid("8cb87993-479e-4476-b2f6-4ef7acf63f6c");
		lineAreaInfoModel.setId("704dfe77-48f9-4");
		lineAreaInfoModel.setLineAreaName("c1408");
		return lineAreaInfoModel;
	}


}

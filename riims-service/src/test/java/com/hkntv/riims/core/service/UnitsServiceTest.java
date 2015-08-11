		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.UnitsService;
import com.hkntv.riims.core.model.UnitsModel;


public class UnitsServiceTest extends BaseDbTest{

	@Autowired
	private UnitsService unitsService;

	@Test
	public void testCreate() throws Exception {
		UnitsModel unitsModel = new UnitsModel();
		unitsModel.setGuid("a54c44e3-101d-4aea-87dd-5d5c81e659d5");
		unitsModel.setUnitId("b0924e3e-a9ca-4c7f-a");
		unitsModel.setUnitName("9af4f8d7-a594-4fe7-b478-4da163c5442a");
		String pkValue = unitsModel.getGuid();
		saveModel(unitsModel);

		UnitsModel findModel = unitsService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(unitsModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		UnitsModel unitsModel = new UnitsModel();
		unitsModel.setGuid("ef875316-7476-4d8a-b46d-9f120803f190");
		unitsModel.setUnitId("2d6618d6-c9e9-4058-b");
		unitsModel.setUnitName("b7150dcd-c618-4e1e-988d-54e409491dd5");
		String pkValue = unitsModel.getGuid();
		saveModel(unitsModel);

		UnitsModel findModel = unitsService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(unitsModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		UnitsModel unitsModel = new UnitsModel();
		unitsModel.setGuid("5fbaa536-c6f9-4c3a-82f1-0c1425e15f44");
		unitsModel.setUnitId("36eefb64-4771-49e2-9");
		unitsModel.setUnitName("ffb6f6ad-c200-4d27-905b-b3ed8a9c68f5");
		String pkValue = unitsModel.getGuid();
		saveModel(unitsModel);

		//UnitsModel updateModel = createModel();
		UnitsModel updateModel = new UnitsModel();
		updateModel.setGuid("8ba5044f-4d2f-4369-bfb0-bfbacd083344");
		updateModel.setUnitId("84a85ddd-3396-4103-8");
		updateModel.setUnitName("36662e6a-9639-4b91-8681-bf58cfb95357");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = unitsService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		UnitsModel findModel = unitsService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getUnitId(), findModel.getUnitId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		UnitsModel unitsModel = new UnitsModel();
		unitsModel.setGuid("c4c8a4b3-37d7-40ad-a982-8906926de230");
		unitsModel.setUnitId("0c643887-40c4-464d-8");
		unitsModel.setUnitName("60b80ca3-b439-4c1c-9515-c909f2ccdddf");
		String pkValue = unitsModel.getGuid();
		saveModel(unitsModel);
	
		Integer deleteResult = unitsService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		UnitsModel findModel = unitsService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(UnitsModel unitsModel) throws Exception {
		Integer createResult = unitsService.create(unitsModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = unitsService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private UnitsModel createModel() {
		UnitsModel unitsModel = new UnitsModel();
		unitsModel.setGuid("e39cf4c3-72f7-4e5e-9eb7-f19ddc4d80ae");
		unitsModel.setUnitId("448f4a3e-50e9-4b03-9");
		unitsModel.setUnitName("8d8a7360-dfa2-445b-9bc5-5170c93c5c49");
		return unitsModel;
	}


}

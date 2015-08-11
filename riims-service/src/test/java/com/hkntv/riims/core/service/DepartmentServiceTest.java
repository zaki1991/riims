		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.DepartmentService;
import com.hkntv.riims.core.model.DepartmentModel;


public class DepartmentServiceTest extends BaseDbTest{

	@Autowired
	private DepartmentService departmentService;

	@Test
	public void testCreate() throws Exception {
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setGuid("d1160ac5-975b-42ed-a5c6-3cf40aa63920");
		departmentModel.setDepartmentId("ea4d19db-2edc-438c-8");
		departmentModel.setDepartmentName("9f18b971-7a99-4fdd-a06c-60c1256cf86b");
		String pkValue = departmentModel.getGuid();
		saveModel(departmentModel);

		DepartmentModel findModel = departmentService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(departmentModel.getDepartmentId(), findModel.getDepartmentId());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setGuid("0d79d5af-08e8-429f-b15b-e6dff8acb013");
		departmentModel.setDepartmentId("ec7ed54c-7e77-48b3-8");
		departmentModel.setDepartmentName("02fd98b3-6c29-40e3-bf87-69e1d996aa7c");
		String pkValue = departmentModel.getGuid();
		saveModel(departmentModel);

		DepartmentModel findModel = departmentService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(departmentModel.getDepartmentId(), findModel.getDepartmentId());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setGuid("1e98d0d3-5824-413b-af85-4173ccdefb09");
		departmentModel.setDepartmentId("6f25a0cc-c683-45ff-9");
		departmentModel.setDepartmentName("3072df18-a018-44e8-a57b-7ff1b510c875");
		String pkValue = departmentModel.getGuid();
		saveModel(departmentModel);

		//DepartmentModel updateModel = createModel();
		DepartmentModel updateModel = new DepartmentModel();
		updateModel.setGuid("44a0e749-c309-40c4-9dd6-3843f24b1f3e");
		updateModel.setDepartmentId("53aa108a-771e-43e8-9");
		updateModel.setDepartmentName("45a96ce1-93b8-4f6f-be44-c1385276a6d5");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = departmentService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		DepartmentModel findModel = departmentService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getDepartmentId(), findModel.getDepartmentId());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setGuid("9bc13a4f-d965-4ca1-a451-3fef766ce27b");
		departmentModel.setDepartmentId("85e91eae-d28b-4c15-b");
		departmentModel.setDepartmentName("caeda72a-9000-4240-a50d-480286782e7d");
		String pkValue = departmentModel.getGuid();
		saveModel(departmentModel);
	
		Integer deleteResult = departmentService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		DepartmentModel findModel = departmentService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(DepartmentModel departmentModel) throws Exception {
		Integer createResult = departmentService.create(departmentModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = departmentService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private DepartmentModel createModel() {
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setGuid("7a5f78a7-e915-46fa-9130-13156843198a");
		departmentModel.setDepartmentId("8726d116-d14d-4d83-b");
		departmentModel.setDepartmentName("44265a74-70ad-4238-b058-c9b4de50eff7");
		return departmentModel;
	}


}

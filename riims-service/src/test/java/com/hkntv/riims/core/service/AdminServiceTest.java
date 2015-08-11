		package com.hkntv.riims.core.service;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.model.AdminModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AdminServiceTest extends BaseDbTest{

	@Autowired
	private AdminService adminService;

	@Test
	public void testCreate() throws Exception {
		AdminModel adminModel = new AdminModel();
		adminModel.setId("48df9");
		adminModel.setCategory("55e8b9f9-d");
		adminModel.setSysLevel("74");
		adminModel.setName("34c806f1-590a-4455-b");
		adminModel.setNickname("1560ff47-7abf-486f-9");
		adminModel.setUserPwd("99a19131-946b-4dc6-b");
		adminModel.setLeadingOfficial("9b7ad47b-2818-46b7-a");
		adminModel.setUserJob("8d027");
		adminModel.setPhoneNumber("795e4627-0a");
		adminModel.setBirthday(new Date());
		adminModel.setUserSex("d8");
		String pkValue = adminModel.getId();
		saveModel(adminModel);

		AdminModel findModel = adminService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getId());
		assertEquals(adminModel.getCategory(), findModel.getCategory());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		AdminModel adminModel = new AdminModel();
		adminModel.setId("4eac6");
		adminModel.setCategory("746ffcfb-d");
		adminModel.setSysLevel("49");
		adminModel.setName("dde6ef7e-87cc-4455-8");
		adminModel.setNickname("705aa0ef-9222-4624-8");
		adminModel.setUserPwd("f71dd3b4-0da4-453b-8");
		adminModel.setLeadingOfficial("98b48154-f43d-4762-a");
		adminModel.setUserJob("53dc0");
		adminModel.setPhoneNumber("35faca39-50");
		adminModel.setBirthday(new Date());
		adminModel.setUserSex("50");
		String pkValue = adminModel.getId();
		saveModel(adminModel);

		AdminModel findModel = adminService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getId());
		assertEquals(adminModel.getCategory(), findModel.getCategory());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		AdminModel adminModel = new AdminModel();
		adminModel.setId("30e0f");
		adminModel.setCategory("0ada26bb-0");
		adminModel.setSysLevel("72");
		adminModel.setName("7bc5574d-c49d-457d-9");
		adminModel.setNickname("b6596003-acd7-407b-8");
		adminModel.setUserPwd("ef0570c3-73f8-4f2c-8");
		adminModel.setLeadingOfficial("ef19b923-86d7-44da-9");
		adminModel.setUserJob("5241d");
		adminModel.setPhoneNumber("864d91d6-42");
		adminModel.setBirthday(new Date());
		adminModel.setUserSex("5d");
		String pkValue = adminModel.getId();
		saveModel(adminModel);

		//AdminModel updateModel = createModel();
		AdminModel updateModel = new AdminModel();
		updateModel.setId("e47f7");
		updateModel.setCategory("2d28150c-d");
		updateModel.setSysLevel("40");
		updateModel.setName("b6d40089-596f-430b-a");
		updateModel.setNickname("70e55ea2-73c0-4361-8");
		updateModel.setUserPwd("dd6cb297-6931-4330-b");
		updateModel.setLeadingOfficial("5f74ac8c-bf85-449b-9");
		updateModel.setUserJob("e94e7");
		updateModel.setPhoneNumber("039604f2-67");
		updateModel.setBirthday(new Date());
		updateModel.setUserSex("2f");
		
		updateModel.setId(pkValue);
		Integer updateResult = adminService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		AdminModel findModel = adminService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getId());
		assertEquals(updateModel.getCategory(), findModel.getCategory());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		AdminModel adminModel = new AdminModel();
		adminModel.setId("cdf7e");
		adminModel.setCategory("df66fa9f-3");
		adminModel.setSysLevel("75");
		adminModel.setName("4251c3f4-8a06-40ed-8");
		adminModel.setNickname("e1ece0a6-10e9-4235-a");
		adminModel.setUserPwd("d5607cd7-1e7c-48bc-9");
		adminModel.setLeadingOfficial("bf427427-b078-4bb0-a");
		adminModel.setUserJob("c391e");
		adminModel.setPhoneNumber("2497d4a6-83");
		adminModel.setBirthday(new Date());
		adminModel.setUserSex("8d");
		String pkValue = adminModel.getId();
		saveModel(adminModel);
	
		Integer deleteResult = adminService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		AdminModel findModel = adminService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(AdminModel adminModel) throws Exception {
		Integer createResult = adminService.create(adminModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = adminService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private AdminModel createModel() {
		AdminModel adminModel = new AdminModel();
		adminModel.setId("f62d2");
		adminModel.setCategory("ff6f2b47-a");
		adminModel.setSysLevel("a6");
		adminModel.setName("46bbf59e-511f-46c3-b");
		adminModel.setNickname("1becc403-a67c-4822-8");
		adminModel.setUserPwd("859b6342-59d6-4d04-9");
		adminModel.setLeadingOfficial("38f15d7c-2df6-485e-8");
		adminModel.setUserJob("d9ffd");
		adminModel.setPhoneNumber("71f4433b-cc");
		adminModel.setBirthday(new Date());
		adminModel.setUserSex("17");
		return adminModel;
	}


}

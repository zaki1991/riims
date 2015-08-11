		package com.hkntv.riims.core.service;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.model.PersonModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonServiceTest extends BaseDbTest{

	@Autowired
	private PersonService personService;

	@Test
	public void testCreate() throws Exception {
		PersonModel personModel = new PersonModel();
		personModel.setGuid("a6270");
		personModel.setPassword("f9b38812-b124-4076-8");
		personModel.setWorkId("c2106");
		personModel.setName("4d434");
		personModel.setIdentityCardId("e1b109b7-6221-4aaf");
		personModel.setLiteracy("8384d");
		personModel.setTeamId("78ad431c");
		personModel.setBirthday(new Date());
		personModel.setPhoneNumber("1d0f3fb2-744d-4");
		personModel.setEnteringDate(new Date());
		personModel.setEnteringPerson("cc18e");
		personModel.setEnteringPersonPhoneNumber("a9224dc1-805d-4");
		personModel.setDepartmentId("d8f10");
		personModel.setSex("42");
		personModel.setJob("01ed6");
		String pkValue = personModel.getGuid();
		saveModel(personModel);

		PersonModel findModel = personService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(personModel.getPassword(), findModel.getPassword());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		PersonModel personModel = new PersonModel();
		personModel.setGuid("356b2");
		personModel.setPassword("04ac3ff1-8f50-4e31-9");
		personModel.setWorkId("38418");
		personModel.setName("b8240");
		personModel.setIdentityCardId("6dacae3d-ceaa-4de2");
		personModel.setLiteracy("17527");
		personModel.setTeamId("9c4f9bc0");
		personModel.setBirthday(new Date());
		personModel.setPhoneNumber("084f0677-5c24-4");
		personModel.setEnteringDate(new Date());
		personModel.setEnteringPerson("424c1");
		personModel.setEnteringPersonPhoneNumber("65d133ac-3672-4");
		personModel.setDepartmentId("e12e8");
		personModel.setSex("07");
		personModel.setJob("5eb1d");
		String pkValue = personModel.getGuid();
		saveModel(personModel);

		PersonModel findModel = personService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(personModel.getPassword(), findModel.getPassword());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		PersonModel personModel = new PersonModel();
		personModel.setGuid("82eb8");
		personModel.setPassword("c1763df8-a008-45d4-a");
		personModel.setWorkId("41043");
		personModel.setName("af51a");
		personModel.setIdentityCardId("3b9c29e6-a91a-4345");
		personModel.setLiteracy("27296");
		personModel.setTeamId("0bf00e14");
		personModel.setBirthday(new Date());
		personModel.setPhoneNumber("6e12c80e-da88-4");
		personModel.setEnteringDate(new Date());
		personModel.setEnteringPerson("8cf24");
		personModel.setEnteringPersonPhoneNumber("9aacb3bb-8c99-4");
		personModel.setDepartmentId("afa8c");
		personModel.setSex("80");
		personModel.setJob("d2b8d");
		String pkValue = personModel.getGuid();
		saveModel(personModel);

		//PersonModel updateModel = createModel();
		PersonModel updateModel = new PersonModel();
		updateModel.setGuid("83b90");
		updateModel.setPassword("27b88643-8d77-4068-b");
		updateModel.setWorkId("08f44");
		updateModel.setName("9744b");
		updateModel.setIdentityCardId("d5cea870-e11c-445d");
		updateModel.setLiteracy("5385b");
		updateModel.setTeamId("04ef14d2");
		updateModel.setBirthday(new Date());
		updateModel.setPhoneNumber("fadb4199-dc2b-4");
		updateModel.setEnteringDate(new Date());
		updateModel.setEnteringPerson("01ce2");
		updateModel.setEnteringPersonPhoneNumber("807bff64-d807-4");
		updateModel.setDepartmentId("45082");
		updateModel.setSex("4e");
		updateModel.setJob("2f908");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = personService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		PersonModel findModel = personService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getPassword(), findModel.getPassword());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		PersonModel personModel = new PersonModel();
		personModel.setGuid("c4947");
		personModel.setPassword("d99be5e1-d85f-45f8-9");
		personModel.setWorkId("986be");
		personModel.setName("9322e");
		personModel.setIdentityCardId("bbbb1d83-7276-490d");
		personModel.setLiteracy("dafb5");
		personModel.setTeamId("5567687f");
		personModel.setBirthday(new Date());
		personModel.setPhoneNumber("55cfbef4-1e70-4");
		personModel.setEnteringDate(new Date());
		personModel.setEnteringPerson("b54e7");
		personModel.setEnteringPersonPhoneNumber("2581fb27-1191-4");
		personModel.setDepartmentId("9ae45");
		personModel.setSex("d5");
		personModel.setJob("4f79d");
		String pkValue = personModel.getGuid();
		saveModel(personModel);
	
		Integer deleteResult = personService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		PersonModel findModel = personService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(PersonModel personModel) throws Exception {
		Integer createResult = personService.create(personModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = personService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private PersonModel createModel() {
		PersonModel personModel = new PersonModel();
		personModel.setGuid("0a6f2");
		personModel.setPassword("aa193311-f524-4d1f-b");
		personModel.setWorkId("9f6e8");
		personModel.setName("aa393");
		personModel.setIdentityCardId("f6ee6540-52ad-4d55");
		personModel.setLiteracy("12c87");
		personModel.setTeamId("11391074");
		personModel.setBirthday(new Date());
		personModel.setPhoneNumber("67e2de3f-cd57-4");
		personModel.setEnteringDate(new Date());
		personModel.setEnteringPerson("9b833");
		personModel.setEnteringPersonPhoneNumber("f06300ff-f4d9-4");
		personModel.setDepartmentId("9b989");
		personModel.setSex("98");
		personModel.setJob("7dda4");
		return personModel;
	}


}

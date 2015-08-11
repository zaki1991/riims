		package com.hkntv.riims.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hkntv.pylon.unit.BaseDbTest;
import com.hkntv.riims.core.service.DeviceService;
import com.hkntv.riims.core.model.DeviceModel;

import java.util.Date;

public class DeviceServiceTest extends BaseDbTest{

	@Autowired
	private DeviceService deviceService;

	@Test
	public void testCreate() throws Exception {
		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setGuid("f6624");
		deviceModel.setDeviceType("09a90");
		deviceModel.setPrice("11a9eb53");
		deviceModel.setDeviceVersion("1f82cb30");
		deviceModel.setBoughtDate(new Date());
		deviceModel.setLeadingOfficial("0e7ab");
		deviceModel.setProductionDate(new Date());
		deviceModel.setPhoneNumber("2b8bcb7a-7419-4");
		deviceModel.setYearlyInspectionStatus("e822d");
		deviceModel.setQuaterlyInspectionDate(new Date());
		deviceModel.setMonthlyInspectionDate(new Date());
		deviceModel.setManufacturer("dc193bf0");
		deviceModel.setIsRebuildDevice("0ddd16a7");
		deviceModel.setMaintenancePeriod(new Date());
		deviceModel.setPlanScrapDate(new Date());
		deviceModel.setUsingUnit("2a5423df");
		deviceModel.setDeviceStatus("489324ea");
		deviceModel.setStartUseDate(new Date());
		deviceModel.setRemark("72d2b834-c9ba-4714-bf06-c2837482ce4e");
		String pkValue = deviceModel.getGuid();
		saveModel(deviceModel);

		DeviceModel findModel = deviceService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(deviceModel.getDeviceType(), findModel.getDeviceType());

		cleanModel(pkValue);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {
		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setGuid("86dff");
		deviceModel.setDeviceType("1166e");
		deviceModel.setPrice("5531e23b");
		deviceModel.setDeviceVersion("8d1e4a69");
		deviceModel.setBoughtDate(new Date());
		deviceModel.setLeadingOfficial("750b0");
		deviceModel.setProductionDate(new Date());
		deviceModel.setPhoneNumber("095f3ba2-9d0c-4");
		deviceModel.setYearlyInspectionStatus("ef4b2");
		deviceModel.setQuaterlyInspectionDate(new Date());
		deviceModel.setMonthlyInspectionDate(new Date());
		deviceModel.setManufacturer("11e6ee85");
		deviceModel.setIsRebuildDevice("b840b229");
		deviceModel.setMaintenancePeriod(new Date());
		deviceModel.setPlanScrapDate(new Date());
		deviceModel.setUsingUnit("9226b9d7");
		deviceModel.setDeviceStatus("8d98dc93");
		deviceModel.setStartUseDate(new Date());
		deviceModel.setRemark("ceaf1ac7-db73-4c27-9228-5c33296cb052");
		String pkValue = deviceModel.getGuid();
		saveModel(deviceModel);

		DeviceModel findModel = deviceService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(deviceModel.getDeviceType(), findModel.getDeviceType());

		cleanModel(pkValue);
	}

	@Test
	public void testUpdateByPrimaryKey() throws Exception {
		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setGuid("b0b8c");
		deviceModel.setDeviceType("711d5");
		deviceModel.setPrice("e234f650");
		deviceModel.setDeviceVersion("827cbe6f");
		deviceModel.setBoughtDate(new Date());
		deviceModel.setLeadingOfficial("10c75");
		deviceModel.setProductionDate(new Date());
		deviceModel.setPhoneNumber("27bd17fb-7075-4");
		deviceModel.setYearlyInspectionStatus("d3b93");
		deviceModel.setQuaterlyInspectionDate(new Date());
		deviceModel.setMonthlyInspectionDate(new Date());
		deviceModel.setManufacturer("bc7ebdfb");
		deviceModel.setIsRebuildDevice("9501584f");
		deviceModel.setMaintenancePeriod(new Date());
		deviceModel.setPlanScrapDate(new Date());
		deviceModel.setUsingUnit("3a95725d");
		deviceModel.setDeviceStatus("75e92f51");
		deviceModel.setStartUseDate(new Date());
		deviceModel.setRemark("3739b375-80da-45d0-8215-7a44bc13a9c9");
		String pkValue = deviceModel.getGuid();
		saveModel(deviceModel);

		//DeviceModel updateModel = createModel();
		DeviceModel updateModel = new DeviceModel();
		updateModel.setGuid("1a42f");
		updateModel.setDeviceType("bee8d");
		updateModel.setPrice("4e7535cd");
		updateModel.setDeviceVersion("92bc3f68");
		updateModel.setBoughtDate(new Date());
		updateModel.setLeadingOfficial("d02f4");
		updateModel.setProductionDate(new Date());
		updateModel.setPhoneNumber("bc367793-3e22-4");
		updateModel.setYearlyInspectionStatus("31b1f");
		updateModel.setQuaterlyInspectionDate(new Date());
		updateModel.setMonthlyInspectionDate(new Date());
		updateModel.setManufacturer("d4cada22");
		updateModel.setIsRebuildDevice("bf13e475");
		updateModel.setMaintenancePeriod(new Date());
		updateModel.setPlanScrapDate(new Date());
		updateModel.setUsingUnit("603df019");
		updateModel.setDeviceStatus("8a5793e6");
		updateModel.setStartUseDate(new Date());
		updateModel.setRemark("5555f383-1bff-43d6-8ae0-6a46ec5b618e");
		
		updateModel.setGuid(pkValue);
		Integer updateResult = deviceService.updateByPrimaryKey(updateModel);
		assertEquals(new Integer(1), updateResult);
		DeviceModel findModel = deviceService.findByPrimaryKey(pkValue);
		assertEquals(pkValue, findModel.getGuid());
		assertEquals(updateModel.getDeviceType(), findModel.getDeviceType());

		cleanModel(pkValue);
	}

	@Test
	public void testDeleteByPrimaryKey() throws Exception{
		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setGuid("6d785");
		deviceModel.setDeviceType("7b912");
		deviceModel.setPrice("49b8d759");
		deviceModel.setDeviceVersion("51644510");
		deviceModel.setBoughtDate(new Date());
		deviceModel.setLeadingOfficial("b7216");
		deviceModel.setProductionDate(new Date());
		deviceModel.setPhoneNumber("89ddd002-0b1a-4");
		deviceModel.setYearlyInspectionStatus("af1db");
		deviceModel.setQuaterlyInspectionDate(new Date());
		deviceModel.setMonthlyInspectionDate(new Date());
		deviceModel.setManufacturer("f9a7ffb9");
		deviceModel.setIsRebuildDevice("f8518eab");
		deviceModel.setMaintenancePeriod(new Date());
		deviceModel.setPlanScrapDate(new Date());
		deviceModel.setUsingUnit("44cd90db");
		deviceModel.setDeviceStatus("8e93250d");
		deviceModel.setStartUseDate(new Date());
		deviceModel.setRemark("154204ad-203c-417a-83b2-013fb432666f");
		String pkValue = deviceModel.getGuid();
		saveModel(deviceModel);
	
		Integer deleteResult = deviceService.deleteByPrimaryKey(pkValue);
		assertEquals(new Integer(1), deleteResult);
		DeviceModel findModel = deviceService.findByPrimaryKey(pkValue);
		assertNull(findModel);
	}
	
	private void saveModel(DeviceModel deviceModel) throws Exception {
		Integer createResult = deviceService.create(deviceModel);
		assertEquals(createResult, new Integer(1));
	}

	private void cleanModel(String pk) throws Exception {
		Integer deleteResult = deviceService.deleteByPrimaryKey(pk);
		assertEquals(deleteResult, new Integer(1));
	}

	@SuppressWarnings("unused")
	private DeviceModel createModel() {
		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setGuid("87974");
		deviceModel.setDeviceType("19b3c");
		deviceModel.setPrice("0f2ce434");
		deviceModel.setDeviceVersion("f1f28379");
		deviceModel.setBoughtDate(new Date());
		deviceModel.setLeadingOfficial("901ab");
		deviceModel.setProductionDate(new Date());
		deviceModel.setPhoneNumber("4ab494d7-72d7-4");
		deviceModel.setYearlyInspectionStatus("52ed1");
		deviceModel.setQuaterlyInspectionDate(new Date());
		deviceModel.setMonthlyInspectionDate(new Date());
		deviceModel.setManufacturer("d723a797");
		deviceModel.setIsRebuildDevice("23feef66");
		deviceModel.setMaintenancePeriod(new Date());
		deviceModel.setPlanScrapDate(new Date());
		deviceModel.setUsingUnit("18fbf451");
		deviceModel.setDeviceStatus("d7f0394e");
		deviceModel.setStartUseDate(new Date());
		deviceModel.setRemark("48517947-443d-4eab-bfde-438f0d10b6ac");
		return deviceModel;
	}


}

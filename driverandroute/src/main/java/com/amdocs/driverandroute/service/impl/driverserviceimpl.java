package com.amdocs.driverandroute.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.driverandroute.entity.DriverModel;
import com.amdocs.driverandroute.repo.driverrepository;
import com.amdocs.driverandroute.service.driverservice;


@Service
public class driverserviceimpl implements driverservice {
	@Autowired
	private driverrepository driverrepo;
    @Override
	public boolean savedriver(DriverModel drv) {
		// TODO Auto-generated method stub
    	DriverModel drvSave = driverrepo.save(drv);
		boolean flag = false;

		if (drvSave != null)
			flag = true;

		return flag;
	}
    @Override
	public List<DriverModel> getAlldrivers() {
		// TODO Auto-generated method stub
		//select *from driver;
		List<DriverModel> drvRecords = driverrepo.findAll();
		return drvRecords;
	}

	@Override
	public DriverModel getdriverId(int id) {
		// TODO Auto-generated method stub
		Optional<DriverModel> drvId = driverrepo.findById(id);
		DriverModel drv = drvId.get();
		return drv;
	}

	@Override
	public boolean updatebook(DriverModel st) {
		// TODO Auto-generated method stub
		return savedriver(st);
	}

	@Override
	public boolean deletedriver(int id) {
		// TODO Auto-generated method stub
		DriverModel drv = getdriverId(id);
		boolean flag=false;
		if(drv!=null)
		{
			driverrepo.delete(drv);
		flag=true;	
		}
		
		return flag;
	}
	
	
}

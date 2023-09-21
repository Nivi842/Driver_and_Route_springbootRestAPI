package com.amdocs.driverandroute.service;

import java.util.List;

import com.amdocs.driverandroute.entity.DriverModel;

public interface driverservice {

	public boolean savedriver(DriverModel drv);
    public List<DriverModel> getAlldrivers();

	public DriverModel getdriverId(int id);

	public boolean updatebook(DriverModel st);

	public boolean deletedriver(int id);

	



	

}

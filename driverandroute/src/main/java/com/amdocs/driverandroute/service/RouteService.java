package com.amdocs.driverandroute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.driverandroute.entity.DriverModel;
import com.amdocs.driverandroute.entity.RouteEntity;
import com.amdocs.driverandroute.exception.DriverNotFoundException;
import com.amdocs.driverandroute.repo.RouteRepository;
import com.amdocs.driverandroute.repo.driverrepository;

@Service
public class RouteService {
	
private RouteRepository routerepo;
private driverrepository driverrepo;
	@Autowired
	public RouteService(RouteRepository routerepo,driverrepository driverrepo) {
		//super();
		this.routerepo = routerepo;
		this.driverrepo = driverrepo;
	}


	//crud operations
	//savedriver data
	//insert query is generated at runtime by server using hibernate and jpa
	public RouteEntity saveroute(RouteEntity route,Integer root_no) throws DriverNotFoundException
	{
	DriverModel driver1= driverrepo.findById(root_no).orElse(null);
	if(driver1!=null)

	{
		route.setDrivers(driver1);
		return routerepo.save(route); 
	}
	else
	{
		throw new DriverNotFoundException("Driver is not Exist");
	}
	}
	

	public List<RouteEntity> getAllroute()
	{
		return routerepo.findAll();
	}
	
	public 	RouteEntity getrouteById(Integer routeno)
	{
		return routerepo.findById(routeno).orElse(null);
	}

	public RouteEntity updateroute(Integer routeno, RouteEntity route)
	{
		RouteEntity existingroute=routerepo.findById(routeno).orElse(null);
		
		if(existingroute!=null)
		{
			existingroute.setRoute_name(route.getRoute_name());
			existingroute.setRoute_startingpoint(route.getRoute_startingpoint());
			existingroute.setRoute_endpoint(route.getRoute_endpoint());
		return routerepo.save(existingroute);
		}
		return null;
	}
	
	public void deleteroute(Integer routeno)
	{
		 routerepo.deleteById(routeno);
	}
	
}

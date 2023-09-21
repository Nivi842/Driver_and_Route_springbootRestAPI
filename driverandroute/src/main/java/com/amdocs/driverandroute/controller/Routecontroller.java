package com.amdocs.driverandroute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.driverandroute.entity.RouteEntity;
import com.amdocs.driverandroute.exception.DriverNotFoundException;
import com.amdocs.driverandroute.service.RouteService;
import com.amdocs.driverandroute.service.driverservice;

@RestController
@RequestMapping("/route")
public class Routecontroller {

	private RouteService routeserv;
	private driverservice driverserv;

	@Autowired
	public Routecontroller(RouteService routeserv,driverservice driverserv) {
		super();
		this.routeserv = routeserv;
		this.driverserv = driverserv;
	}
	//Basic URI for API Testing
	
	//http://localhost:8087/route
	
	
	//http://localhost:8087/route/insert/{root_no}
	@PostMapping("/insert/{root_no}")
	public RouteEntity saveroute(@RequestBody RouteEntity route,@PathVariable Integer root_no)throws DriverNotFoundException{
	
		return routeserv.saveroute(route,root_no);
	}
	
	//select *from route_entity
	//http://localhost:8087/route/allroutes

	@GetMapping("/allroutes")
	public List<RouteEntity> getAllroutes()
	{
		return routeserv.getAllroute();
		
	}
	
	//select *from driver_entity where root_id=?
	//http://localhost:8087/route/1
	@GetMapping("/{routeno}")
	public RouteEntity getrouteById(@PathVariable Integer routeno)
	{
		return routeserv.getrouteById(routeno);
	}
	
	//http://localhost:8087/route/update/1
	@PutMapping("/update/{root_no}")
	public RouteEntity updateroute(@PathVariable Integer routeno,@RequestBody RouteEntity route)
	{
		return routeserv.updateroute(routeno,route);
	}
	
	
	@DeleteMapping("/delete/{root_no}")
	public void deleteroute(@PathVariable Integer routeno)
	{
		routeserv.deleteroute(routeno);
	}
	
}

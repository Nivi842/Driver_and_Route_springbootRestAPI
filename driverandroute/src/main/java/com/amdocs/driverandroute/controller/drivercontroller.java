package com.amdocs.driverandroute.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.driverandroute.entity.DriverModel;
import com.amdocs.driverandroute.service.impl.driverserviceimpl;
@Controller
public class drivercontroller {
	@Autowired
	private driverserviceimpl driverservice;
	
	@RequestMapping("/")
	public String loadForm(Model model)
	{
		DriverModel drv=new DriverModel();
		model.addAttribute("drv",drv);
		
		return "driver";
	}
	
	@RequestMapping("/insert")
	public String handledrvForm(@ModelAttribute("drv")DriverModel drv,Model model)
	{
		
		//intract to service layer
		boolean savedriver = driverservice.savedriver(drv);
		
		String msg="";
		
		if(savedriver)
			msg="Data Inserted SuccessFully";
		else
			msg="Data Not Inserted SuccessFully";
		
		model.addAttribute("msg", msg);
		return "driver";
	}
	
	
	@RequestMapping("/viewAll")
	public String viewAlldrivers(Model model)
	{
		//fetch the data from the databse ,can interact service layer
		List<DriverModel> alldrivers= driverservice.getAlldrivers();
		
		model.addAttribute("drivers", alldrivers);
		return "view";
	}
	
	@RequestMapping("/deleteDrv")
	public String deletedriver(@RequestParam("did")int id)
	{
		boolean flag = driverservice.deletedriver(id);
		
		if(flag)
		return "redirect:/viewAll";
		else
		return "redirect:/viewAll";
	}
	
	
	@RequestMapping("/editDrv")
	public String editdriver(@RequestParam("did")   int id,Model model)
	{
		DriverModel drv = driverservice.getdriverId(id);
		
		model.addAttribute("drv", drv);
		return "editdriver";
	}
	
	@RequestMapping("/update")
	public String updateBook(DriverModel st)
	{
		boolean updateBook = driverservice.updatebook(st);
		
		return "redirect:/viewAll";

	}
}


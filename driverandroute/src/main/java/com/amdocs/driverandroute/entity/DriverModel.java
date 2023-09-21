package com.amdocs.driverandroute.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Driver_list")
public class DriverModel {
    @Id
    @Column(name="Root_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int root_no;
    @Column(name="Driver_name")
    private String driver_name;
    @Column(name="License_no")
    private String license_no;
    @Column(name="Mobile_No")
    private String mobile_no;
    @Column(name="Route")
    private String route;
    @OneToMany(mappedBy = "drivers", cascade = CascadeType.ALL)
    private Set<RouteEntity> routeno=new HashSet<RouteEntity>();
	public int getRoot_no() {
		return root_no;
	}
	public void setRoot_no(int root_no) {
		this.root_no = root_no;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public DriverModel(int root_no, String driver_name, String license_no, String mobile_no, String route) {
		super();
		this.root_no = root_no;
		this.driver_name = driver_name;
		this.license_no = license_no;
		this.mobile_no = mobile_no;
		this.route = route;
	}
	public DriverModel() {
		// TODO Auto-generated constructor stub
	}

}

package com.amdocs.driverandroute.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class RouteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "routeno")
	private int routeno;
	@Column(name = "Route_name")
	private String route_name ;
	@Column(name = "Route_startingpoint")
	private String route_startingpoint ;
	@Column(name = "Route_endpoint")
	private String route_endpoint ;
	
	
	@ManyToOne
    @JoinColumn(name = "root_no")
    private DriverModel drivers;
	
	
	
}

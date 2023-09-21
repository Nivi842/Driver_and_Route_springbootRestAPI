package com.amdocs.driverandroute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.driverandroute.entity.DriverModel;


@Repository
public interface driverrepository extends JpaRepository<DriverModel,Integer>{

}

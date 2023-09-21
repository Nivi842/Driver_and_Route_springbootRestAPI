package com.amdocs.driverandroute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.driverandroute.entity.RouteEntity;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity,	Integer> {

	
}

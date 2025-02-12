package com.placementManagementSystem.Placement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement,Integer>{

	List<Placement> findAll();

}

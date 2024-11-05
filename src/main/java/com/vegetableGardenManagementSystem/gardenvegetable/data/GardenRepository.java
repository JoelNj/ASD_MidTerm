package com.vegetableGardenManagementSystem.gardenvegetable.data;

import com.vegetableGardenManagementSystem.gardenvegetable.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GardenRepository extends JpaRepository<Garden,Integer> {

    Optional<Garden> findByName(String name);
}

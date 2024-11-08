package com.vegetableGardenManagementSystem.gardenvegetable.data;

import com.vegetableGardenManagementSystem.gardenvegetable.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface PlantRepository extends JpaRepository<Plant,Integer> {

    Optional<Plant> findByName(String name);
}

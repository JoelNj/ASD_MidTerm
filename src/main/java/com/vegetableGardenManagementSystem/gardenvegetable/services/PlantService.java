package com.vegetableGardenManagementSystem.gardenvegetable.services;

import com.vegetableGardenManagementSystem.gardenvegetable.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService {

    public Optional<Plant> add (Plant plant);
    public Optional<Plant> update(Plant plant);
    public void delete(Plant plant);
    public List<Plant> displayAllPlantSortedByName();
    public List<Plant> displayAllPlantSortedByPlantDate() ;
}

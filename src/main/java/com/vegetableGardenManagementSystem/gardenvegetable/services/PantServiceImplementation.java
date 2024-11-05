package com.vegetableGardenManagementSystem.gardenvegetable.services;

import com.vegetableGardenManagementSystem.gardenvegetable.data.PlantRepository;
import com.vegetableGardenManagementSystem.gardenvegetable.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
@Service
public class PantServiceImplementation implements PlantService{
    @Autowired
    private PlantRepository plantRepository;
    @Override
    public Optional<Plant> add(Plant plant) {
        Plant plantSaved = plantRepository.save(plant);
        return Optional.of(plant);
    }

    @Override
    public Optional<Plant> update(Plant plant) {

        plantRepository.findById(plant.getId()).ifPresent(
                plante->plantRepository.save(plant)
        );

        return Optional.of(plant);
    }

    @Override
    public void delete(Plant plant) {
        plantRepository.delete(plant);
    }

    @Override
    public List<Plant> displayAllPlantSortedByName() {
        return plantRepository.findAll().stream().sorted(Comparator.comparing(Plant::getName)).toList();
    }

    @Override
    public List<Plant> displayAllPlantSortedByPlantDate() {
        return plantRepository.findAll().stream().sorted(Comparator.comparing(Plant::getPlantDate)).toList();
    }
}

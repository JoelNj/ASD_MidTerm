package com.vegetableGardenManagementSystem.gardenvegetable.services;

import com.vegetableGardenManagementSystem.gardenvegetable.data.GardenRepository;
import com.vegetableGardenManagementSystem.gardenvegetable.model.Garden;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class GardenServiceImplementation implements GardenService{

    @Autowired
    private GardenRepository gardenRepository;

    public GardenServiceImplementation(GardenRepository gardenRepository) {
        this.gardenRepository = gardenRepository;
    }

    @Override
    public Optional<Garden> add(Garden garden) {

        Garden gardenSaved = gardenRepository.save(garden);
        return Optional.of(gardenSaved);
    }

    @Override
    public Optional<Garden> update(Garden garden) {
        gardenRepository.findById(garden.getId()).ifPresent(
                myGarden ->gardenRepository.save(garden)
        );
        return Optional.of(garden);
    }

    @Override
    public void delete(Garden garden) {
         gardenRepository.delete(garden);
    }

    @Override
    public List<Garden> displayAll() {
        return gardenRepository.findAll();
    }

    @Override
    public Garden getGardenById(Integer id) {

      return gardenRepository.findById(id).get();
    }
}

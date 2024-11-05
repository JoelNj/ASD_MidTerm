package com.vegetableGardenManagementSystem.gardenvegetable.services;

import com.vegetableGardenManagementSystem.gardenvegetable.model.Garden;

import java.util.List;
import java.util.Optional;

public interface GardenService {


    public Optional<Garden> add(Garden garden);
    public Optional<Garden> update(Garden garden);
    public void delete (Garden garden);
    public List<Garden> displayAll();
    public Garden getGardenById (Integer id);



}

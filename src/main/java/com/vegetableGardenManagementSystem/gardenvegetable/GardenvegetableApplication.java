package com.vegetableGardenManagementSystem.gardenvegetable;

import com.vegetableGardenManagementSystem.gardenvegetable.model.Garden;
import com.vegetableGardenManagementSystem.gardenvegetable.model.Plant;
import com.vegetableGardenManagementSystem.gardenvegetable.services.GardenService;
import com.vegetableGardenManagementSystem.gardenvegetable.services.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class GardenvegetableApplication {

	@Autowired
	private GardenService gardenService;
	@Autowired
	private PlantService plantService;

	public static void main(String[] args) {
		SpringApplication.run(GardenvegetableApplication.class, args);
	}

     @Bean
	CommandLineRunner commandLineRunner(){
		return Argrs->{
//			Garden garden1 = new Garden("Vegetable Patch",50.0);
//			Garden garden2 = new Garden("Herb Garden",20.0);
//			gardenService.add(garden1);
//			gardenService.add(garden2);

			// Add Plant
			Plant plant1 = new Plant("Basil","Herb", LocalDate.of(2024,4,5));
			plant1.setGardenId(gardenService.getGardenById(2));
			System.out.println(gardenService.getGardenById(2));
			Plant plant2 = new Plant("Carrot","Vegetable",LocalDate.of(2024,2,20));
            plant2.setGardenId(gardenService.getGardenById(1));
			Plant plant3 = new Plant("Tomato","Vegetable",LocalDate.of(2024,3,10));
			plantService.add(plant1);
			plantService.add(plant2);
			plantService.add(plant3);

			System.out.println("display all gardens");
			List<Garden> gardens = gardenService.displayAll();
			gardens.forEach(g->System.out.println(g));
			System.out.println("Display All Plants (Sorted by name)");
			plantService.displayAllPlantSortedByName().forEach(p->System.out.println(p));
			System.out.println("Display All plants (Sorted by plant Date)");
			plantService.displayAllPlantSortedByPlantDate().forEach(p->System.out.println(p));


		};
	 }

}
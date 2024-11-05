package com.vegetableGardenManagementSystem.gardenvegetable.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name="Garden")
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id ;

    private String name;
    private Double size;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "gardenId")
    private List<Plant> listOfPlants ;

    @Override
    public String toString() {
        return "Garden{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", listOfPlants=" + listOfPlants +
                '}';
    }


    public Garden(String name, Double size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setListOfPlants(List<Plant> listOfPlants) {
        this.listOfPlants = listOfPlants;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSize() {
        return size;
    }

    public List<Plant> getListOfPlants() {
        return listOfPlants;
    }
}

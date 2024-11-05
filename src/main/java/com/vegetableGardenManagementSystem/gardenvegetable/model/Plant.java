package com.vegetableGardenManagementSystem.gardenvegetable.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id ;

    private String name ;

    private String type ;

    private LocalDate plantDate;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinColumn(name="garden_id")
    private Garden gardenId ;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlantDate(LocalDate plantDate) {
        this.plantDate = plantDate;
    }

    public void setGardenId(Garden gardenId) {
        this.gardenId = gardenId;
    }

    public Plant(String name, String type, LocalDate plantDate) {
        this.name = name;
        this.type = type;
        this.plantDate = plantDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public LocalDate getPlantDate() {
        return plantDate;
    }

    public Garden getGardenId() {
        return gardenId;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", plantDate=" + plantDate +
                ", gardenId=" + gardenId +
                '}';
    }
}

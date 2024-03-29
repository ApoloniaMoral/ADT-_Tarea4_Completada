package com.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    private String location;

    @OneToMany(mappedBy = "box")
    private List<Item> items = new ArrayList<>();

//CONSTRUCTORES

    //CONTRUCTOR VACIO
    public Box() {
    }

    //CONTRUCTOR ID ITEMSERVICE

    public Box(Long id) {
        this.id = id;
    }

    //CONTRUCTOR SEED
    public Box(String label, String location) {
        this.label = label;
        this.location = location;
    }
    //CONTRUCTOR CON TODO

    public Box(Long id, String label, String location, List<Item> items) {
        this.id = id;
        this.label = label;
        this.location = location;
        this.items = items;
    }


//GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

//TO STRING

    @Override
    public String toString() {
        return "Box{" +
                "label='" + label + '\'' +
                ", location='" + location + '\'' +
                ", items=" + items +
                '}';
    }
}

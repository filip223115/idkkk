package mk.ukim.finki.wp.lab.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String description;


    @OneToMany(mappedBy = "location")
    private List<Event> events;


    public Location() {
    }

    public Location(String name, String address, String capacity, String description) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.description = description;
    }
}

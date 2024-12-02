package mk.ukim.finki.wp.lab.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity

public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private double popularityScore;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;

    public Event() {
    }

    public Event(String name, String description, double popularityScore) {
        this.name = name;
        this.description = description;
        this.popularityScore = popularityScore;
    }
}

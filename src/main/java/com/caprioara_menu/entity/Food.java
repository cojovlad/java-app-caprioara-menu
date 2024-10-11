package com.caprioara_menu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @ElementCollection
    private List<String> ingredients;

    @ElementCollection
    private List<String> nutritionalValues;

    private String photo;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

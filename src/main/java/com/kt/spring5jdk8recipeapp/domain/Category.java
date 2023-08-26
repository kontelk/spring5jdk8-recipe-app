package com.kt.spring5jdk8recipeapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kontelk on 8/26/23.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;


    // ----------------- Getters and Setters -------------------





}

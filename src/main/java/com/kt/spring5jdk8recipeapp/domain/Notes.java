package com.kt.spring5jdk8recipeapp.domain;

import javax.persistence.*;

/**
 * Created by kontelk on 8/25/23.
 */

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;


    // ----------------- Getters and Setters -------------------



}

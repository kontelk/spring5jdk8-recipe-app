package com.kt.spring5jdk8recipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kontelk on 8/26/23.
 */

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uom;


    // ----------------- Getters and Setters -------------------



}

package com.kt.spring5jdk8recipeapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by kontelk on 8/26/23.
 */

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;


    // ----------------- Getters and Setters -------------------



}

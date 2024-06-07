package com.example.affectation.model;

import jakarta.persistence.*;

@Entity
@Table(name="affectations")
public class Affectation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Embedded
    Employee emp;
    @Embedded
    Project prjt;
    private String Implication;

}

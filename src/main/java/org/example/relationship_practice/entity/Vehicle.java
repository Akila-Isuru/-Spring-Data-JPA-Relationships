package org.example.relationship_practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lisencePlate;
    private String model;
    private String color;

    @OneToOne(mappedBy ="vehicle",cascade = CascadeType.ALL)
    private Employee employee;
}

package com.gozarte.gozarte.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instructores")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String nombre;

    @Column(length = 30)
    private String apellidos;

    @Column(length = 20)
    private String documento;

    @Column(length = 30)
    private String correo;

    @Column(length = 15)
    private String telefono;
}

package com.gozarte.gozarte.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alumnos")
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20)
    private String nombre;

    @Column(length = 30)
    private String apellidos;

    @Column(length = 20)
    private String documento;

    @Column(length = 10)
    private String fechaNacimiento;

    @Column(length = 10)
    private String genero;
}

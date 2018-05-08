package com.plan111.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Materia")
public class Materia {
    @Id
    private Integer idMateria;
    @Column(name = "nombre")
    private String nombre;
}

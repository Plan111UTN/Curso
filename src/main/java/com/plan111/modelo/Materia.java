package com.plan111.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Materia")
@Getter @Setter @NoArgsConstructor
public class Materia {
    @Id
    private Integer idMateria;
    @Column(name = "nombre")
    private String nombre;
}

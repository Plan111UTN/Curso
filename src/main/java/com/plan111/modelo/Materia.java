package com.plan111.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Materia")
@Getter @Setter @NoArgsConstructor
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idMateria;
    @Column(name = "nombre")
    private String nombre;
}

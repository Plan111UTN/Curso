/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Usuario
 */

@Entity
@Table(name="tb_inscripcion")
@Getter @Setter @NoArgsConstructor
public class Inscripcion {
    @Id
    @Column(name="idInscripcion")
    private int idInscripcion;
    @OneToOne
    private Alumno alumno;
    @OneToOne
    private Materia materia;
    @OneToOne
    private Estado estado;
    
            
}

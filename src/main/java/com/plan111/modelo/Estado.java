/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Nicolas Oliva
 * 
 * 
 * 
 * 
 */
@Entity
@Table(name="tb_estado")
@Getter @Setter @NoArgsConstructor
public class Estado implements Serializable
{
    @Id
    @Column(name="idEstado")
    private int idEstado;
    // CREA UN CAMPO VARCHAR descripcion;
    private String descripcion;    
    
}

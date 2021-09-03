package com.futbolito.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="NIVELES_DEPORTISTA")
public class NivelDeportista {
	
	@Id
	@Column(name="ID_NIVEL")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column(name="NIVEL")
	private String nivel;
	
	@Column(name="PUNTAJE_REQUERIDO")
	private int puntajeRequerido;


}
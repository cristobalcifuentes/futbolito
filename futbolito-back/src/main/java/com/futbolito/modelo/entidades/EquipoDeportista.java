package com.futbolito.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="EQUIPOS_DEPORTISTA")
public class EquipoDeportista {
	
	@Id
	@Column(name="ID_EQUIPO_DEPORTISTA")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_EQUIPO")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="ID_DEPORTISTA")
	private Deportista deportista;

}
package com.futbolito.models.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class IDUserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long user;
	
	private int role;
	
	

}

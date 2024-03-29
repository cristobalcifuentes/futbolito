package com.futbolito.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="status_reservation_requests")
public class StatusReservationRequest {
	
	@Id
	@Column(name="id_status_reservation_requests")
	private Long id;
	
	@Column(name="status")
	private String status;

}

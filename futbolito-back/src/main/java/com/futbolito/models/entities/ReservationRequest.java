package com.futbolito.models.entities;

import java.time.LocalDateTime;

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
@Table(name="reservation_requests")
public class ReservationRequest {
	
	@Id
	@Column(name="id_reservation_request")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_status_reser_req")
	private StatusReservationRequest statusReservationRequest;
	
	@ManyToOne
	@JoinColumn(name="id_hour")
	private HourCourt hour;
	
	@ManyToOne
	@JoinColumn(name="id_team1")
	private Team team1;
	
	@ManyToOne
	@JoinColumn(name="i_team2")
	private Team team2;
	
	@Column(name="creation_date", updatable = false, nullable = false)
	private LocalDateTime creationDate;
	
	@Column(name="update_date")
	private LocalDateTime updateDate;

}

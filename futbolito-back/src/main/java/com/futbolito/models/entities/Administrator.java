package com.futbolito.models.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="administrators")
public class Administrator {
	
	@Id
	@Column(name="is_administrator")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	private Long idAdministrator;
	
	@OneToOne
	@JoinColumn(name="is_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="ID_facility")
	private Facility facility;
	
	@Column(name="creation_date", updatable = false, nullable = false)
	private LocalDateTime creationDate;
	
	@Column(name="update_date")
	private LocalDateTime updateDate;


}

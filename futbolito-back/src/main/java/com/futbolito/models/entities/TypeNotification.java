package com.futbolito.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.futbolito.models.enums.TypeNotificationEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="notification_types")
public class TypeNotification {
	
	@Id
	@Column(name="id_notification_types")
	private Long idTypeNotification;

	
	@Column(name="type_notification")
	@Enumerated(EnumType.STRING)
	private TypeNotificationEnum typeNotification;

}

package com.futbolito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.models.entities.StatusHours;

public interface IStatusHoursRepository extends JpaRepository<StatusHours, Long> {

}

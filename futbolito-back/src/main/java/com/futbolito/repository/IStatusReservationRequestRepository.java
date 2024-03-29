package com.futbolito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.models.entities.StatusReservationRequest;

public interface IStatusReservationRequestRepository extends JpaRepository<StatusReservationRequest, Long> {

}

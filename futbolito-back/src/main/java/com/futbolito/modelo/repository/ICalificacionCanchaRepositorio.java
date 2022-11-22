package com.futbolito.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.modelo.entidades.QualificationTeam;

public interface ICalificacionCanchaRepositorio extends JpaRepository<QualificationTeam, Long> {

}

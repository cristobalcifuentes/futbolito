package com.futbolito.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.modelo.entidades.Court;

public interface ICanchaRepositorio extends JpaRepository<Court, Long> {

}
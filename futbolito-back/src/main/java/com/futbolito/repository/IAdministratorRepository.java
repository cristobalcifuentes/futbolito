package com.futbolito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.modelo.entidades.Administrator;

public interface IAdministratorRepository extends JpaRepository<Administrator, Long> {

}

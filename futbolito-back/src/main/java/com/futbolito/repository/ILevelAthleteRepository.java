package com.futbolito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolito.models.entities.LevelAthlete;

public interface ILevelAthleteRepository extends JpaRepository<LevelAthlete, Long> {

}

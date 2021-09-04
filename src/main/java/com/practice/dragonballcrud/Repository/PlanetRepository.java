package com.practice.dragonballcrud.Repository;

import com.practice.dragonballcrud.Entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, String> {

    List<Planet> findByHasDragonBalls(String planetName);
    List<Planet> findPlanetByPlanetPopulationGreaterThan(long Population);
}

package com.spaceship.spaceshgip.Services;

import com.spaceship.spaceshgip.Models.Planet;
import com.spaceship.spaceshgip.Models.Spaceship;
import com.spaceship.spaceshgip.Repositories.PlanetRepository;
import com.spaceship.spaceshgip.Repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {


  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }

  @Override
  public List<Planet> getPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getShip(Long id) {
    return spaceshipRepository.findById(id).get();
  }

  @Override
  public void moveShip(Long spaceshipId, Long planetId) {

    Planet planet = planetRepository.findById(planetId).get();
    Spaceship spaceship = spaceshipRepository.findById(spaceshipId).get();

    if(planet.getName().equals(spaceship.getPlanet())){
      return;
    }
    spaceship.setPlanet(planet.getName());
    spaceshipRepository.save(spaceship);
  }
}

package com.spaceship.spaceshgip.Services;

import com.spaceship.spaceshgip.Models.Planet;
import com.spaceship.spaceshgip.Models.Spaceship;

public interface SpaceService {

  Iterable<Planet> getPlanets();

  Spaceship getShip(Long id);

  void moveShip(Long spaceshipId, Long planetId);

  void toShip(Long spaceshipId, Long planetId);

  void toPlanet(Long spaceshipId, Long planetId);
}

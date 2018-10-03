package com.spaceship.spaceshgip.Repositories;

import com.spaceship.spaceshgip.Models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {

}

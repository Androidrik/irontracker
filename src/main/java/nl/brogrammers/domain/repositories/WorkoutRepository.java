package nl.brogrammers.domain.repositories;

import nl.brogrammers.domain.models.persistent.Workout;

import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Long>
{

}

package nl.brogrammers.domain.repositories;

import nl.brogrammers.domain.models.persistent.Exercise;

import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Long>
{

}

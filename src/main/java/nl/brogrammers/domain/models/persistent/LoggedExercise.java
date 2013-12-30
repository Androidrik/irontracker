package nl.brogrammers.domain.models.persistent;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import nl.brogrammers.domain.models.interfaces.PersistentEntity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "logged_exercises")
public class LoggedExercise implements PersistentEntity
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long id;

    @OneToMany(mappedBy = "exercise")
    private final List<TrainingSet> setsDone = new ArrayList<>();

    @ManyToOne
    private Workout workout;

    public List<TrainingSet> getSetsDone()
    {
	return setsDone;
    }

    public Workout getWorkout()
    {
	return workout;
    }

    public void setWorkout(Workout workout)
    {
	this.workout = workout;
    }

    @Override
    public Long getId()
    {
	return id;
    }
}

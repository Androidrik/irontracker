package nl.brogrammers.domain.models.persistent;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	private final List<TrainingSet> setsDone = new ArrayList<>();

	public List<TrainingSet> getSetsDone()
	{
		return setsDone;
	}

	public void setId(long id)
	{
		this.id = id;
	}	@Override
	public Long getId()
	{
		return id;
	}
}

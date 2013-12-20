package nl.brogrammers.domain.models.persistent;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import nl.brogrammers.domain.models.interfaces.PersistentEntity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "workouts")
public class Workout implements PersistentEntity
{
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long id;

	private Date loggedOn;

	private final Set<LoggedExercise> exercisesDone = new HashSet<>();

	public Set<LoggedExercise> getExercisesDone()
	{
		return exercisesDone;
	}

	public Date getLoggedOn()
	{
		return loggedOn;
	}

	public void setLoggedOn(Date loggedOn)
	{
		this.loggedOn = loggedOn;
	}

	@Override
	public Long getId()
	{
		return id;
	}
}

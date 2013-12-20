package nl.brogrammers.domain.models.persistent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import nl.brogrammers.domain.models.interfaces.PersistentEntity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "training_sets")
public class TrainingSet implements PersistentEntity
{
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long id;

	private Exercise exercise;

	private int reps;

	private int weightInKG;

	public Exercise getExercise()
	{
		return exercise;
	}

	public void setExercise(Exercise exercise)
	{
		this.exercise = exercise;
	}

	public int getReps()
	{
		return reps;
	}

	public void setReps(int reps)
	{
		this.reps = reps;
	}

	public int getWeightInKG()
	{
		return weightInKG;
	}

	public void setWeightInKG(int weightInKG)
	{
		this.weightInKG = weightInKG;
	}

	@Override
	public Long getId()
	{
		return id;
	}

}

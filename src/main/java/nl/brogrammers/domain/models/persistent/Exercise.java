package nl.brogrammers.domain.models.persistent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import nl.brogrammers.domain.models.interfaces.PersistentEntity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "exercises")
public class Exercise implements PersistentEntity
{
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long id;

	private String naam;

	public String getNaam()
	{
		return naam;
	}

	public void setNaam(String naam)
	{
		this.naam = naam;
	}	@Override
	public Long getId()
	{
		return id;
	}
}

package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "film_details")
public class FilmDetails extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "produser_id")
	private Produser produser;
	
	@ManyToMany
	@JoinTable(name = "filmDetails_actor",
	joinColumns = @JoinColumn(name = "film_details_id"),
	inverseJoinColumns = @JoinColumn(name = "actor_id"))
	List<Actor> actors = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "film_description")
	private String filmDescription;
	
	@OneToOne(mappedBy = "filmDetails")
	private Film film;

}

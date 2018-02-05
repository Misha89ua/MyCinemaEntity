package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor extends BaseEntity{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "actor_biography")
	private String actorBiography;
	
	@ManyToMany
	@JoinTable(name = "filmDetails_actor",
	joinColumns = @JoinColumn(name = "actor_id"),
	inverseJoinColumns = @JoinColumn(name = "film_details_id"))
	List<FilmDetails> filmDetailsList = new ArrayList<>();

}

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
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "actor_biography")
	private String actorBiography;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name = "filmDetails_actor",
	joinColumns = @JoinColumn(name = "actor_id"),
	inverseJoinColumns = @JoinColumn(name = "film_details_id"))
	List<FilmDetails> filmDetailsList = new ArrayList<>();

	public Actor() {
	}

	public Actor(String firstName, String lastName, int age, String actorBiography) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.actorBiography = actorBiography;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getActorBiography() {
		return actorBiography;
	}

	public void setActorBiography(String actorBiography) {
		this.actorBiography = actorBiography;
	}

	public List<FilmDetails> getFilmDetailsList() {
		return filmDetailsList;
	}

	public void setFilmDetailsList(List<FilmDetails> filmDetailsList) {
		this.filmDetailsList = filmDetailsList;
	}
}

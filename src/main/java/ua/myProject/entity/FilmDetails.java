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

	public FilmDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produser getProduser() {
		return produser;
	}

	public void setProduser(Produser produser) {
		this.produser = produser;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getFilmDescription() {
		return filmDescription;
	}

	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

}

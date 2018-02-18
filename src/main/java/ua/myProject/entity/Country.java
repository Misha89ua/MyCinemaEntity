package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country extends BaseEntity{
	
	@Column(name = "country_name")
	private String countryName;
	
	@OneToMany(mappedBy = "country", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	List<FilmDetails> filmDetailsList = new ArrayList<>();
	
	@OneToMany(mappedBy = "country", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	List<Actor> actors = new ArrayList<>();
	
	@OneToMany(mappedBy = "country", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	List<Produser> produsers = new ArrayList<>();

	public Country() {
	}
	
	public Country(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<FilmDetails> getFilmDetailsList() {
		return filmDetailsList;
	}

	public void setFilmDetailsList(List<FilmDetails> filmDetailsList) {
		this.filmDetailsList = filmDetailsList;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Produser> getProdusers() {
		return produsers;
	}

	public void setProdusers(List<Produser> produsers) {
		this.produsers = produsers;
	}	
}

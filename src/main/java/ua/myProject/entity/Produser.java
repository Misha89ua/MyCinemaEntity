package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "produser")
public class Produser extends BaseEntity{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "produsers_biography")
	private String produsersBiography;
	
	@OneToMany(mappedBy = "produser")
	List<FilmDetails> filmDetailsList = new ArrayList<>();

	public Produser() {
		super();
		// TODO Auto-generated constructor stub
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getProdusersBiography() {
		return produsersBiography;
	}

	public void setProdusersBiography(String produsersBiography) {
		this.produsersBiography = produsersBiography;
	}

	public List<FilmDetails> getFilmDetailsList() {
		return filmDetailsList;
	}

	public void setFilmDetailsList(List<FilmDetails> filmDetailsList) {
		this.filmDetailsList = filmDetailsList;
	}
	
	
}

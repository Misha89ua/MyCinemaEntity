package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country extends BaseEntity{
	
	@Column(name = "country_name")
	private String countryName;
	
	@OneToMany(mappedBy = "country")
	List<FilmDetails> filmDetailsList = new ArrayList<>();
	
	@OneToMany(mappedBy = "country")
	List<Actor> actors = new ArrayList<>();
	
	@OneToMany(mappedBy = "country")
	List<Produser> produsers = new ArrayList<>();
	
}

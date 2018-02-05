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

}

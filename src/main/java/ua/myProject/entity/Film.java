package ua.myProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film extends BaseEntity{
	
	@Column(name = "film_name")
	private String filmName;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "movie_length")
	private int movieLength;
	
	@OneToOne
	@JoinColumn(name = "film_details_id")
	private FilmDetails filmDetails;
	
	@Column(name = "numbers_of_likes")
	private int numbersOfLikes;
	
}

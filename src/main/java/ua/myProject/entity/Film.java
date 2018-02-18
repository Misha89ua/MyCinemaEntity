package ua.myProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film extends BaseEntity{
	
	@Column(name = "film_name")
	private String filmName;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "movie_length")
	private int movieLength;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "film_details_id")
	private FilmDetails filmDetails;
	
	@Column(name = "numbers_of_likes")
	private int numbersOfLikes;

	public Film() {
	}
	
	public Film(String filmName, int year, int movieLength) {
		this.filmName = filmName;
		this.year = year;
		this.movieLength = movieLength;
		this.numbersOfLikes = 0;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public FilmDetails getFilmDetails() {
		return filmDetails;
	}

	public void setFilmDetails(FilmDetails filmDetails) {
		this.filmDetails = filmDetails;
	}

	public int getNumbersOfLikes() {
		return numbersOfLikes;
	}

	public void setNumbersOfLikes(int numbersOfLikes) {
		this.numbersOfLikes = numbersOfLikes;
	}
}

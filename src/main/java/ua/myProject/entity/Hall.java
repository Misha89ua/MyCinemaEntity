package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "hall")
public class Hall extends BaseEntity{
	
	@Column(name = "hall_name")
	private String hallName;
	
	@Column(name = "number_of_seats")
	private int numberOfSeats;
	
	@OneToMany(mappedBy = "hall", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Seans>seanses = new ArrayList<>();

	public Hall() {
	}

	public Hall(String hallName, int numberOfSeats) {
		super();
		this.hallName = hallName;
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public List<Seans> getSeanses() {
		return seanses;
	}

	public void setSeanses(List<Seans> seanses) {
		this.seanses = seanses;
	}	
}

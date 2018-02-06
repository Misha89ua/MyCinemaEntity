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
	
	@OneToMany(mappedBy = "hall")
	private List<Seans>seanses = new ArrayList<>();

	public Hall() {
		super();
		// TODO Auto-generated constructor stub
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

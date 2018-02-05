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

}

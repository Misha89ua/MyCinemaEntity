package ua.myProject.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "seans")
public class Seans extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;
	
	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall hall;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "ticket_price")
	private Long ticketPrice;
	
	@Column(name = "sold_tickets")
	private int soldTickets;
	
	@Column(name = "seans_length")
	private int seansLength;
	
}

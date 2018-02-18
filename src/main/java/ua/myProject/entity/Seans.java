package ua.myProject.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "seans")
public class Seans extends BaseEntity{
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "film_id")
	private Film film;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
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

	public Seans() {
	}

	public Seans(Date date, Long ticketPrice, int seansLength) {
		super();
		this.date = date;
		this.ticketPrice = ticketPrice;
		this.soldTickets = 0;
		this.seansLength = seansLength;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Long ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getSoldTickets() {
		return soldTickets;
	}

	public void setSoldTickets(int soldTickets) {
		this.soldTickets = soldTickets;
	}

	public int getSeansLength() {
		return seansLength;
	}

	public void setSeansLength(int seansLength) {
		this.seansLength = seansLength;
	}
}

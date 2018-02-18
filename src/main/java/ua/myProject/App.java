package ua.myProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.myProject.entity.Category;
import ua.myProject.entity.Film;
import ua.myProject.entity.FilmDetails;

public class App 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = factory.createEntityManager();
    	em.getTransaction().begin();
    	
//    	Film film = new Film("Terminator", 1995, 125);
//    	film.setFilmDetails(new FilmDetails("Terminator is e very strong man"));
//    	film.setCategory(new Category("Fantazy", "Some historical or another historys about old times."));
//    	em.persist(film);
    	
    	
    	
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    	
    }
}

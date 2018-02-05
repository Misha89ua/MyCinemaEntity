package ua.myProject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category extends BaseEntity{
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "category_description")
	private String categoryDescription;
	
	@OneToMany(mappedBy = "category")
	List<Film> films = new ArrayList<>();

}

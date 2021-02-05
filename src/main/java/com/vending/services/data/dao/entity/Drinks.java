/**
 * 
 */
package com.vending.services.data.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Hemraj
 *
 */

@Entity
@Table(name="drinks")
public class Drinks implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8033386903162459769L;

	private Integer id;
	private String name;
	private List<DrinkMaterial> DrinkMaterial=new ArrayList<>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	
  /*  @JoinTable( name = "student_sport",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns =@JoinColumn(name = "sport_id"))*/
	public List<DrinkMaterial> getDrinkMaterial() {
		return DrinkMaterial;
	}
	public void setDrinkMaterial(List<DrinkMaterial> drinkMaterial) {
		DrinkMaterial = drinkMaterial;
	}
	
	
}

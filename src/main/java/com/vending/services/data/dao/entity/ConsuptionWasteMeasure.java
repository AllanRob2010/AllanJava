/**
 * 
 */
package com.vending.services.data.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Hemraj
 *
 */
@Entity
@Table(name="consuption_waset_measure")
public class ConsuptionWasteMeasure implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7985311392081189432L;
	
	private Integer id;
	private String name;
	private Integer consuption;
	private Integer waste;
	private Drinks drinks;
	private DrinkMaterial drinkMaterial;
	
	
	
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
	@Column(name = "consuption")
	public Integer getConsuption() {
		return consuption;
	}
	public void setConsuption(Integer consuption) {
		this.consuption = consuption;
	}
	@Column(name = "waste")
	public Integer getWaste() {
		return waste;
	}
	public void setWaste(Integer waste) {
		this.waste = waste;
	}
	
	@ManyToOne
	public Drinks getDrinks() {
		return drinks;
	}
	public void setDrinks(Drinks drinks) {
		this.drinks = drinks;
	}
	
	@ManyToOne
	public DrinkMaterial getDrinkMaterial() {
		return drinkMaterial;
	}
	public void setDrinkMaterial(DrinkMaterial drinkMaterial) {
		this.drinkMaterial = drinkMaterial;
	}
	

}

/**
 * 
 */
package com.vending.services.data.dao.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Hemraj
 *
 */
@Entity
@Table(name="DrinkMaterial")
public class DrinkMaterial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1476394183396721446L;
	
	private Integer id;
	private String name;
	//private ConsuptionWasteMeasure measure;
	
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
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "consuption_id")
	public ConsuptionWasteMeasure getMeasure() {
		return measure;
	}
	public void setMeasure(ConsuptionWasteMeasure measure) {
		this.measure = measure;
	}*/
	
	
	
	

}

/**
 * 
 */
package com.vending.services.data.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hemraj
 *
 */
@Entity
@Table(name="item_containers")
public class ItemContainers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6870536962945570309L;
	
	private Integer id;
	private String name;
	private Integer capacity;
	private Integer refillCounter;
	
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
	@Column(name = "capacity")
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getRefillCounter() {
		return refillCounter;
	}
	public void setRefillCounter(Integer refillCounter) {
		this.refillCounter = refillCounter;
	}
	
	

}

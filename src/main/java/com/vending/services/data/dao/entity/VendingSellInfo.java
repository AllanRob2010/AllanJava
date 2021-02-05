/**
 * 
 */
package com.vending.services.data.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Hemraj
 *
 */

@Entity
@Table(name="sell_info")
public class VendingSellInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3952687271547790275L;

	private Integer id;
	private String drinkCatagoryName;
	private Integer qty;
	private Date sellDate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "drink_name")
	public String getDrinkCatagoryName() {
		return drinkCatagoryName;
	}
	public void setDrinkCatagoryName(String drinkCatagoryName) {
		this.drinkCatagoryName = drinkCatagoryName;
	}
	@Column(name = "quantity")
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	@Temporal(TemporalType.DATE)
	public Date getSellDate() {
		return sellDate;
	}
	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}
	
	
	
}

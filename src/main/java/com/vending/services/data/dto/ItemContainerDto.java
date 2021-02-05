/**
 * 
 */
package com.vending.services.data.dto;

/**
 * @author Hemraj
 *
 */
public class ItemContainerDto {
	
	private Integer id;
	private String name;
	private Integer capacity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemContainerDto [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}

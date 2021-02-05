/**
 * 
 */
package com.vending.services.data.dto;

/**
 * @author Hemraj
 *
 */
public class ConsuptionWasteMeasureDto {
	
	private Integer id;
	private String name;
	private Integer consuption;
	private Integer waste;
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
	public Integer getConsuption() {
		return consuption;
	}
	public void setConsuption(Integer consuption) {
		this.consuption = consuption;
	}
	public Integer getWaste() {
		return waste;
	}
	public void setWaste(Integer waste) {
		this.waste = waste;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConsuptionWasteMeasureDto [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", consuption=");
		builder.append(consuption);
		builder.append(", waste=");
		builder.append(waste);
		builder.append("]");
		return builder.toString();
	}
	
	

}

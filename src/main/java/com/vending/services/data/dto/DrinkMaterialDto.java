/**
 * 
 */
package com.vending.services.data.dto;

import com.vending.services.data.dao.entity.ConsuptionWasteMeasure;

/**
 * @author Hemraj
 *
 */
public class DrinkMaterialDto {

	private Integer id;
	private String name;
	private ConsuptionWasteMeasureDto measure;
	
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
	public ConsuptionWasteMeasureDto getMeasure() {
		return measure;
	}
	public void setMeasure(ConsuptionWasteMeasureDto measure) {
		this.measure = measure;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DrinkMaterialDto [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", measure=");
		builder.append(measure);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

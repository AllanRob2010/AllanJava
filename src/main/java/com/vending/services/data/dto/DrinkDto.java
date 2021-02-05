package com.vending.services.data.dto;

import java.util.ArrayList;
import java.util.List;

import com.vending.services.data.dao.entity.DrinkMaterial;

public class DrinkDto {

	private Integer id;
	private String name;
	private List<DrinkMaterial> DrinkMaterial=new ArrayList<>();
	
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
	public List<DrinkMaterial> getDrinkMaterial() {
		return DrinkMaterial;
	}
	public void setDrinkMaterial(List<DrinkMaterial> drinkMaterial) {
		DrinkMaterial = drinkMaterial;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DrinkDto [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", DrinkMaterial=");
		builder.append(DrinkMaterial);
		builder.append("]");
		return builder.toString();
	}
	
}

/**
 * 
 */
package com.vending.services.data.dao;

import com.vending.services.data.dao.entity.Drinks;

/**
 * @author Hemraj
 *
 */
public interface DrinkDao extends GenericDao<Drinks, Integer> {

	Drinks getDrinkByDrinkName(String coffeType);
	
	Object makeDrink(String drinkType, Integer qty);

	

}

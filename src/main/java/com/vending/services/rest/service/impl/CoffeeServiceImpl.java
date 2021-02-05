/**
 * 
 */
package com.vending.services.rest.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vending.services.data.dao.ConsuptionWasteMeasureDao;
import com.vending.services.data.dao.DrinkDao;
import com.vending.services.data.dao.entity.ConsuptionWasteMeasure;
import com.vending.services.data.dao.entity.DrinkMaterial;
import com.vending.services.data.dao.entity.Drinks;
import com.vending.services.rest.service.CoffeeService;

/**
 * @author Hemraj
 *
 */
@Service
public class CoffeeServiceImpl implements CoffeeService {

	private Logger			LOGGER	= LoggerFactory.getLogger(CoffeeServiceImpl.class);
	
	@Autowired
	private DrinkDao drinnkDao;
	
	
	@Override
	@Transactional
	public Object makeCoffee(String drinkType,Integer qty) {
		// TODO Auto-generated method stub
		LOGGER.info("CoffeeServiceImpl");
		 return drinnkDao.makeDrink(drinkType,qty);
	}
	
}

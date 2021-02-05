/**
 * 
 */
package com.vending.services.rest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vending.services.data.dao.DrinkDao;
import com.vending.services.rest.service.TeaServices;

/**
 * @author Hemraj
 *
 */
@Service
public class TeaServiceImpl implements TeaServices {

	private Logger			LOGGER	= LoggerFactory.getLogger(TeaServiceImpl.class);
	
	@Autowired
	private DrinkDao drinnkDao;
	@Override
	@Transactional
	public Object makeTea(String teaType ,Integer qty) {
		// TODO Auto-generated method stub
		LOGGER.info("TeaServiceImpl ... makeTea");
		return drinnkDao.makeDrink(teaType,qty);
	}

}

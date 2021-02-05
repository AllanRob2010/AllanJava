/**
 * 
 */
package com.vending.services.data.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.vending.services.data.dao.ItemContainerDao;
import com.vending.services.data.dao.entity.ItemContainers;

/**
 * @author Hemraj
 *
 */

@Repository
public class ItemContainerDaoImpl extends GenericDaoImpl<ItemContainers, Integer> implements ItemContainerDao{

	private Logger							LOGGER	= LoggerFactory.getLogger(ItemContainerDaoImpl.class);
	
	@Override
	public ItemContainers getItemCaontainerByName(String name) {
		
		LOGGER.info("getItemContainerByName");
		Criteria crit=getSession().createCriteria(ItemContainers.class);
		crit.add(Restrictions.like("name", name));
		List<ItemContainers> items=null;
		ItemContainers item=null;
		
		try {
			
			items=crit.list();
			
		
			item=items.get(0);
			LOGGER.info("getItemContainerByName"+item);
		} catch (Exception e) {
			
		}
		
		
		return item;
		
		
	}

	@Override
	public List<ItemContainers> getAllContainers() {
		Criteria crit=getSession().createCriteria(ItemContainers.class);
		
		List<ItemContainers> list=new ArrayList<>();
		list=crit.list();
		return list;
	}


}

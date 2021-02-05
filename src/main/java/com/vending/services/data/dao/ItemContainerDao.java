/**
 * 
 */
package com.vending.services.data.dao;

import java.util.List;

import com.vending.services.data.dao.entity.ItemContainers;

/**
 * @author Hemraj
 *
 */
public interface ItemContainerDao extends GenericDao<ItemContainers, Integer> {

	ItemContainers getItemCaontainerByName(String name);

	List<ItemContainers> getAllContainers();

	

}

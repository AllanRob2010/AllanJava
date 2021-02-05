/**
 * 
 */
package com.vending.services.data.dao;

import java.util.List;

import com.vending.services.data.dao.entity.ConsuptionWasteMeasure;

/**
 * @author Hemraj
 *
 */
public interface ConsuptionWasteMeasureDao extends GenericDao<ConsuptionWasteMeasure, Integer> {

	List<ConsuptionWasteMeasure> getConsuptionListByDrinkId(Integer id);

}

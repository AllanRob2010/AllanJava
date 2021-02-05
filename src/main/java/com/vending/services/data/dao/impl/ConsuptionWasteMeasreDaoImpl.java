/**
 * 
 */
package com.vending.services.data.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.vending.services.data.dao.ConsuptionWasteMeasureDao;
import com.vending.services.data.dao.entity.ConsuptionWasteMeasure;

/**
 * @author Hemraj
 *
 */
@Repository
public class ConsuptionWasteMeasreDaoImpl extends GenericDaoImpl<ConsuptionWasteMeasure, Integer> implements ConsuptionWasteMeasureDao{

	
	
	@Override
	public List<ConsuptionWasteMeasure> getConsuptionListByDrinkId(Integer id) {
		// TODO Auto-generated method stub
		List<ConsuptionWasteMeasure> consuption=null;
		Criteria crit =getSession().createCriteria(ConsuptionWasteMeasure.class);
		crit.add(Restrictions.in("drinks_id", id));
		
		consuption=crit.list();
		
		
		return consuption;
	}
	
	

}

/**
 * 
 */
package com.vending.services.data.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vending.services.data.dao.ConsuptionWasteMeasureDao;
import com.vending.services.data.dao.DrinkDao;
import com.vending.services.data.dao.ItemContainerDao;
import com.vending.services.data.dao.VendingSellInfoDao;
import com.vending.services.data.dao.entity.ConsuptionWasteMeasure;
import com.vending.services.data.dao.entity.DrinkMaterial;
import com.vending.services.data.dao.entity.Drinks;
import com.vending.services.data.dao.entity.ItemContainers;
import com.vending.services.data.dao.entity.VendingSellInfo;

/**
 * @author Hemraj
 *
 */
@Repository
public class DrinkDaoImpl  extends GenericDaoImpl<Drinks, Integer> implements DrinkDao {

	@Autowired
	private ConsuptionWasteMeasureDao consuptionDao;
	
	@Autowired
	private  ItemContainerDao itemContainerDao;
	
	@Autowired
	private VendingSellInfoDao sellDao;

	
	
	@Override
	public Drinks getDrinkByDrinkName(String drinkType) {
		// TODO Auto-generated method stub
		Drinks drink=null;
		Criteria crit=getSession().createCriteria(Drinks.class);
		crit.add(Restrictions.eq("name", drinkType));
		
		List<Drinks> result=crit.list();
		
		for (Drinks drinks :result){
			
			drink=drinks;
			
		}
			
		return drink;
	}



@Override
public Object makeDrink(String drinkType,Integer qty) {
	
	     Drinks drink=null;
		List<DrinkMaterial> drinkMaterialList=null;
		drink=getDrinkByDrinkName(drinkType);
		drinkMaterialList=drink.getDrinkMaterial();
		
		List<ConsuptionWasteMeasure> consuptionList=null;
		consuptionList=consuptionDao.getConsuptionListByDrinkId(drink.getId());
		
		int usable=0;
		int waste=0;
		int used=0;
		ItemContainers container=null;
		
		VendingSellInfo sellInfo=new VendingSellInfo();
		
		for (ConsuptionWasteMeasure consuption:consuptionList){
			
			
			for (DrinkMaterial materia:drinkMaterialList){
				
				if(consuption.getDrinks().getId()==drink.getId()&&consuption.getDrinkMaterial().getId()==materia.getId()&&consuption.getName()==materia.getName()){
					
					usable=consuption.getConsuption();
					waste=consuption.getWaste();
					used=(usable+waste)*qty;
					
					container=itemContainerDao.getItemCaontainerByName(materia.getName());
					if(container.getCapacity()>=used){
						
						container.setCapacity(container.getCapacity()-used);
						
						itemContainerDao.saveOrUpdate(container);
						
						sellInfo.setDrinkCatagoryName(container.getName());
						sellInfo.setQty(qty);
						sellDao.saveOrUpdate(sellInfo);
					}
					
					
				}
					
				
				
			}
			
			
			
		}
	return "Enjoy your Drink !!";
}

}

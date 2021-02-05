/** * 
 */
package com.vending.services.rest.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vending.services.data.dao.ItemContainerDao;
import com.vending.services.data.dao.VendingSellInfoDao;
import com.vending.services.data.dao.entity.ItemContainers;
import com.vending.services.rest.service.ItemContainerService;

/**
 * @author Hemraj
 *
 */
@Service
public class ItemContainerServiceImpl implements ItemContainerService{

	
	@Autowired
	private ItemContainerDao containerDao;
	
	@Autowired
	private VendingSellInfoDao sellInfoDao;
	@Override
	@Transactional
	public Object refillContainer(int waterQt, int milkQt, int sugerQt, int teaQt, int coffyQt) {
		// TODO Auto-generated method stub
		String message="";
		ItemContainers container=new ItemContainers();
		List<ItemContainers> containerList=null;
		
		if(waterQt<0||milkQt<0||sugerQt<0||sugerQt<0||teaQt<0||coffyQt<0){
			
			message="Items quantity provided can not be less than 0";
		}
		else {
			
			containerList= containerDao.getAllContainers();
			for (ItemContainers itemCont:containerList){
				
				if(itemCont.getName().equalsIgnoreCase("Water")){
					
					itemCont.setCapacity(waterQt);
					itemCont.setRefillCounter(itemCont.getRefillCounter()+1);
					
				}
				else if (itemCont.getName().equalsIgnoreCase("Suger")){
					itemCont.setCapacity(sugerQt);
					itemCont.setRefillCounter(itemCont.getRefillCounter()+1);
					
				}
				else if (itemCont.getName().equalsIgnoreCase("Tea")){
					itemCont.setCapacity(teaQt);
					itemCont.setRefillCounter(itemCont.getRefillCounter()+1);
					
				}
				else if (itemCont.getName().equalsIgnoreCase("Coffee")){
					itemCont.setCapacity(coffyQt);
					itemCont.setRefillCounter(itemCont.getRefillCounter()+1);
					
				}
				else if (itemCont.getName().equalsIgnoreCase("Milk")){
					itemCont.setCapacity(milkQt);
					itemCont.setRefillCounter(itemCont.getRefillCounter()+1);
					
				}
				containerDao.saveOrUpdate(itemCont);
				message="Successfully Refilled";
			}
		}
		return message;
	}
	@Override
	@Transactional
	public Object resetContainer(int reset) {
		List<ItemContainers> containerList=null;
		containerList= containerDao.getAllContainers();
		
		for(ItemContainers item:containerList){
			
			item.setCapacity(reset);
			containerDao.saveOrUpdate(item);
			
		}
		return "Reset SuccessFully";
	}
	@Override
	@Transactional
	public Object containerStatus() {
		List<ItemContainers> containerList=null;
		containerList= containerDao.getAllContainers();
		Map<String ,Integer> contStatusMap=new HashMap<>();
		for (ItemContainers item:containerList){
			
			if(item.getName().equalsIgnoreCase("Water")){
				
				contStatusMap.put("Water", item.getCapacity());
				
			}
			else if (item.getName().equalsIgnoreCase("Suger")){
				contStatusMap.put("Water", item.getCapacity());
				
			}
			else if (item.getName().equalsIgnoreCase("Tea")){
				contStatusMap.put("Suger", item.getCapacity());
				
			}
			else if (item.getName().equalsIgnoreCase("Coffee")){
				contStatusMap.put("Coffee", item.getCapacity());
				
			}
			else if (item.getName().equalsIgnoreCase("Milk")){
				contStatusMap.put("Milk", item.getCapacity());
				
			}
			
		}
		return contStatusMap;
	}
	@Override
	@Transactional
	public Object getTotalSellInfo() {
			
		
		return 	sellInfoDao.getEntities();
		
		
		
	}

}

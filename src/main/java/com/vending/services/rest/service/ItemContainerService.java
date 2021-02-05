/**
 * 
 */
package com.vending.services.rest.service;

/**
 * @author Hemraj
 *
 */
public interface ItemContainerService {

	Object refillContainer(int waterQt, int milkQt, int sugerQt, int teaQt, int coffyQt);

	Object resetContainer(int reset);

	Object containerStatus();

	Object getTotalSellInfo();

}

/**
 * 
 */
package com.vending.services.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vending.services.rest.model.ErrorResponse;
import com.vending.services.rest.service.CoffeeService;
import com.vending.services.rest.service.ItemContainerService;
import com.vending.services.rest.service.TeaServices;



/**
 * @author Hemraj
 *
 */

@RestController
@RequestMapping("/vendor")
public class VendingController {
	
	private Logger				LOGGER	= LoggerFactory.getLogger(VendingController.class);

	@Autowired
	private CoffeeService coffeeService;
	
	@Autowired
	private TeaServices teaService;
	
	@Autowired
	private ItemContainerService itemService;

	
	
	@ResponseBody
	@RequestMapping(value = "/make-coffee", method = RequestMethod.GET)
	public Object makeCoffee(@PathVariable String coffeType ,Integer qty,HttpServletResponse response){
		
		Object data =null;
		
		
			
		try {
			data=coffeeService.makeCoffee(coffeType,qty);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value = "/make-tea", method = RequestMethod.GET)
	public Object makeTeaCoffee(@PathVariable String teaType , Integer qty,HttpServletResponse response){
		
		Object data =null;
		
		
			
		try {
			data=teaService.makeTea(teaType,qty);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value = "/refill-container", method = RequestMethod.PUT)
	public Object refillContainer(HttpServletRequest req ,HttpServletResponse response){
		
		Object data =null;
		int waterQt=Integer.parseInt(req.getParameter("waterQt"));
		int milkQt=Integer.parseInt(req.getParameter("milkQt"));
		int sugerQt=Integer.parseInt(req.getParameter("sugerQt"));
		int teaQt=Integer.parseInt(req.getParameter("teaQt"));
		int coffyQt=Integer.parseInt(req.getParameter("coffyQt"));
		
		try {
			data=itemService.refillContainer(waterQt,milkQt,sugerQt,teaQt,coffyQt);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value = "/reset-container", method = RequestMethod.PUT)
	public Object resetContainer(HttpServletRequest req ,HttpServletResponse response){
		
		Object data =null;
		int reset=Integer.parseInt(req.getParameter("reset"));
		try {
			data=itemService.resetContainer(reset);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}
	@ResponseBody
	@RequestMapping(value = "/container-status", method = RequestMethod.GET)
	public Object containerStatus(HttpServletRequest req ,HttpServletResponse response){
		
		Object data =null;
		
		try {
			data=itemService.containerStatus();
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value = "/totalsell-info", method = RequestMethod.GET)
	public Object checkTotalSaleInfo(HttpServletRequest req ,HttpServletResponse response){
		
		Object data =null;
		
		try {
			data=itemService.getTotalSellInfo();
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage(), e);
			data = new ErrorResponse();
			((ErrorResponse) data).setMessage(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		return data;
	}

}

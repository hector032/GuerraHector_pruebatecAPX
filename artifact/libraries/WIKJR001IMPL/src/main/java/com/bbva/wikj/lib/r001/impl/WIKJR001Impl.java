package com.bbva.wikj.lib.r001.impl;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR001Impl class...
 */
public class WIKJR001Impl extends WIKJR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR001Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
	}

	@Override
	public CustomerOut executeInsert(CustomerIn customer) {
		CustomerOut customerOut = new CustomerOut();
		Map<String,String> args = new HashMap<>();
		args.put("id", customer.getId());
		args.put("customer_id", customer.getCustomerId());
		args.put("info", customer.getInfo());
		int result = this.jdbcUtils.update("querie.insert", args);
		LOGGER.info("El result del insert es:"+ result);
		if(result==0){
			customerOut.setId(customer.getId());
		}
		return customerOut;
	}
}

package com.bbva.wikj.lib.r123.impl;

import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR123Impl class...
 */
public class WIKJR123Impl extends WIKJR123Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR123Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id",customerIn.getId());
		args.put("customer_id",customerIn.getCustomerId());
		args.put("info",customerIn.getInfo());
		return this.jdbcUtils.update("query.insert",args);

	}

	@Override
	public CustomerOut executeSelect(String customerId) {
		Map<String, Object> result = new HashMap<>();
		result = this.jdbcUtils.queryForMap("query.select",customerId);
		CustomerOut customerOut = new CustomerOut();
		//customerOut.setCustomerId((String)result.get("customer_id")); mejor manera la de abajo
		customerOut.setCustomerId(String.valueOf(result.get("customer_id")));
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setInfo(String.valueOf(result.get("info")));

		return customerOut;
	}



}

package com.bbva.wikj.lib.r456.impl;

import com.bbva.wikj.dto.clientes.CustomerIn;
import com.bbva.wikj.dto.clientes.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR456Impl class...
 */
public class WIKJR456Impl extends WIKJR456Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR456Impl.class);

	/**
	 * The execute method...
	 */

	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id",customerIn.getId());
		args.put("nuip",customerIn.getNuip());
		args.put("full_name",customerIn.getFullName());
		args.put("phone",customerIn.getPhone());
		args.put("address",customerIn.getAddress());
		return this.jdbcUtils.update("query.insert",args);

	}

	@Override
	public CustomerOut executeSelect(String id) {
		Map<String, Object> result = new HashMap<>();
		result = this.jdbcUtils.queryForMap("query.select",id);
		CustomerOut customerOut = new CustomerOut();
		customerOut.setNuip(String.valueOf(result.get("nuip")));
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setFullName(String.valueOf(result.get("full_name")));
		customerOut.setPhone(String.valueOf(result.get("phone")));
		customerOut.setAddress(String.valueOf(result.get("address")));
		return customerOut;

	}
}

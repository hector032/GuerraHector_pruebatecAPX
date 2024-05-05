package com.bbva.wikj;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;
import com.bbva.wikj.lib.r001.WIKJR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT00101ESTransaction extends AbstractWIKJT00101ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00101ESTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR001 wikjr001 = this.getServiceLibrary(WIKJR001.class);
		CustomerIn customer = this.getCustomerin();
		CustomerOut customerOut = wikjr001.executeInsert(customer);
		this.setCustomerout(customerOut);
	}

}

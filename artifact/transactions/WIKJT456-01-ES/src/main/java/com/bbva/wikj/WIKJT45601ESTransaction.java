package com.bbva.wikj;

import com.bbva.wikj.dto.clientes.CustomerIn;
import com.bbva.wikj.dto.clientes.CustomerOut;
import com.bbva.wikj.lib.r456.WIKJR456;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * pruebaTecnica
 *
 */
public class WIKJT45601ESTransaction extends AbstractWIKJT45601ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT45601ESTransaction.class);

	@Override
	public void execute() {
		WIKJR456 wikjR456 = this.getServiceLibrary(WIKJR456.class);
		CustomerIn customer = this.getCustomerin();
		int result = wikjR456.executeInsert(customer);

		if(result == 0){
			setCustomerout(null);
		}else{
			CustomerOut customerOut = wikjR456.executeSelect(customer.getId());
			setCustomerout(customerOut);
		}
	}

}

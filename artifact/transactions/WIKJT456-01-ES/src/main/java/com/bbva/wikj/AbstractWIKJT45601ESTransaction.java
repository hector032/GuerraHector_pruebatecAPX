package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.clientes.CustomerIn;
import com.bbva.wikj.dto.clientes.CustomerOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT45601ESTransaction extends AbstractTransaction {

	public AbstractWIKJT45601ESTransaction(){
	}


	protected CustomerIn getCustomerin(){
		return (CustomerIn)this.getParameter("customerIn");
	}


	protected void setCustomerout(final CustomerOut field){
		this.addParameter("customerOut", field);
	}
}

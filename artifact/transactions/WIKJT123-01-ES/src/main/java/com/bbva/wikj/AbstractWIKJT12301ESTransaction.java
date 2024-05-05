package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;


public abstract class AbstractWIKJT12301ESTransaction extends AbstractTransaction {

	public AbstractWIKJT12301ESTransaction(){
	}

	protected CustomerIn getCustomerin(){
		return (CustomerIn)this.getParameter("customerIn");
	}


	protected void setCustomerout(final CustomerOut field){
		this.addParameter("customerOut", field);
	}
}

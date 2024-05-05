package com.bbva.wikj.lib.r001;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;

/**
 * The  interface WIKJR001 class...
 */
public interface WIKJR001 {

	/**
	 * The execute method...
	 */
	void execute();

	CustomerOut executeInsert(CustomerIn customer);

}

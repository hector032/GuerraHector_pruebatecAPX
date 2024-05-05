package com.bbva.wikj.lib.r456;

import com.bbva.wikj.dto.clientes.CustomerIn;
import com.bbva.wikj.dto.clientes.CustomerOut;

/**
 * The  interface WIKJR456 class...
 */
public interface WIKJR456 {

	/**
	 * The execute method...
	 */

	int executeInsert(CustomerIn customerIn);

	CustomerOut executeSelect(String id);

}

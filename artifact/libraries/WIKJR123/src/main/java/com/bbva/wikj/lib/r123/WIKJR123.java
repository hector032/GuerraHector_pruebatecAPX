package com.bbva.wikj.lib.r123;

import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;

/**
 * The  interface WIKJR123 class...
 */
public interface WIKJR123 {




	int executeInsert(CustomerIn customerIn);

    CustomerOut executeSelect(String id);

}

package com.bbva.wikj.dto.ejemploselect;

import java.io.Serializable;

/**
 * The ExampleDTO class...
 */
public class CustomerOut implements Serializable  {

	private String id;
	private String customerId;
	private String info;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}

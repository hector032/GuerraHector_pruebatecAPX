package com.bbva.wikj.dto.customer;

import java.io.Serializable;

/***
 * DTO for customer
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

	@Override
	public String toString() {
		return "CustomerIn{" +
				"id='" + id + '\'' +
				", customerId='" + customerId + '\'' +
				", info='" + info + '\'' +
				'}';
	}
}

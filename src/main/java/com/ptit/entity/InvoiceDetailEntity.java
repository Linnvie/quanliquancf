package com.ptit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="invoices_details")
public class InvoiceDetailEntity {
	@EmbeddedId
	private InvoiceDetailKey id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="price")
	private Float price;

	public InvoiceDetailKey getId() {
		return id;
	}

	public void setId(InvoiceDetailKey id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}

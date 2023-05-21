package com.ptit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ChiTietPhieuNhap")
public class PurcharOrderDetailEntity {
	@EmbeddedId
	private PurcharOrderDetailKey id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="price")
	private Float price;

	public PurcharOrderDetailKey getId() {
		return id;
	}

	public void setId(PurcharOrderDetailKey id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity instanceof Integer) {
			this.quantity = quantity;
		}else {
			this.quantity = 0;
		}
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		if(price instanceof Number) {
			this.price = price;
		}else {
			this.price = (float) 0;
		}
	}
	
}

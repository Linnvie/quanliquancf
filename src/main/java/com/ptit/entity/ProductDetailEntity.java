package com.ptit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product_detail")
public class ProductDetailEntity {
	@EmbeddedId
	private ProductDetailKey id;
	
	@Column(name="quantity_detail")
	private Integer quantityDetail;

	public ProductDetailKey getId() {
		return id;
	}

	public void setId(ProductDetailKey id) {
		this.id = id;
	}

	public Integer getQuantityDetail() {
		return quantityDetail;
	}

	public void setQuantityDetail(Integer quantityDetail) {
		if (quantityDetail instanceof Integer) {
			this.quantityDetail = quantityDetail;
		}else {
			this.quantityDetail = 0;
		}
	}
	
}

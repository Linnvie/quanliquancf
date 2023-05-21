package com.ptit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PurcharOrderDetailKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="purchar_order_id")
	private Long purcharOrderId;
	
	@Column(name="material_id")
	private String materialId;

	public Long getPurcharOrderId() {
		return purcharOrderId;
	}

	public void setPurcharOrderId(Long purcharOrderId) {
		this.purcharOrderId = purcharOrderId;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

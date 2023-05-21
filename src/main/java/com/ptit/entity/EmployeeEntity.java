package com.ptit.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="ho")
	private String ho;
	
	@Column(name="name")
	private String name;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="gender")
	private Boolean gender;
	
	@Column(name="address")
	private String address;
	
	@Column(name="sdt")
	private String sdt;
	
	@Column(name="cmnd")
	private String cmnd;
	
	@Column(name="is_manage")
	private Boolean isManage;	
	
	@OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
    private UserEntity employee;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Boolean getIsManage() {
		return isManage;
	}

	public void setIsManage(Boolean isManage) {
		this.isManage = isManage;
	}

	public UserEntity getEmployee() {
		return employee;
	}

	public void setEmployee(UserEntity employee) {
		this.employee = employee;
	}	
	
}

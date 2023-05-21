package com.ptit.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class RoleEntity {
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="role", fetch=FetchType.EAGER)
	private List<UserEntity> UserList = new ArrayList<UserEntity>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserEntity> getUserList() {
		return UserList;
	}

	public void setUserList(List<UserEntity> userList) {
		UserList = userList;
	}

	
	
	
}

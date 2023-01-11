package com.hibernate.operation.crud.UsersDao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users_Details")
public class Users {
	@Id
	private int id;
	private String name;
	private String state;
	public Users() {
		super();
	}
	public Users(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" , "+this.name+" , "+this.state;
	}
	

}

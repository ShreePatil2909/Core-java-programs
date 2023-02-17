package com.prowings;

public class Voter {

	int v_id;
	String name;
	String city;
	public Voter(int v_id, String name, String city) {
		super();
		this.v_id = v_id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Voter [v_id=" + v_id + ", name=" + name + ", city=" + city + "]";
	}
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

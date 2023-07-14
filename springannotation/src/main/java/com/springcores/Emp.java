package com.springcores;

public class Emp 
{
  private Address addres;

public Address getAddres() {
	return addres;
}

public void setAddres(Address addres) {
	this.addres = addres;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address addres) {
	super();
	this.addres = addres;
}

@Override
public String toString() {
	return "Emp";
}
  
}

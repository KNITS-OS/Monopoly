package com.knits.proto.monopoly.domain;

public class Property {

	public Property(String title, int nominalPrice, Group group) {
		super();
		this.title = title;
		this.nominalPrice = nominalPrice;
		this.group = group;
	}
	private String title;
	private int nominalPrice;
	private boolean mortgage;
	private Group group;
	private Player owner;
	private int currentRealEstate;
	
	
	
	
	public boolean isMortgage() {
		return mortgage;
	}

	public void setMortgage(boolean mortgage) {
		this.mortgage = mortgage;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getCurrentRealEstate() {
		return currentRealEstate;
	}

	public void setCurrentRealEstate(int currentRealEstate) {
		this.currentRealEstate = currentRealEstate;
	}

	public String getTitle() {
		return title;
	}


	public int getNominalPrice() {
		return nominalPrice;
	}

	public Group getGroup() {
		return group;
	}

	public enum Group{
		
		BROWN,
		CYAN,
		PINK,
		ORANGE,
		RED,
		YELLOW,
		GREEN,
		BLUE,
		STATION,
		ENERGY
	}
}

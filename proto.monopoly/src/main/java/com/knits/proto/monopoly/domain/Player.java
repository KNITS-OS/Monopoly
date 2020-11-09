package com.knits.proto.monopoly.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

	private String name;
	private int balance;
	private int currentPosition;
	private List<Property> assets;
	private Set<String> groupCompleted = new HashSet<String>();
	
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public List<Property> getAssets() {
		return assets;
	}
	public void setAssets(List<Property> assets) {
		this.assets = assets;
	}
	
	
}

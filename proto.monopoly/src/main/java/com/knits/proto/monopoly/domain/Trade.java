package com.knits.proto.monopoly.domain;

import java.util.List;

public class Trade {
	
	private List<Property> offeredProperties;
	private int fundsOffered;
	private List<Property> requestedProperties;
	private int fundsRequested;
	private Player sender;
	private Player recipient;
	
	
	public Player getSender() {
		return sender;
	}
	public void setSender(Player sender) {
		this.sender = sender;
	}

	public List<Property> getOfferedProperties() {
		return offeredProperties;
	}
	public void setOfferedProperties(List<Property> offeredProperties) {
		this.offeredProperties = offeredProperties;
	}
	public int getFundsOffered() {
		return fundsOffered;
	}
	public void setFundsOffered(int fundsOffered) {
		this.fundsOffered = fundsOffered;
	}
	public List<Property> getRequestedProperties() {
		return requestedProperties;
	}
	public void setRequestedProperties(List<Property> requestedProperties) {
		this.requestedProperties = requestedProperties;
	}
	public int getFundsRequested() {
		return fundsRequested;
	}
	public void setFundsRequested(int fundsRequested) {
		this.fundsRequested = fundsRequested;
	}
	public Player getRecipient() {
		return recipient;
	}
	public void setRecipient(Player recipient) {
		this.recipient = recipient;
	}
	
	
	
}

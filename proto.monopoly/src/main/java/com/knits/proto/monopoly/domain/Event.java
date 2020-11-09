package com.knits.proto.monopoly.domain;

public class Event {

	private Player sender;
	private Object content;
	
	
	public Player getSender() {
		return sender;
	}
	public void setSender(Player sender) {
		this.sender = sender;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	
}

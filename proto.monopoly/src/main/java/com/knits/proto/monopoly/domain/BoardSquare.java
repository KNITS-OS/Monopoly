package com.knits.proto.monopoly.domain;

public class BoardSquare {

	private String title;
	private Type type;
	
	
	public BoardSquare(String title,Type type) {
		super();
		this.title = title;
		this.type=type;
	}
	
	public Type getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}
		
	public static enum Type {
		INFRA, PROPERTY,CHANCE,START,GO_TO_JAIL,PENALTY
	}
}

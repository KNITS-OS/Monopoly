package com.knits.proto.monopoly.demo;

import com.knits.proto.monopoly.domain.Event;
import com.knits.proto.monopoly.domain.Game;
import com.knits.proto.monopoly.domain.Player;
import com.knits.proto.monopoly.domain.Trade;

public class DemoMonopoly {

	private static Game game;
	
	public static void main(String[] args) {
		
		game= new Game();
		
		game.addPlayer(new Player("Stefano"));
		game.addPlayer(new Player("Maarja"));
		game.addPlayer(new Player("Raul"));
		
		
		game.startGame();
	
		game.nextTurn();
		
	}
	
	private static void testEvents() {
		
		Event eventTrade =UISimulator.newOfferTrade(game.getPlayerByIndex(0), game.getPlayerByIndex(1));
		game.offerTrade(eventTrade);
		
		
	}
	
	private static void testOneRoundEvents() {
		
		//Player in turn:
		Player firstPlayer = game.nextPlayerInTurn();
				
		//1) offerTrade
		
		
		
		
		//2) recipient Player accepts Trade
		
		
		
		//3) player moveToNext		
	}
	
	
	
	
	
	
	
}

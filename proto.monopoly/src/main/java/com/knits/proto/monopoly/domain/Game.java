package com.knits.proto.monopoly.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

import com.knits.proto.monopoly.domain.ui.Event;
import com.knits.proto.monopoly.domain.ui.Notification;
import com.knits.proto.monopoly.utils.NotificationUtils;




public class Game {

	private static final String BANK="Bank";
	private static final Random RANDOM = new Random();

	private List<Player> players= new ArrayList<Player>(8);
	
	private Map<Integer, BoardSquare> position2BoardSquare= new HashMap<Integer, BoardSquare>(40);
	private Map<String, Property> title2Property= new HashMap<String, Property>(26);
	
	
	public Game() {
		
		String mediterraneanAvenueTitleDeed ="Mediterranean Avenue";
		String balticAvenueTitleDeed ="Baltic Avenue";
		String chance ="Chance";
		
		
		//1) load all BoardSquare in Board
		position2BoardSquare.put(0, new BoardSquare("Start",BoardSquare.Type.START));		
		position2BoardSquare.put(1, new BoardSquare(mediterraneanAvenueTitleDeed,BoardSquare.Type.PROPERTY));
		position2BoardSquare.put(2, new BoardSquare(chance,BoardSquare.Type.CHANCE));
		position2BoardSquare.put(3, new BoardSquare(balticAvenueTitleDeed,BoardSquare.Type.PROPERTY));
		// ...
		
				
		//2) load all Property in title2Property
		title2Property.put(mediterraneanAvenueTitleDeed, new Property(mediterraneanAvenueTitleDeed,60,Property.Group.BROWN));
		title2Property.put(balticAvenueTitleDeed, new Property(balticAvenueTitleDeed,60,Property.Group.BROWN));
		// ...
		
		
		
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void startGame() {
		
		//1) assignCardToPlayer
		//2) Set all player to false
		//3) Set 1st player in turn to true
	}
	
	
	
	public void nextTurn() {
		// player in turn receives notification about his/her turn
		//all other player receive notification that blocks their interface
	}
	
	
	public void offerTrade (Event trade) {
		
		//1) notification is created and added to All Players notificationBox;
		//2) turn is enabled for Player who needs to answer
		
	}
	

	
	
	public void acceptTrade (Event trade) {
		//1) update Player properties
		//2) update Players balance
		//3) send notification to all players about trade accepted
		//2) turn is enabled for Player who made offer
	}

	
	public void rejectTrade (Event trade) {
		//1) update Player properties
		//2) update Players balance
		//2) turn is enabled for Player who made offer
	}
	
	
	public void askMortgage(Event propertyToMortgage) {
		//1) update Player balance
		//2) update Player Property mortgage
	}
	
	public void paybackMortgage(Event propertyToMortgage) {
		//1) update Player balance
		//2) update Player Property mortgage
	}
	
	public void payment (Event payment) {
		//1) decrease sender balance
		//2) increase recipient balance
	}
	
	public void buildRealEstate (Event build) {
		//1)  validations:
			//1.1) (Player owns whole group)
			//1.2) (Player has enough funds)
		
		//2) update Players balance
		//3) update Property currentRealEstate
	}
	
	
	
	
	
	
	
	
	
	
	
	public Player getPlayerByIndex(int index) {
		return players.get(index);
	}
	
	public Player nextPlayerInTurn() {
		throw new UnsupportedOperationException("nextPlayerInTurn not yet implemented");
	}

	
	
	public void moveToNextDestination (Event moveRequest) {
		
		//cases to consider:
		int steps=stepsFromDice();
		int newPosition =moveRequest.getSender().getCurrentPosition()+steps;		
		Player movingPlayer=moveRequest.getSender();
		
		if(newPosition>=40) {
			//passed through Start
			newPosition=newPosition-40;
			handlePassThroughStart(movingPlayer);
		}
		
		movingPlayer.setCurrentPosition(newPosition);
		// Send PlayerPositionUpdate Notification
		
		
		BoardSquare land =position2BoardSquare.get(newPosition);
		
		switch (land.getType()) {
		
		/**
		//  land on a  Property:
		//		1.1) belonging to other Player
		//		1.2) belonging to moving Player
		//		1.2) belonging to Bank
		 * 
		 */
		case PROPERTY:
			Property property = title2Property.get(land.getTitle());
			
			if (property.getOwner().getName().equals(BANK)) {
			
			} else if (!(property.getOwner().getName().equals(movingPlayer.getName()))) {
				//1) Debit Notification to movingPlayer
				//2) Credit Notification to property.getOwner()
				
			} else {
				//just log that player went on his/her own property				
				
			}
			
			
			break;
			
		/**
		 * land on a Penalty square (IncomeTax, LuxuryTax)
		 */
		case PENALTY:
			break;
				
			
		/**
		 * Land on CommunityChest | Chance square
		 */
		case CHANCE:
			break;
		
		/**
		 * Land on Go to jail
		 */
		case GO_TO_JAIL:
			break;
		
		
		/**
		 * Infrastructure Land (Transit , Parking)
		 */
		case INFRA:
			sendNotification(NotificationUtils.newUpdatePositionNotification(newPosition));
			break;	
			
			
		
		default:
				throw new IllegalStateException("No Suitable Land Type found");
		}
		
		
		
	}

	private void assignCardToPlayer(Player player) {
		
		//1) initial properties are added to Player assets
		//2) player funds are decreased by the properties nominalPrice
		
	}
	
	
	private void handlePassThroughStart(Player sender) {
		// TODO Auto-generated method stub
		
	}

	private int stepsFromDice() {
		int firstDie = RANDOM.nextInt(6)+1;
		int secondDie = RANDOM.nextInt(6)+1;
		return firstDie+secondDie;
	}


	
	
	private void sendNotification(Notification notification) {
		throw new UnsupportedOperationException("nextPlayerInTurn not yet implemented");		
	}
}

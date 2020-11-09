package com.knits.proto.monopoly.utils;

import com.knits.proto.monopoly.domain.Player;
import com.knits.proto.monopoly.domain.ui.Event;
import com.knits.proto.monopoly.domain.ui.Trade;

public class UISimulator {

	public static Event newOfferTrade(Player sender, Player recipient) {

	
		Trade trade = new Trade();
		trade.setSender(sender);
		trade.setRecipient(recipient);
		trade.getOfferedProperties().add(sender.getAssets().get(2));
		trade.getRequestedProperties().add(recipient.getAssets().get(1));
		trade.setFundsRequested(50);
		
		Event offerTrade = new Event();
		offerTrade.setContent(trade);
		offerTrade.setSender(sender);		
		return offerTrade;		
	}
	
	public static Event acceptOffer(Player sender) {
		
		Event event = new Event();
		//event.setContent(trade);
		event.setSender(sender);		
		return event;		
	}
	
	public static Event newRealEstateBuildEvent(Player sender) {
		
		
		
		
		Event event = new Event();
		//event.setContent(trade);
		event.setSender(sender);		
		return event;	
	}
	
	
}

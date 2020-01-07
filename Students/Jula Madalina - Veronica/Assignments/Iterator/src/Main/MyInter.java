package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class MyInter implements OrderedIterator{
	/*
	public Card[] cards = {
			new Card("2","heart"),
			new Card("3","heart"),
			new Card("4","heart"),
			new Card("5","heart"),
			new Card("6","heart"),
			new Card("7","heart"),
			new Card("8","heart"),
			new Card("9","heart"),
			new Card("10","heart"),
			new Card("J","heart"),
			new Card("Q","heart"),
			new Card("K","heart"),
			new Card("A","heart")
			};*/
	
	public ArrayList<Card> cards = new ArrayList<Card>();
	//cards.add(new Card("2","heart"));
	private int position = 0;
	
	
	@Override
	public boolean hasNext() {
		//position++;
		if(position < cards.size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		//position++;
		if(this.hasNext()) {
			return cards.get(position).number+":"+cards.get(position++).suit;
		}
		return null;
	}
	
	@Override
	public void remove() {
		
	}
	
	public void reset() {
		position = 0;
	}
	
	public void add(Card c) {
		if(OrderedIterator.put(c,cards) == 0) {
			System.out.println("");
			System.out.println(c.number+":"+c.suit+" exista deja!");
			System.out.println("");
		}
	}

}

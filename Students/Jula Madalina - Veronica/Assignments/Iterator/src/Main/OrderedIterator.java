package Main;

import java.util.ArrayList;
import java.util.Iterator;

public interface OrderedIterator extends Iterator{
	public static int put(Card c , ArrayList<Card> cards) {
		
		if(cards.size() == 0) {
			cards.add(c);
			//System.out.println(cards.size());
			return 1;
		}else {
			boolean exista = false;
			//System.out.println("sd");
			for(Card c1 : cards) {
				//System.out.println(c1.number+":"+c1.suit);
				if(c1.number.equals(c.number)) {
					if(c1.suit.equals(c.suit)) {
						//System.out.println("s");
						exista = true;
						break;
					}
				}
			}
			
			if(exista == false) {
				cards.add(c);
				Card old = null;
				Card old2;
				boolean mutare = false;
				for(int i = 0; i < cards.size()-1; i++) {
					if(mutare == false && cards.get(i).number.equals(c.number)){
						old = cards.get(i+1);
						cards.set(i+1,c);
						mutare = true;
						continue;
					}
					if(mutare == true) {
						old2 = cards.get(i+1);
						cards.set(i+1, old);
						old = old2;
					}
				}
				
				
				//System.out.println(cards.size());
				return 1;
			}
		}
		return 0;
		
	}
}

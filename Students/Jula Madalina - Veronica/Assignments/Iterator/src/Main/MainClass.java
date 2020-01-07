package Main;

public class MainClass {

	public static void main(String[] args) {
		MyInter it = new MyInter();
		
		it.add(new Card("2","spade"));
		it.add(new Card("3","spade"));
		it.add(new Card("4","spade"));
		it.add(new Card("5","spade"));
		it.add(new Card("6","spade"));
		it.add(new Card("7","spade"));
		it.add(new Card("8","spade"));
		it.add(new Card("9","spade"));
		it.add(new Card("10","spade"));
		it.add(new Card("J","spade"));
		it.add(new Card("Q","spade"));
		it.add(new Card("K","spade"));
		it.add(new Card("A","spade"));
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it.add(new Card("2","heart"));
		it.add(new Card("A","heart"));
		it.add(new Card("5","heart"));
		it.add(new Card("A","heart"));
		
		it.reset();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

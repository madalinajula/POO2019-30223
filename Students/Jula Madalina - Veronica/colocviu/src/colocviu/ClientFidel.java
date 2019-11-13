package colocviu;

public class ClientFidel extends Client {
	private int puncte;
	private double discount;
	
	ClientFidel(){
		
	}
	
	public int getPuncte() {
		return puncte;
	}
	
	public double getDiscount() {
		return discount; 
	}
	
	public void setPuncte(int puncte) {
		this.puncte=puncte;
	}
	
	public void setDiscount(double discount) {
		this.discount=discount;
	}
}

package ghiozdan;

public class Ghiozdan {
	Rechizita[] listaRechizite=new Rechizita[500];
	int poz=-1, caiete=0, manuale=0;
	
	public void addCaiet(Caiet c) {
		poz++;
		listaRechizite[poz]=c;
		caiete++;
	}
	public void addManual(Manual m) {
		poz++;
		listaRechizite[poz]=m;
		manuale++;
	}
	
	public void listItems () {
		for(int i=0;i<listaRechizite.length;i++) {
			if(listaRechizite[i]!=null) {
			System.out.println(listaRechizite[i].getNume());
			}
		}
	}
	
	public void listManual() {
		for(int i=0;i<listaRechizite.length;i++){
			if(listaRechizite[i]!=null) {
			if(listaRechizite[i].getNume().contains("Manual")) {
				System.out.println(listaRechizite[i].getNume());
			}
			}
				
		}
	}
	
	public void listCaiet() {
		for(int i=0;i<listaRechizite.length;i++){
			if(listaRechizite[i]!=null) {
			if(listaRechizite[i].getNume().contains("Caiet")) {
				System.out.println(listaRechizite[i].getNume());
			}
			}
		}
	}
	
	public void getNrRechizite() {
		System.out.println("Nr de rechizite: " +(caiete+manuale)); 
	}
	
	public void getNrManuale () {
		System.out.println("Nr de manuale: "+manuale); 
	}
	
	public void getNrCaiete() {
		System.out.println("Nr de caiete: "+caiete);
	}
	
}

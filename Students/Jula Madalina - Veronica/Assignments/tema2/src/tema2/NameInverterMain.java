package tema2;

import java.util.Scanner;

public class NameInverterMain extends NameInverter {

	public static void main(String[] args)
	{
		System.out.println("Introduceti sirul : ");
		Scanner s = new Scanner(System.in);
		String sir=s.nextLine();
		
		if(sir != null )
		  Inverter(sir);
		else 
			System.out.println("Sirul este gol");
	}
}

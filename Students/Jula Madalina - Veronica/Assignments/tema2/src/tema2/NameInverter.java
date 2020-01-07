package tema2;

import java.util.Scanner;

public class NameInverter {

	public static void Inverter (String sir)
	{
		String primulCuvant = null;
		String alDoilea = null;
		String alTreilea = null; 
		String alPatrulea = null; 
		
		String trim=sir.trim();
		int nrCuvinte=trim.split("\\s+").length;
		String[] strange = sir.split("\\s+");
		
		for(int i=0;i<nrCuvinte; i++)
		{
			if(strange[i].equals("Mr."))
				alPatrulea = strange[i];
			else if(strange[i].equals("Mrs."))
				alPatrulea = strange[i];
			else if(strange[i].equals("Phd."))
				alTreilea=strange[i];
			else if(alDoilea.equals(""))
				alDoilea=strange[i] + " ";
			else if(primulCuvant.equals(""))
				primulCuvant=strange[i] + " ";
			
		}
		
		System.out.println(primulCuvant + alDoilea + alTreilea + alPatrulea);
	}

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

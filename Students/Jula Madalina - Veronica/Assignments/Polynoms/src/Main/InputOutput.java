package Main;

import java.io.*;
import java.util.ArrayList;

public class InputOutput {
	
	Polynomial p1;
	Polynomial p2;
	ArrayList<String> functii = new ArrayList<String>();
	PrintStream ps;
	
	public void input() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("pol.txt"));
			
			// cele 2 polinoame 
			String line = br.readLine();
			String[] elements = line.split(" ");
			p1 = new Polynomial(elements);
			line = br.readLine();
			elements = line.split(" ");
			p2 = new Polynomial(elements);
			// --------
			line = br.readLine();
			if(line.equals("")) {
				while((line = br.readLine()) != null) {
					functii.add(line);
				}
			}
			//System.out.println("ssss");
			
		} catch (FileNotFoundException e) {
			// Daca nu se gaseste 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void output() {
		try {
			ps = new PrintStream(new FileOutputStream("output.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

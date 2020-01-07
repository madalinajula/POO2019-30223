package Main;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		InputOutput io = new InputOutput();
		Functions f = new Functions();
		Polynomial result;
		
		io.input();
		
		ArrayList<String> functii = io.functii;
		int n = functii.size();
		io.output();
		
		for(int i = 0; i < n; i++) {
			String e = functii.get(i);
			if(e.contains("ADD")) {
				result = f.add(io.p1, io.p2);
				io.ps.println(result.writePoly());
			}else if(e.contains("SUB")) {
				result = f.substract(io.p1, io.p2);
				io.ps.println(result.writePoly());
			}else if(e.contains("MULTI")) {
				result = f.multiply(io.p1, io.p2);
				io.ps.println(result.writePoly());
			}else if(e.contains("SCAL")) {
				String[] el = e.split(" ");
				result = f.mul_scal(io.p1, Integer.parseInt(el[1]));
				io.ps.println(result.writePoly());
				result = f.mul_scal(io.p2, Integer.parseInt(el[1]));
				io.ps.println(result.writePoly());
			}else if(e.contains("EVAL")) {
				String[] el = e.split(" ");
				int resultOfEval = f.eval(io.p1,Integer.parseInt(el[1]));
				io.ps.println(resultOfEval);
				resultOfEval = f.eval(io.p2,Integer.parseInt(el[1]));
				io.ps.println(resultOfEval);
			}
		}
		io.ps.close();
		
	}

}

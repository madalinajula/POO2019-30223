package tema2;
import java.math.BigDecimal;
import java.util.Scanner;

public class MatrixOperations {
	
	public static int l;
	public static int c;
	
	public static BigDecimal[][] initializare(BigDecimal a[][]){
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				a[i][j] = BigDecimal.valueOf(0);
		return a;
	}
	
	public static BigDecimal[][] add(BigDecimal a[][],BigDecimal b[][]) {
		BigDecimal d[][] = new BigDecimal[l][c];
	    
		d = initializare(d); 
		for(int i=0; i<l;i++)
			for(int j=0;j<c;j++)
			{
				d[i][j]=d[i][j].add(a[i][j]).add(b[i][j]);
			}
		return d;
	}
	
	public static BigDecimal[][] substract (BigDecimal a[][],BigDecimal b[][])
	{
		BigDecimal d[][]=new BigDecimal[l][c];
		d = initializare(d);
		
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				d[i][j]=d[i][j].add(a[i][j]).subtract(b[i][j]);
			}
		return d;
	}
	
	public static BigDecimal[][] multiply (BigDecimal a[][],BigDecimal b[][])
	{
		BigDecimal d[][] = new BigDecimal[l][c];
		d = initializare(d);
		
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				d[i][j]=d[i][j].add(a[i][j]).multiply(b[i][j]);
			}
		return d;
	}
	
	public static BigDecimal[][] multiplyScalar (BigDecimal a[][], BigDecimal scalar)
	{
		BigDecimal d[][] = new BigDecimal[l][c];
		d = initializare(d);
		
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				d[i][j]=d[i][j].add(a[i][j]).multiply(scalar);
			}
		return d;
	}
	
	public static boolean areEqual (BigDecimal a[][], BigDecimal b[][])
	{
		boolean k = true; 
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				if (a[i][j].equals(b[i][j])== false )
					k=false; 
		return k;
	}
	
	public static BigDecimal determinant (BigDecimal a[][])
	{
		BigDecimal det = BigDecimal.valueOf(0);
		BigDecimal x = BigDecimal.valueOf(0), y = BigDecimal.valueOf(0) ;
		if(c!=l)
			return det;
		else 
		{
			for(int i=0;i<l;i++)
				for(int j=0;j<c;j++)
				{
					if(i==j)
					{
						x=x.add(a[i][j]);
					}
					 if(i+j==l)
					{
						y=y.add(a[i][j]);
					}
				}
			det=det.add(x).subtract(y);
			return det;
		}
	}
	
	public static boolean isZeroMatrix (BigDecimal a[][]) 
	{
		boolean k = true; 
		BigDecimal x = BigDecimal.valueOf(0);
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++) {
				if (a[i][j].equals(x) == false )
					k=false;
			} 
		return k;
	}
	
	public static boolean isIdentityMatrix (BigDecimal a[][])
	{
		BigDecimal x = BigDecimal.valueOf(0);
		BigDecimal y = BigDecimal.valueOf(1);
		
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				if(i==j && a[i][j].equals(y) == false)
					return false;
				if(i!=j && a[i][j].equals(x) == false)
					 return false;
			}
		return true;
	}
	 
	public static BigDecimal fillDegree(BigDecimal a[][])
	{
		BigDecimal x = BigDecimal.valueOf(0);
		BigDecimal elem = BigDecimal.valueOf(l*c);
		BigDecimal nenule = BigDecimal.valueOf(0);
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				if(a[i][j].equals(x)==false)
					nenule = nenule.add(new BigDecimal("1"));
			}
		BigDecimal rez = nenule.multiply(BigDecimal.valueOf(100));
		rez=rez.divide(elem);
		return rez;
	}
	
	public static void printare(BigDecimal a[][])
	{
		for(int i=0;i<l;i++)
			{for(int j=0;j<c;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
			}
	}
	
	public static void main (String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Introduceti numarul de linii : ");
		l=s.nextInt();
		System.out.println("Introduceti numarul de coloane : ");
		c=s.nextInt();
		
		BigDecimal a[][] = new BigDecimal[l][c];
		BigDecimal b[][] = new BigDecimal[l][c];
		
		System.out.println("Introduceti prima matrice :");
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				a[i][j]=s.nextBigDecimal();
		
		System.out.println("Introduceti a doua matrice :");
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
				b[i][j]=s.nextBigDecimal();
		
		
		BigDecimal matrice[][] = new BigDecimal[l][c];
		
		matrice=add(a,b);
		System.out.print("Suma matricilor : ");
		printare(matrice);
		System.out.println();
		
		matrice=substract(a,b);
		System.out.print("Diferentaa matricilor : ");
		printare(matrice);
		System.out.println();
		
		matrice=multiply(a,b);
		System.out.print("Inmultireaa matricilor : ");
		printare(matrice);
		System.out.println();
		
		BigDecimal scal= BigDecimal.valueOf(0);
		System.out.print("Introduceti un scalar : ");
		scal=s.nextBigDecimal();
		matrice=multiplyScalar(a,scal);
		System.out.print("Prima matrice multiplicata cu scalar : ");
		printare(matrice);
		System.out.println();
		
		boolean m = false; 
		m=areEqual(a,b);
		System.out.println("Egalitatea matricilor este : " + m);
		
		BigDecimal det= determinant(a);
		System.out.println("Determinantul primei matrici este : " + det);
		
		m=isZeroMatrix(a);
		System.out.println("Prima matrice este nula? : " +m);
		
		BigDecimal proc=fillDegree(a);
		System.out.print("Procentajul de umplere a primei matrici este : " + proc);
	}
	
}

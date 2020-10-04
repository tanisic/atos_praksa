package hr.atos.praksa.tinanisic.zadatak14;

import java.util.Scanner;

public class Test {

	public static Function pickFunction(int pick) {
		switch(pick) {
		case 1: return new Sinus();
				
		case 2: return new Cosinus();
				
		case 3: return new Tangent();
		
		case 4: return new Cotangent();
		
		default : return null;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pick;
		do {
			System.out.println("Odaberi jednu od podrzanih funkcija\n"
					+ "1) Sin\n2) Cos\n3) Tan\n4) Cot");
			pick = scan.nextInt();
		}while(pick>4||pick<1);
		Function function = pickFunction(pick);
		System.out.println("T1 = ");
		double t1 = scan.nextDouble();
		System.out.println("T2 = ");
		double t2 = scan.nextDouble();
		System.out.println("A = ");
		double a = scan.nextDouble();
		System.out.println("B = ");
		double b = scan.nextDouble();
		scan.close();
		IntegralArguments arguments = new IntegralArguments(t1,t2,a,b);
		System.out.println("Povrsina ispod krivulje \n"+"f(x)="+a+"*"+function.toString()+
				"+"+b+"\nu granicama T1="+t1+", T2="+t2
				+ "\nje priblizna: "+Integral.integral(arguments,function));

	}

}

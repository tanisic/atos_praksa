package hr.atos.praksa.tinanisic.zadatak14;

public class Integral {

	public static final double INCREMENT = 1E-4;
	
	public static double integral(IntegralArguments arguments,Function function) {
		double area = 0;
		double modifier = 1;
		double t1 = arguments.getT1();
		double t2 = arguments.getT2();
		double A = arguments.getA();
		double B = arguments.getB();
		if(t1>t2) {
			double tempA = t1;
			t1=t2;
			t2=tempA;
			modifier = -1;
		}
		for(double i=t1+INCREMENT;i<t2;i+=INCREMENT) {
			double dFromT1 = i-t1;
			area+=(INCREMENT/2)*((A*function.funk(t1+dFromT1)+B)+(A*function.funk(t1+dFromT1-INCREMENT)+B));
		}
		return (Math.round(area*1000.0)/1000.0)*modifier;
	}
}

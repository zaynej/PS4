package PS4;

import java.text.DecimalFormat;

public class CalcEngine {

	public static String calculate(double investment, double years, double rate){
		
		double futureValue = investment * Math.pow((1 + ((rate/100)/12)), (12 * years));
		
		DecimalFormat dec = new DecimalFormat("#.##");
		return dec.format(futureValue);
	}
}
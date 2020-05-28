import java.util.Scanner;

public class CalculatorApp {
	private static double income;
	private static int country;
	public double income_tax;
	
	public static void main(String[] args) {
		
		//	take country and income as input
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose your country:\n1.India\n2.Russia");
		country = reader.nextInt();
		System.out.print("Enter your yearly income:");
        income = reader.nextDouble();
        reader.close();
        
        //  check if income is greater than 0
        if (income<0)
		{
			System.out.println("Invalid income");
		}
        else {
        	//  calculate income tax for India
        	if(country == 1)
            {
            	India ind = new India(income);
            	double income_tax = ind.calcIncomeTax();
            	System.out.println("The income tax for INR " + income + " is " + income_tax);
            }
        	//  calculate income tax for Russia
            else if(country == 2)
            {
            	Russia rus = new Russia(income);
            	double income_tax = rus.calcIncomeTax();
            	System.out.println("The income tax for RUB " + income + " is " + income_tax);
            }
            else {
            	System.out.println("Choose a valid country");
            }
            	
        }
        
	}

}

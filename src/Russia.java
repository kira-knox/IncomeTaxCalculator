
public class Russia extends CalculatorApp{
	double income;
	public Russia(double income) {
		this.income = income;
	}
	
//	get the tax rate according to income
	public int taxRate(double income){
		if(income>=0 && income<500000) {
			return 3;
		}
		else if(income>=500000 && income<1500000) {
			return 12;
		}
		else if(income>=1500000 && income<3000000) {
			return 20;
		}
		else if(income>=3000000 && income<5000000) {
			return 35;
		}
		else {
			return 40;
		}
	}
	
//	calculate income tax
	public double calcIncomeTax(){
		int tax_rate = this.taxRate(income);
		income_tax = (float)(tax_rate * income)/100;
		return income_tax;
	}

}


public class India extends CalculatorApp{
	double income;
	public India(double income) {
		this.income = income;
	}
	
//	get the tax rate according to income
	public int taxRate(double income){
		if(income>=0 && income<250000) {
			return 0;
		}
		else if(income>=250000 && income<500000) {
			return 6;
		}
		else if(income>=500000 && income<3000000) {
			return 20;
		}
		else {
			return 35;
		}
	}
	
//	calculate income tax
	public double calcIncomeTax(){
		int tax_rate = this.taxRate(income);
		income_tax = (float)(tax_rate * income)/100;
		return income_tax;
	}
}

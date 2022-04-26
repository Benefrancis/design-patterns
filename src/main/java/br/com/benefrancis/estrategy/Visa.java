package br.com.benefrancis.estrategy;

public class Visa extends Pay {

	@Override
	public void pay(Double price) {
		 System.out.println("Pay: $" + price + " by Visa");
	}

}

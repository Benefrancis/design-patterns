package br.com.benefrancis.strategy;

public class Visa extends Pay {

	@Override
	public void pay(Double price) {
		 System.out.println("Pay: $" + price + " by Visa");
	}

}

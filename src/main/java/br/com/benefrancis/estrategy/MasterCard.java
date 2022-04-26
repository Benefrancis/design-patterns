package br.com.benefrancis.estrategy;

public class MasterCard extends Pay {

	@Override
	public void pay(Double price) {
		 System.out.println("Pay: $" + price + " by MasterCard");
	}

}

package br.com.benefrancis.strategy;

public class Pix extends Pay {

	@Override
	public void pay(Double price) {
		System.out.println("Pay: $" + price + " by Pix");
	}

}

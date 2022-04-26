package br.com.benefrancis.estrategy;

public class PayManager {
	private Pay pay;

	public PayManager(Pay pay) {
		super();
		this.pay = pay;
	}

	public void doPay(Double price) {
		this.pay.pay(price);
	}

}

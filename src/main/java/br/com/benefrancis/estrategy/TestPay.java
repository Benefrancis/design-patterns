package br.com.benefrancis.estrategy;

import java.io.IOException;
import java.util.Scanner;

public class TestPay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You need to pay $25 for mobile phone");
		System.out.println("Please select payment method:");
		System.out.println("1: MasterCard  2: Visa  3:Paypal  4:Pix");

		int code = in.nextInt();

		PayManager manager = null;

		while (code > 4 || code < 1) {

			// Limpa a tela no windows, no linux e no MacOS
			if (System.getProperty("os.name").contains("Windows")) {
				try {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					Runtime.getRuntime().exec("clear");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			System.out.println("Código Inválido");
			System.out.println("You need to pay $25 for mobile phone");
			System.out.println("Please select payment method:");
			System.out.println("1: MasterCard  2: Visa  3:Paypal  4:Pix");

			code = in.nextInt();
		}

		if (code == 1) {
			manager = new PayManager(new MasterCard());
		} else if (code == 2) {
			manager = new PayManager(new Visa());
		} else if (code == 3) {
			manager = new PayManager(new Paypal());
		} else if (code == 4) {
			manager = new PayManager(new MasterCard());
		}

		manager.doPay(25d);
		in.close();

	}
}

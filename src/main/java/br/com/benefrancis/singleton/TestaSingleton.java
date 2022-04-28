package br.com.benefrancis.singleton;

public class TestaSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
	}
}

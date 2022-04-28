package br.com.benefrancis.singleton;

public class TesteConfig {
	public static void main(String[] args) {
		Config cfg1 = Config.getInstance();
		System.out.println("Config 1 Reference: " + cfg1);

		System.out.println(Config.get("server.port"));
		System.out.println(Config.get("server.compression.enabled"));

		System.out.println("--------------------------------------");

		Config cfg2 = Config.getInstance();
		System.out.println("Config 2 Reference: " + cfg2);

		System.out.println(Config.get("server.port"));
		System.out.println(Config.get("server.compression.enabled"));

	}
}

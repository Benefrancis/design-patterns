package br.com.benefrancis.singleton;

import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	private static Config config;
	private static Properties p = null;

	public Config() {
		try {
			if(p==null) {
				p = new Properties();
				InputStream is = this.getClass().getResourceAsStream("/application.properties");
			p.load(is);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Config getInstance() {
		if (config == null) {
			config = new Config();
		}
		return config;
	}

	public static String get(String key) {
		return p.getProperty(key);
	}
}

package br.com.benefrancis.composite;

import java.io.File;

public class TestaFile {
	
	private static String level = "";

	public static void main(String[] args) {
		showAllDiretory("C:/Users/Benefrancis/Documents/workspace/design-patterns/src/main");
	}

	private static void showAllDiretory(String path) {
		
		File dir = new File(path);
		
		File[] dirs = dir.listFiles();
		
		for (int i = 0; dirs != null && i < dirs.length; i++) {
			File f = dirs[i];
			if (f.isFile()) {
				System.out.println(level + f.getName());
			} else if (f.isDirectory()) {
				System.out.println(level + f.getName());
				level += "-";
				showAllDiretory(f.getAbsolutePath());
				level = level.substring(0, level.lastIndexOf("-"));
			}
		}
	}
}

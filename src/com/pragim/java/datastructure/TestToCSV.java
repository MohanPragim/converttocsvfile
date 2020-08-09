package com.pragim.java.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class TestToCSV {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\mohan\\Desktop\\TestFile1.txt");
		Scanner scan = new Scanner(file);
		String convertingPath = Files.createTempFile("MFC1", ".csv").toString();
		File file1 = new File(convertingPath);
		FileWriter fw = new FileWriter(file1);
		file1.createNewFile();
		while (scan.hasNext()) {
			String csv = scan.nextLine().replace("", "");
			System.out.println(csv);
			String str = "" + csv.toString().trim() + "";
			str = "\'" + str + "\'";
			fw.write(str+",");
			fw.write(System.lineSeparator());
//			fw.write(str + ", ");
			System.out.println(str.toString());
		}
		if (fw != null) {
			fw.close();
		}
		if (scan != null) {
			scan.close();
		}
	}
}

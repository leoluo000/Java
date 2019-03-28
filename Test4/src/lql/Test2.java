package lql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("copydir/hello1.txt");
		String s1 = "hello world!你好！";
		BufferedWriter output = new BufferedWriter(new FileWriter(f1, false));
		output.write(s1.toCharArray());
		output.newLine();
		output.write(s1.toCharArray());
		output.newLine();
		output.close();

		BufferedReader input = new BufferedReader(new FileReader(f1));
		StringBuffer read_total_chars = new StringBuffer();
		String temp = "";
		while ((temp = input.readLine()) != null) {
			read_total_chars.append(temp);
		}
		String to_s1 = read_total_chars.toString();
		System.out.println(to_s1);

	}

}

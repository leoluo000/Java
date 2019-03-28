package lql;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadBychars {

	public static void main(String[] args) throws IOException {

		File f1 = new File("copydir/Win10.iso");
		File f2 = new File("copydir/Win11.iso");

		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2, false);
		StringBuffer sb = new StringBuffer();
		long startTime = System.currentTimeMillis();
		int ch = 0;
		char[] c = new char[1024];
		while ((ch = fr.read(c, 0, c.length)) != -1) {
			String temp = new String(c, 0, ch);
			sb.append(temp);
		}
		String to_s = sb.toString();
		fw.write(to_s);
		long endTime = System.currentTimeMillis();
		System.out.println(
				"无缓冲字符流拷贝win10.iso文件消耗时间：" + (endTime - startTime) + "ms" + "  " + (endTime - startTime) / 1000 + "s");
		fr.close();
		fw.close();

	}

}

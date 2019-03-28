package lql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadByBytes {

	public static void main(String[] args) throws IOException {

		File f1 = new File("copydir/Win10.iso");
		File f2 = new File("copydir/Win11.iso");

		InputStream input = new FileInputStream(f1);
		OutputStream output = new FileOutputStream(f2);
		int ch = 0;
		byte[] b = new byte[1024 * 1024 * 1024];
		long startTime = System.currentTimeMillis();
		while ((ch = input.read(b)) != -1) {
			output.write(b, 0, ch);
			output.flush();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(
				"无缓冲字节流拷贝win10.iso文件消耗时间：" + (endTime - startTime) + "ms" + "  " + (endTime - startTime) / 1000 + "s");
		output.close();
		input.close();

	}

}

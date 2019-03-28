package lql;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		File file = new File("copydir");// 以项目为相对路径
		if (!file.exists()) {
			file.mkdir();
		}
		File f1 = new File("copydir/hello.txt");
		String s1 = "Hello World!你好！";
		OutputStream output = new FileOutputStream(f1, false);
		byte[] data = s1.getBytes("utf-8");
		output.write(data);

		output.close();

		InputStream input = new FileInputStream(f1);
		ByteArrayOutputStream read_total_bytes = new ByteArrayOutputStream();
		int ch = 0;
		byte[] b = new byte[3];
		while ((ch = input.read(b)) != -1) {
			read_total_bytes.write(b, 0, ch);
		}
		byte[] total_bytes = read_total_bytes.toByteArray();
		String to_sl = new String(total_bytes, "utf-8");
		System.out.println(to_sl);

	}

}

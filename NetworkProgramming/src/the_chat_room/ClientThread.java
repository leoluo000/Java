package the_chat_room;

import java.io.BufferedReader;

public class ClientThread implements Runnable {

	BufferedReader br = null;

	public ClientThread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {

		try {

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				if (br != null) {

					br.close();

				}
			} catch (Exception e2) {

				e2.printStackTrace();

			}
		}

	}

}

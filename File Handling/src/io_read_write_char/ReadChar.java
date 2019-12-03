package io_read_write_char;

import java.io.FileReader;
import java.io.IOException;

public class ReadChar {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("/home/desd/Desktop/abc.txt");

		System.out.println("Opening File");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		fr.close();
	}

}
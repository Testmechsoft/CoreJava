package Input_Output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest {

	public static void write_file() throws IOException {

		try {
			FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\Siddhartha\\Desktop\\file.txt"));

			String text = "Hello World";

			byte[] x = text.getBytes();

			fout.write(x);

			System.out.println("Data written successfully");

			fout.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static void Read_file() throws IOException {

		FileInputStream fin = new FileInputStream(new File("C:\\Users\\Siddhartha\\Desktop\\file.txt"));

		int i = 0;

		while ((i=fin.read())!= -1) {

			System.out.print((char) i);

		}

		fin.close();

	}

	public static void main(String[] args) throws IOException {

		// IoTest.write_file();
		IoTest.Read_file();

	}

}

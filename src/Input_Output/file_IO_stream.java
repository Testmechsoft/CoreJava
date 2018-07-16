package Input_Output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_IO_stream {
	public File f;
	private String txtin = "C:\\Users\\Siddhartha\\Desktop\\file.txt";
	private String txtout = "C:\\Users\\Siddhartha\\Desktop\\fileout.txt";
	public FileInputStream fis;
	public FileOutputStream fous;

	public void read() throws IOException {
		f = new File(txtin);
		fis = new FileInputStream(f);

		int i = fis.read();

		while (i !=-1) {

			System.out.print((char)i);

		}
		fis.close();

	}

	public void write() throws IOException {
		f = new File(txtout);

		fous = new FileOutputStream(f);

		String data = "This is write methods text";

		byte b[] = data.getBytes();

		fous.write(b);

		fous.close();

		System.out.println("success");

	}

	public static void main(String[] args) throws IOException {

		file_IO_stream fin = new file_IO_stream();
		//fin.write();
		fin.read();

	}

}

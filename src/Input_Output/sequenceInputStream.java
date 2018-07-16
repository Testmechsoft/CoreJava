package Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sequenceInputStream {
	private String txtin = "C:\\Users\\Siddhartha\\Desktop\\file.txt";
	private String txtout = "C:\\Users\\Siddhartha\\Desktop\\fileout.txt";

	public FileOutputStream fous;

	public void read() throws IOException {

		FileInputStream fis1 = new FileInputStream(txtin);
		FileInputStream fis2 = new FileInputStream(txtout);
		SequenceInputStream s = new SequenceInputStream(fis1, fis2);

		int i = 0;

		while ((i = s.read()) != -1) {

			System.out.print((char) i);

		}

		s.close();
		fis1.close();
		fis2.close();

	}

	public static void main(String[] args) throws IOException {

		sequenceInputStream s = new sequenceInputStream();
		s.read();

	}

}

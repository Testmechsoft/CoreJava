package Input_Output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_IO_Stream {
	private String txtin = "C:\\Users\\Siddhartha\\Desktop\\file.txt";
	private String txtoutbuffer = "C:\\Users\\Siddhartha\\Desktop\\fileoutbuffeer.txt";
	public FileInputStream fis;
	public FileOutputStream fous;
	public BufferedInputStream bin;
	public BufferedOutputStream bout;

	public void read() throws IOException {

		fis = new FileInputStream(txtoutbuffer);
		bin = new BufferedInputStream(fis);

		int i = 0;

		while ((i = bin.read()) != -1) {

			System.out.print((char) i);
		}
		bin.close();
		fis.close();

	}

	public void write() throws IOException {

		FileOutputStream fout = new FileOutputStream(txtoutbuffer);
		bout = new BufferedOutputStream(fout);

		String buffertext = "Hello !!! this is buffered text";
		
		byte [] b = buffertext.getBytes();
		
		bout.write(b);
		bout.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		Buffered_IO_Stream b = new Buffered_IO_Stream();

	
		b.write();
		
		Thread.sleep(3000);
		b.read();
	}

}

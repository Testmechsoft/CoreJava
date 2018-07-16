package Input_Output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Reader_class {

	void read() throws IOException {

		Reader r = new FileReader("C:\\Users\\Siddhartha\\Desktop\\writer.txt");
		int data = r.read();
		while (data != -1) {
			System.out.print((char) data);
			data = r.read();
		}
	}

	public static void main(String[] args) throws IOException {

		Reader_class v = new Reader_class();
		v.read();

	}

}

package Input_Output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writer_class {

	void write() throws IOException {

		String s = "This is writer class";

		Writer w = new FileWriter("C:\\Users\\Siddhartha\\Desktop\\writer.txt");
		w.write(s);

		w.flush();

		w.close();

	}

	public static void main(String[] args) throws IOException {

		Writer_class v = new Writer_class();
		v.write();

	}

}

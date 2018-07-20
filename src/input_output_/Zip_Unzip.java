package input_output_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class Zip_Unzip {

	public static Zip zip;

	{

		try {

			// zip = new Zip();

			zip.zip(new File("C:\\Users\\Siddhartha\\Desktop\\VST"),
					new File("C:\\Users\\Siddhartha\\Desktop\\VST.ZIP"));
			System.out.println("File zipped");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		try {

			zip = new Zip();

			zip.unzip(new File("C:\\Users\\Siddhartha\\Desktop\\VST.ZIP"),
					new File("C:\\Users\\Siddhartha\\Desktop\\VST2.ZIP"));

			System.out.println("File unzipped");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

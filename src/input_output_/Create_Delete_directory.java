package input_output_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class Create_Delete_directory {

	public static FileHandler f;

	/*static {

		f = new FileHandler();

		try {
			f.createDir(new File("C:\\Users\\Siddhartha\\Desktop\\xyz"));
			System.out.println("Directory created");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}*/

	public static void main(String[] args) throws IOException {

		f.delete(new File("C:\\Users\\Siddhartha\\Desktop\\xyz"));

		System.out.println("Directory");

	}

}

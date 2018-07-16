package Test;

public class Camelcase {

	public void check(String value) {

		char[] v = value.toCharArray();

		int lenght = v.length;

		for (int i = 0; i < lenght; i++) {

			if (i == 0 || i % 2 == 0) {

				String u = Character.toString(v[i]);

				System.out.print(u.toUpperCase());

			}

			else {

				System.out.print(v[i]);

			}

		}

	}

	public static void main(String[] args) {

		Camelcase c = new Camelcase();

		c.check("test");

	}

}

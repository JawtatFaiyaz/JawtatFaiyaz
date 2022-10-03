package mint;

import java.util.Scanner;

public class Tempconverter {
	public void finder(double temprature) {
		if (temprature != 0) {
			double celcius = ((temprature - 32) * 5) / 9;
			double farenhiet = (temprature * 9 / 5) + 32;
			System.out.println("for the given input value " + temprature);
			System.out.println("the farenhiete is " + farenhiet);
			System.out.println("the celcius is" + celcius);
		} else {
			double cel[] = { -20.00, -15.00, -10.00, -5.00, 0.00, +5.00, +10.00, +15.00, +20.00 };
			double farenhiet[] = { -4.00, +5.00, +10.00, 15.00, +20.00, +25.00, +30.00, +35.00, +40.00 };
			System.out.println("celcius" + "     " + "farenhiet");
			for (int i = 0; i < cel.length; i++) {
				System.out.println(cel[i] + "equivalent  value is " + farenhiet[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" please provide your input ");
		double temprature = sc.nextDouble();// cannot use int and float because user inputs mY VARY
      Tempconverter tc = new Tempconverter();
		tc.finder(temprature);

	}

}

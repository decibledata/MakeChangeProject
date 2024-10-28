package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date: ");

		String dateIn = sc.nextLine();
		System.out.println("Enter Time: ");

		String timeIn = sc.nextLine();
		System.out.println("Enter name: ");

		String fName = sc.nextLine();
		System.out.println(
				"Thank you for Clocking in on " + dateIn + " at " + timeIn + " " + fName + "\nHave a great shift!");

		double item1 = 3.96;
		double item2 = 14.35;
		double item3 = 7.94;
		double item4 = 14.66;
		double item5 = 20.00;
		double item6 = 0.67;
		System.out.println("Enter '0' to Open Register: ");

		int selection = sc.nextInt();

		printMenu();

		double total = 0.0;
		int quantity = 0;

		while (true) {
			System.out.println("Choose a menu item: ");
			int selections = sc.nextInt();
			System.out.println("Press '0' to finish.\n");
			if (selections == 0)
				break;

			switch (selections) {
			case 1:
				System.out.println("$" + item1);
				total += item1;
				quantity++;
				break;
			case 2:
				System.out.println("$" + item2);
				total += item2;
				quantity++;
				break;
			case 3:
				System.out.println("$" + item3);
				total += item3;
				quantity++;
				break;
			case 4:
				System.out.println("$" + item4);
				total += item4;
				quantity++;
				break;
			case 5:
				System.out.println("$" + item5);
				total += item5;
				quantity++;
				break;
			case 6:
				System.out.println("$" + item6);
				total += item6;
				quantity++;
				break;
			default:
				System.out.println("!INVALID ITEM! \nPlease make another selection");
			}
		}
			System.out.println("Total: " + "$" + total);
			System.out.println("_____________________");
			System.out.println("Enter Cash Tendered: \n");

			double cashTend = sc.nextDouble();
			double changeDue = (int) cashTend - total;
			
			if (cashTend == total) {
				System.out.println("Thank you. Have a nice day!");
			}
			
			if (changeDue < 0.0) {
				System.out.println("INSUFFICIENT FUNDS\nPlease try again.\n");
			} else {
				System.out.println("\nCHANGE DUE: \n" + "$" + changeDue + "\n");
				printCalc(changeDue);
			
			}


			// come back to this line for method call
			
		}
		
		

		
	

	public static void printMenu() {
		System.out.println();
		System.out.println("+================= MENU ==============+");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("| 1. 16.oz Domestic Beer $3.96 [SALE] |");
		System.out.println("|                                     |");
		System.out.println("| 2. Taproom Burger  $14.35           |");
		System.out.println("|                                     |");
		System.out.println("| 3. Truffle Fries  $7.94             |");
		System.out.println("|                                     |");
		System.out.println("| 4. Hot Chicken Sandwich $14.66      |");
		System.out.println("|                                     |");
		System.out.println("| 5. Vegetarian Pizza $20.00          |");
		System.out.println("|                                     |");
		System.out.println("| 6. Side Ranch $0.67                 |");
		System.out.println("|                                     |");
		System.out.println("+=====================================+");
		System.out.println();
	}

	public static void printCalc(double changeDue) {
		double twenties = 20.0;
		double tens = 10.0;
		double fives = 5.0;
		double ones = 1.0;
		double quarters = 0.25;
		double dimes = 0.10;
		double nickles = 0.5;
		double pennies = 0.1;

		int nTwenties = (int) (changeDue / twenties);
		changeDue -= nTwenties * twenties;

		int nTens = (int) (changeDue / tens);
		changeDue -= nTens * tens;

		int nFives = (int) (changeDue / fives);
		changeDue -= nFives * fives;

		int nOnes = (int) (changeDue / ones);
		changeDue -= nOnes * ones;

		int cents = (int) (changeDue * 100 + 0.05);

		int nQuarters = cents / 25;
		cents -= nQuarters * 25;

		int nDimes = cents / 10;
		cents -= nDimes * 10;

		int nNickles = cents / 5;
		cents -= nNickles * 5;

		int nPennies = cents / 1;
		cents -= nPennies * 1;
		System.out.println("-----BREAKDOWN-----");

		if (nTwenties > 0) {
			System.out.println("$20 BILLS: " + nTwenties);
		}
		if (nTens > 0) {
			System.out.println("10 BILLS: " + nTens);
		}
		if (nFives > 0) {
			System.out.println("$5 BILLS: " + nFives); }
			else {
				System.out.println();
			
		}
		if (nOnes > 0) {
			System.out.println("$1 BILLS: " + nOnes);
			
			if (nQuarters > 0) {
				System.out.println("QUARTERS: " + nQuarters);
			}
			if (nDimes > 0) {
				System.out.println("DIMES: " + nDimes);
			}
			if (nNickles > 0) {
				System.out.println("NICKLES: " + nNickles);
			}
			if (nPennies > 0) {
				System.out.println("PENNIES: " + nPennies);
				
				
		}
		}
}
}

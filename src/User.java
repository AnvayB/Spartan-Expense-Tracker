import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.*;

public class User {
	public static void sop(Object x) {
		System.out.println(x);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		sop("Welcome to the Spartan Expense Tracker!");
		sop("Press L to Log in or C to Create an Account: ");
		String mainResponse = scan.next();

		if (mainResponse.equals("C")) {
			sop("Enter student id: ");
			long ID = scan.nextLong();
			sop("Enter first name: ");
			String fName = scan.next();
			sop("Enter last name: ");
			String lName = scan.next();
//			sop("Enter credit card number: ");
//			long ccm = scan.nextLong();
//			sop("Enter expiration date as MM.YYYY: ");
//			String exp = scan.next();
//			sop("Enter security code: ");
//			int secCode = scan.nextInt();

			UserFile f = new UserFile();
			f.openFile();
			f.addRecords(ID, fName, lName);
			f.closeFile();

			sop("You will now have to restart this application and log in");
		}

		if (mainResponse.equals("L")) {
			sop("Enter student id: ");
			long ID = scan.nextLong();
			sop("Enter first name: ");
			String fName = scan.next();
			sop("Enter last name: ");
			String lName = scan.next();

			UserFile2 c = new UserFile2();
			c.openFile();
			c.addRecords(ID, fName, lName);
			c.closeFile();

			try (FileInputStream fin1 = new FileInputStream("UserDB.txt");
					FileInputStream fin2 = new FileInputStream("UserDB2.txt")) {

				int i = 0, j = 0;

				while (i != -1 && j != -1) {

					i = fin1.read();
					j = fin2.read();

					if (i != j) {
						break;
					}

				}

				if (i != j) {
					System.out.println("The files are different!");
				} else
					System.out.println("The files are the same!");

			} catch (IOException e) {
				System.out.println(e);
			}

		}

	}

}

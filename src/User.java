import java.util.Scanner;

public class User {
	public static void sop (Object x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		sop("Enter student id: ");
		int ID = scan.nextInt();
		sop("Enter first name: ");
		String fName = scan.next();
		sop("Enter last name: ");
		String lName = scan.next();

		
		UserFile f = new UserFile();
		f.openFile();
		f.addRecords(ID, fName, lName);
		f.closeFile();

	}
}

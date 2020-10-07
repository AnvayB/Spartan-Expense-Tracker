import java.util.*;
import java.io.File;

public class UserFile2 {

	public static void sop(Object x) {
		System.out.println(x);
	}

	private Formatter f;
	//private Scanner scan;

	public void openFile() {
		try {
			f = new Formatter("UserDB2.txt");
		//	scan = new Scanner(new File("chinese.txt"));
		} catch (Exception e) {
			sop("there is an error");
		}
	}

	public void addRecords(long iD, String fName, String lName) {
		// add ID, fName, lName
		f.format("%s%s%s", iD + " ", fName + " ", lName + " ");
	}

//	public void readFile() {
//		// each letter refers to the next input (a--> ID, b--> fName, c--> lName)
//		while (scan.hasNext()) {
//			String a = scan.next();
//			String b = scan.next();
//			String c = scan.next();
//
//			System.out.printf("%s %s %s\n", a, b, c);
//		}
//	}

	public void closeFile() {
		f.close();
	}
}

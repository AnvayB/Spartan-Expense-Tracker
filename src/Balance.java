
public class Balance {
	
	private int balance;
	
	public Balance(int bal) {
		balance = bal;
	}
	
	public void setBalance(int bal) {
		balance = bal;
	}
	
	
	public void addInput(int in) {
		balance += in;
	}
	
	public int getBalance() {
		return balance;
	}
	
	

}

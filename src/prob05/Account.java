package prob05;

public class Account {
	private String accountNo;
	private int balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String s) {
		setAccountNo(s);
		System.out.println(getAccountNo() + " 계좌가 개설되었습니다.");
	}
	
	public void save(int a) {
		int b = getBalance() + a;
		setBalance(b);
		System.out.println(getAccountNo() + " 계좌에 " + a + "만원이 임금되었습니다.");
	}

	public void deposit(int a) {
		int b = getBalance() - a;
		setBalance(b);
		System.out.println(getAccountNo() + " 계좌에 " + a + "만원이 출금되었습니다.");
	}

}

package edu_works;
public class Account {
	private int id;
	private String name;
	private double balance;
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public synchronized void deposit(double amt) {
		System.out.println("Before Depositing: "+balance);
		System.out.println("While Depositing: " +balance);
		this.balance = this.balance + amt;	
		System.out.println("After Depositing " +balance);
	}
	
	public synchronized void withdraw(double amt) {
		System.out.println("Before Withdrawn: "+balance);
	
		if(balance >= amt) {
			System.out.println("While Withdrawn: " +balance);
			this.balance = this.balance - amt;	
		}
		else {
			System.out.println("Insufficet balance");
		}
		System.out.println("After Withdrawn " +balance);
	}
}

class WithdrawThread extends Thread{
	private Account a;
	private double amt;
	
	public WithdrawThread(Account a, double amt) {
		super();
		this.a = a;
		this.amt = amt;
	}

	public void run() {
		a.withdraw(amt);
	}
}
class DepositorThread extends Thread{
	private Account a;
	private double amt;
	
	public DepositorThread(Account a, double amt) {
		super();
		this.a = a;
		this.amt = amt;
	}

	public void run() {
		a.deposit(amt);
	}
}
public class Account {
	
	public static void main(String[] args) {
		Account a = new Account(22,"Kavin", 50000);
		DepositorThread dad = new DepositorThread(a,30000);
		WithdrawThread gpay = new WithdrawThread(a, 10000);
		WithdrawThread online = new WithdrawThread(a, 5000);
		dad.start();
		gpay.start();
		online.start();

	}
	}



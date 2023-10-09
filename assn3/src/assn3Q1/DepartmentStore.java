package assn3Q1;

import java.util.*;
//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance =(beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".

public class DepartmentStore {
	private int accNum;
	private int begBal;
	private int itemTtl;
	private int ttlCrd;
	private int crdLmt;

	public DepartmentStore() {
		this(0, 0, 0, 0, 0);
	}

	public DepartmentStore(int accNum, int begBal, int itemTtl, int ttlCrd, int crdLmt) {

		this.accNum = accNum;
		this.begBal = begBal;
		this.itemTtl = itemTtl;
		this.ttlCrd = ttlCrd;
		this.crdLmt = crdLmt;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getBegBal() {
		return begBal;
	}

	public void setBegBal(int begBal) {
		this.begBal = begBal;
	}

	public int getItemTtl() {
		return itemTtl;
	}

	public void setItemTtl(int itemTtl) {
		this.itemTtl = itemTtl;
	}

	public int getTtlCrd() {
		return ttlCrd;
	}

	public void setTtlCrd(int ttlCrd) {
		this.ttlCrd = ttlCrd;
	}

	public int getCrdLmt() {
		return crdLmt;
	}

	public void setCrdLmt(int crdLmt) {
		this.crdLmt = crdLmt;
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the Customer's details");
		System.out.println();

		System.out.println("Enter the Customer's Account Number");
		this.accNum = sc.nextInt();
		System.out.println();

		System.out.println("Enter the Customer's Beggining Balance");
		this.begBal = sc.nextInt();
		System.out.println();

		System.out.println("Enter the Customer's Total Item Charged by customer in a month");
		this.itemTtl = sc.nextInt();
		System.out.println();

		System.out.println("Enter the Customer's Total Credit applied on the customer in this month");
		this.ttlCrd = sc.nextInt();
		System.out.println();

		System.out.println("Enter the Customer's Credit Limit");
		this.crdLmt = sc.nextInt();
		System.out.println();
	}

	public void display() {
		int newBal;
		newBal = this.begBal + this.itemTtl - this.ttlCrd;

		System.out.println("New Balance : " + newBal);

		if (this.crdLmt < newBal) {
			System.out.println("Account Num : " + this.accNum);
			System.out.println("Credit Limit EXceeded...");
		}

	}

}

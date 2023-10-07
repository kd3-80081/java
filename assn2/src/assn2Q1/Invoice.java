package assn2Q1;

import java.util.*;

//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

public class Invoice {

	private String partNum;
	private String partDesc;
	private int qty;
	private double price;

	public Invoice() {
		this.partNum = " ";
		this.partDesc = " ";
		this.qty = 0;
		this.price = 0;

	}

	public Invoice(String partNum, String partDesc, int qty, double price) {

		this.partNum = partNum;
		this.partDesc = partDesc;
		this.qty = qty;
		if (qty < 0) {
			this.qty = 0;
		}
		this.price = price;
		if (price < 0) {
			this.price = 0;
		}
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the Product Details...");

		System.out.println("Enter the Part Number");
		this.partNum = sc.nextLine();

		System.out.println("Enter the Part Description");
		this.partDesc = sc.nextLine();

		System.out.println("Enter the Quantity");
		if (sc.hasNextInt()) {
			this.qty = sc.nextInt();
			if (this.qty < 0) {
				this.qty = 0;
			}
		}

		System.out.println("Enter the Price");
		if (sc.hasNextDouble()) {
			this.price = sc.nextDouble();
			if (this.price < 0) {
				this.price = 0.0;
			}
		}

	}

	public void display() {

		System.out.println("*************Invoice*************");
		System.out.println();
		System.out.println("Part Number : " + this.partNum);
		System.out.println();
		System.out.println("Part Description : " + this.partDesc);
		System.out.println();
		System.out.println("Number of Quantity of Part : " + this.qty);
		System.out.println();
		System.out.println("Total Amount to be Paid : " + this.price * this.qty);
	}

}

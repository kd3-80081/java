package assn2Q1;

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

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice1=new Invoice();
		Invoice invoice2 = new Invoice("12jnwsw","qiwdjw", 12, -1000);
		invoice2.display();
		Invoice invoice3= new Invoice();
		invoice3.display();
		invoice1.accept();
		invoice1.display();

	}

}

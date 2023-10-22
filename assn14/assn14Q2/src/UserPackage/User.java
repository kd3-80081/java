package UserPackage;

import java.sql.Date;
import java.util.*;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String eMail;
	private String passwd;
	private String dob;
	private boolean status;
	private String role;
	
	public void accept(Scanner sc) {
		System.out.println("Enter the First_Name");
		this.fName=sc.next();
		System.out.println("Enter the Last_Name");
		this.lName=sc.next();
		System.out.println("Enter the Email");
		this.eMail=sc.next();
		System.out.println("Enter the Password");
		this.passwd=sc.next();
		System.out.println("Enter the DOB");
		this.dob=sc.next();
		System.out.println("Enter the Status of voting (true or false)");
		this.status=sc.nextBoolean();
		System.out.println("Enter the Role");
		this.role=sc.next();
	}
	
	public User() {
		}



	public User(int id, String fName, String lName, String eMail, String passwd, String dob, boolean status,String role) {

		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.passwd = passwd;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String geteMail() {
		return eMail;
	}



	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", eMail=" + eMail + ", passwd=" + passwd
				+ ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
	

	

}

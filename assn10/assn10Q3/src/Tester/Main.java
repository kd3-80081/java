package Tester;
import java.util.*;


import com.sunbeam.Employee;

public class Main {

	public static int menu() {
		int choice;
		System.out.println("***************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employee List");
		System.out.println("5. Edit Specifi Employee");
		System.out.println("6. Reverse the list using itr.previous");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		System.out.println("***************************");
		return choice;
	}
	
	
	public static void main(String[] args) {
		Employee employee;
		LinkedList<Employee> list = new LinkedList<>();

		list.add(employee= new Employee(1001,  "Naveen", 12));
		list.add(employee = new Employee(1002,  "veen", 2));
		list.add(employee = new Employee(1003,  "ren", 10));
		list.add(employee = new Employee(1004,  "peen", 18));
		list.add(employee = new Employee(1005,  "kaen", 32));
		list.add(employee = new Employee(1006,  "mav", 42));
		list.add(employee = new Employee(1006, "tas", 92));

		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				employee = new Employee();
				employee.accept();

				if (list.contains(employee))// internally obj==null?return null: obj.equals();
				{
					System.out.println("Employee already exists in the list");
				} else
					{list.add(employee);
					System.out.println("Employee Added");
					}

			}
				break;
			case 2: {

				System.out.println("Enter the Employee Id to Delete");
				Scanner sc = new Scanner(System.in);
				int empId = sc.nextInt();

				Employee e1 = new Employee(empId);

				int index = list.indexOf(e1);
				System.out.println("Deleted Book : " + list.get(index));
				list.remove(index);
//				Iterator<Book> bItr = list.iterator();
//
//				while (bItr.hasNext()) {
//					Book b = bItr.next();
//					System.out.println(b);
//				}
//				System.out.println();

			}
				break;
			case 3: {
				System.out.println("Enter the Employee Id to Find");
				Scanner sc = new Scanner(System.in);
				int empId = sc.nextInt();

				Employee e1 = new Employee(empId);

				int index = list.indexOf(e1);
				if (index == -1) {
					System.out.println("Employee not found");
				} else {
					System.out.println(list.get(index));
				}

			}
				break;


			case 4: {
				class EmpComparator implements Comparator<Employee> {

					@Override
					public int compare(Employee b1, Employee b2) {
						int diff = b1.getEmpId()-b2.getEmpId();

						return diff;
					}

				}
				EmpComparator cmp = new EmpComparator();

				list.sort(cmp);
				for (Employee b1 : list) {
					System.out.println(b1);
				}
				System.out.println();

			}
				break;
			case 5 : {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Employee id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setEmpId(id);
				int index = list.indexOf(key);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				list.set(index, newEmp);
				}
			}break;
			default :
				System.out.println("Wrong Choice Entered");
			}
		}
		System.out.println("Thanks for using app");

	}

	}



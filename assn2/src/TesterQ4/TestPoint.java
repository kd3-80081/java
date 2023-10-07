package TesterQ4;

//Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
//string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
//both points are having same x,y co-ords or false otherwise.
//Add calculateDistance method to calculate distance between current point and specified point &
//return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Point2D point1 = new Point2D();
		Point2D point2 = new Point2D();
		System.out.println("Enter 1st Point Coordinates");
		point1.acceptPoint();
		System.out.println("Enter 2nd Point Coordinates");
		point2.acceptPoint();

		System.out.println("1st Point Cordinates are : " + point1.getDetials());
		System.out.println("2nd Point Cordinates are : " + point2.getDetials());

		if (point1.equals(point2)) {
			System.out.println("Two Points are Same");
		} else {
			System.out.println("Distance :"+ point1.calculateDistance(point2));
		}

	}

}

package assn6Q2com.app.Circle;

import java.util.*;

import com.app.geometry.Point2D;

import Exception.NegativeDiameterException;

public class Circle {

	private Point2D point;
	private double diameter;

	public Circle() {
		this.diameter = 10;
		this.point.setX(0);
		this.point.setY(0);
	}

	public Circle(Point2D point, double diameter) {
		this.diameter = diameter;
	}

	public Point2D getPoint() {
		return point;
	}

	public void setPoint(Point2D point) {
		this.point = point;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void accept() throws NegativeDiameterException{
		Scanner sc = new Scanner(System.in);
		try {

		System.out.print("Enter the X corordinate of Center of Circle");
		int x = sc.nextInt();
		point.setX(x);

		System.out.print("Enter the X corordinate of Center of Circle");
		int y = sc.nextInt();
		point.setX(y);

		System.out.print("Enter the Diameter of Circle");
		this.diameter = sc.nextInt();

		if (this.diameter < 0) {
			throw new NegativeDiameterException();
		}
		
		
		}
		finally {
			sc.close();
		}
		
	}

	@Override
	public String toString() {
		return "Circle [Point="+super.toString()+ "Diameter=" + diameter + "]";
	}

}

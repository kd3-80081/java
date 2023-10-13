package Tester;

import java.util.*;

import com.app.geometry.Point2D;

import Exception.NegativeDiameterException;
import assn6Q2com.app.Circle.Circle;

public class Test {

	public static void main(String[] args) throws NegativeDiameterException {

		try {
			Point2D point=new Point2D(1,2);
			Circle circle = new Circle(point,10);
			if(circle.getDiameter()<0) {
			throw new NegativeDiameterException();
			}
			System.out.println(circle);
		}

		catch (NegativeDiameterException n) {
			n.printStackTrace();
		}
	}

}

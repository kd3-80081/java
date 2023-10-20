package ArithmeticInterface;



//Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
//class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.
@FunctionalInterface
public interface Arithmetic  {
	 double calc(double d1,double d2);
}
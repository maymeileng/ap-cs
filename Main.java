
public class Main {
	public static void main(String[] args) {
		//Checking for Exercise 15.2
		Complex c = new Complex(3, 4);
		System.out.println(c.abs());
		
		//Checking for Exercise 15.3
		Complex d = new Complex(5, 6);
		System.out.println(Complex.equals(c, d));
		
		//Checking for Exercise 15.4
		Rational r1 = new Rational(5, 10);
		r1.simplify();
		System.out.println(r1.getNumerator() + " " + r1.getDenominator());
		Rational r2 = new Rational(1, 8);
		Rational r3 = r1.add(r2);
		System.out.println(r3.getNumerator() + " " + r3.getDenominator());
	}
}

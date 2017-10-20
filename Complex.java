
public class Complex {
	private int real;
	private int imag;
	
	public Complex (int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double abs() {
		return Math.sqrt(real * real + imag * imag);
	}
	
	public static boolean equals(Complex a, Complex b) {
		return(a.real == b.real && a.imag == b.imag);
	}
}

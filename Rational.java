class Rational {
     private int numerator;
     private int denominator;

     public Rational(int numerator, int denominator) {
          this.numerator = numerator;
          this.denominator = denominator;
     }
     
     public int getNumerator() {
    	 return numerator;
     }
     
     public int getDenominator() {
    	 return denominator;
     }

     //makes rational number negative
     public void negate() {
          int numerator = this.numerator;
          int negated = -1 * numerator;
          this.numerator = negated;
     }

     //inverts the number
     public void invert() {
          int o = this.numerator;
          this.numerator = this.denominator;
          this.denominator = o;
     }

     // returns the gcd of two integers
     public static int gcd(int a, int b) {
          if (b == 0) {
              return a;
          }
          int c = a % b;
          return gcd(b, c);
     }

     // reduce is a modifier that reduces a rational number to its lowest terms
     public void simplify() {
          int gcd = gcd(this.numerator, this.denominator);
          this.numerator = this.numerator / gcd;
          this.denominator = this.denominator / gcd;
     }

      // returns the sum of the two rational numbers
     public Rational add(Rational r) {
          int n = r.numerator * this.denominator + r.denominator * this.numerator;
          int d = r.denominator * this.denominator;
          Rational s = new Rational(n, d);
         s.simplify();
          return s;
     }

}

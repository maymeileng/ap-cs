
public class Intro {
	public static void main(String[] args) {
		System.out.println(ret());
		System.out.println(logic(true, true, true));
		System.out.println(stars(5));
		System.out.println(coins(23));
	}
	
	public static int ret() {
		return 17;
	}
	
	public static boolean logic(boolean a, boolean b, boolean c) {
		return a & b & c;
	}
	
	public static String stars(int n) {
		String stars = "";
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				stars += "*";
			}
			stars += "\n";
		}
		return stars;
	}
	
	public static int coins(int n) {
		int num1;
		int num2 = 0;
		int num3;
		int rem;
		num1 = 2*(n / 7);
		rem = n % 7;
		if (rem % 2 == 0 | rem % 5 == 0 & n > 7) {
			if (rem % 5 == 0) {
				num2 = rem / 5;
				return num1 + num2;
			} else if (rem % 2 == 0) {
				num2 = rem / 2;
				return num1 + num2;
			} else {
				return -1;
			}
		} else if (n > 7) {
			num3 = 2*((n / 7) - 1);
			rem = n - (((n / 7) - 1)*7);
			if (rem % 5 == 0) {
				num2 = rem/5;
				return num2 + num3;
			} else if (rem % 2 == 0) {
				num2 = rem/2;
				return num2 + num3;
			} else {
				return -1;
			}
		} else if (rem == 0) {
			return num1;
		} else if (n < 7) {
			if (n % 5 == 0) {
				return 1;
			} else if (n % 2 == 0) {
				return n/2;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
}

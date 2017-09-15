//import java.util.Collection;
//import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		PropositionConstant a = new PropositionConstant("a");
		PropositionConstant b = new PropositionConstant("b");
		LogicalSentence l1 = new LogicalSentence(a);
		LogicalSentence l2 = new LogicalSentence(b);
		LogicalSentence l3 = new Negation(l1);
		LogicalSentence l4 = new Negation(l3);
		LogicalSentence l5 =  new Conjunction(l3, new Negation(l4));
		
		TruthAssignment ta1 = new TruthAssignment();
		ta1.put(b,true);
		ta1.put(a, false); 
//		System.out.println(ta1.get());
//		Conjunction l6 = new Conjunction(l3, l4);
//		l6.evaluate(ta1);
		System.out.println(((Conjunction)l5).evaluate(ta1));
//		System.out.println(legal("a&"));
//		System.out.println(findMatch("a(b)", 0));
//
//		String[] pc = {"p"};
//		truthTable(pc);
	}
	
	public boolean legal(String s) {	
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.substring(i, i+1).equals("&")) {
				String left = s.substring(0, i);
				String right = s.substring(i+1);
				left = negation(left);
				if (simpleSentence(left) == true) {
					s = right;
					legal(s);
					break;
				} else {
					System.out.println("false");
				}
			} else if (s.substring(i, i+1).equals("|")) {
				String left = s.substring(0, i);
				String right = s.substring(i+1);
				left = negation(left);
				if (simpleSentence(left) == true) {
					s = right;
					legal(s);
					break;
				} else {
					System.out.println("false");
				}
			} else if (s.substring(i, i+2).equals("=>") &! s.substring(i-1, i).equals("<")) {
				String left = s.substring(0, i);
				String right = s.substring(i+2);
				left = negation(left);
				if (simpleSentence(left) == true) {
					s = right;
					legal(s);
					break;
				} else {
					System.out.println("false");
				}
			} else if (s.substring(i-1, i+2).equals("<=>")) {
				String left = s.substring(0, i-1);
				String right = s.substring(i+2);
				System.out.println(left);
				System.out.println(right);
				left = negation(left);
				if (simpleSentence(left) == true) {
					s = right;
					legal(s);
					break;
				} else {
					System.out.println("false");
				}
			} 
		} 
	}
	
	public static boolean simpleSentence(String s) {
		if (s.equals("p") || s.equals("q")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String negation(String s) {
		if ((s.substring(0, 1)).equals("~")) {
			s = s.substring(1);
		} 
		return s;
	}

	
//	private boolean findMatch(String sent, int num) {
//		
//	}
	
}

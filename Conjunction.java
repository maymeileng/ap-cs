import java.util.Collection;

public class Conjunction extends LogicalSentence{
	
	private LogicalSentence left;
	private LogicalSentence right;
	
	public Conjunction(LogicalSentence left, LogicalSentence right) {
		this.left = left;
		this.right = right;
	}
	
	public void evaluate(TruthAssignment ta) {
		Collection input = ta.get();
		if ()

		System.out.println(input.toArray()[0]);
	}
}

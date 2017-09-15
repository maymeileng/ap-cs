import java.util.Collection;
import java.util.HashMap;

public class TruthAssignment {
	
	HashMap map = new HashMap();
	
	public TruthAssignment() {
		
	}
	
	public void put(PropositionConstant constant, boolean val) {
		map.put(constant, val);
	}
	
	public Collection get() {
//		System.out.println(map.values());
		return map.values();
//		return map.get(constant);
	}

		
}

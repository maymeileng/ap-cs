package week16;

import java.util.Set;
import java.util.TreeSet;

public class MathSet<T> extends TreeSet<T> implements Set<T> {
	
	//add elements from one object to another
    public MathSet<T> union(MathSet<T> that) {
        MathSet<T> retval = new MathSet<T>();
        retval.addAll(this);
        retval.addAll(that);
        return retval;
    }

    //returns a set of unique elements
    public MathSet<T> intersection(MathSet<T> that) {
        MathSet<T> retval = new MathSet<T>();
        while(this.size() > 0) {
            if (that.contains(this.first())) {
                retval.add(this.first());
            }
            that.remove(this.first());
            this.remove(this.first());
        }
        return retval;
    }
}

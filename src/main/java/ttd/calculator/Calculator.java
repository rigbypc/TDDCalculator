package ttd.calculator;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {
    
    ArrayList<Double> values = new ArrayList<>();

    void add(Double v) {
        values.add(v);
        Collections.sort(values);
    }

    public Double average() {
        Double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        return sum/(double)values.size();
    }

    public Double medain() {
        // will return the ceiling rather than the average of the middle two values when list is even length
        return values.get(values.size()/2);
    }


}

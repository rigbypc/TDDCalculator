package ttd.calculator;

import java.util.ArrayList;

public class Calculator {
    
    ArrayList<Double> values = new ArrayList<>();

    void add(Double v) {
        values.add(v);
    }

    public Double average() {
        Double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        return sum/(double)values.size();
    }


}

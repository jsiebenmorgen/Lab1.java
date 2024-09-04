import java.util.HashMap;
import java.util.Map;

public class Purse {
    private Map<Denomination, Integer> cash;

    //Constructor
    public Purse() {
        cash = new HashMap<>();
    }

    //Adds to the total number of a given denomination
    public void add(Denomination type, int num) {
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }

    //Remove function - not used yet
    public double remove(Denomination type, int num) {
        if (cash.containsKey(type) && cash.get(type) >= num) { // if input
            cash.put(type, cash.get(type) - num);
            return type.amt() * num; // Return the amount removed
        } else {
            return 0.0; // Else no such denomination exists
        }
    }

    public double getValue(int i) {
        double total = 0.0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            Denomination denom = entry.getKey();
            total += denom.amt() * entry.getValue();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        cash.entrySet().stream().sorted((enty1, enty2) -> Double.compare(enty2.getKey().amt(), enty1.getKey().amt())) // Sort by amount in descending order
                .forEach(entry -> {
                    Denomination denom = entry.getKey();
                    sb.append(denom.name()).append(": ").append(entry.getValue()).append("\n");
                });
        return sb.toString();
    }
}

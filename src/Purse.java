import java.util.HashMap;
import java.util.Map;

public class Purse {
    private Map<MoneyType, Map<String, Integer>> cash = new HashMap<>();

    public Purse() {
        for (MoneyType type : MoneyType.values()) {
            cash.put(type, new HashMap<>());
        }
    }

    public void add(MoneyType type, String denominationName, int num) {
        cash.get(type).merge(denominationName, num, Integer::sum);
    }

    public Map<MoneyType, Map<String, Integer>> getCash() {
        return cash; // Expose the internal map to PursePanel
    }

    public double getValue() {
        double total = 0.0;
        for (MoneyType type : MoneyType.values()) {
            for (Map.Entry<String, Integer> entry : cash.get(type).entrySet()) {
                total += entry.getValue() * getDenominationValue(type, entry.getKey());
            }
        }
        return total;
    }

    private double getDenominationValue(MoneyType type, String denominationName) {
        switch (denominationName) {
            case "One Dollar":
                return type == MoneyType.BILL ? 1.0 : 0;
            case "Five Dollar":
                return type == MoneyType.BILL ? 5.0 : 0;
            case "Ten Dollar":
                return type == MoneyType.BILL ? 10.0 : 0;
            case "Dime":
                return type == MoneyType.COIN ? 0.10 : 0;
            case "Nickel":
                return type == MoneyType.COIN ? 0.05 : 0;
            case "Quarter":
                return type == MoneyType.COIN ? 0.25 : 0;
            default:
                return 0.0;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MoneyType type : MoneyType.values()) {
            for (Map.Entry<String, Integer> entry : cash.get(type).entrySet()) {
                sb.append(entry.getKey()).append(" x ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}

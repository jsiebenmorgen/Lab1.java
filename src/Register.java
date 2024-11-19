

import java.util.*;


public class Register {
    static List<Denomination> denominations;
    private MakingChange makingChange;

    public Register() {
        denominations = new ArrayList<>(Arrays.asList(

                new Denomination("One Hundred Note", 100, "BILL", "hundred_note.jpg"),
                new Denomination("Fifty Note", 50, "BILL", "fifty.jpg"),
                new Denomination("Twenty note", 20, "BILL", "twenty_note.jpg"),
                new Denomination("Ten Note", 10, "BILL", "ten_note.jpg"),
                new Denomination("Five Note", 5, "BILL", "five_note.jpg"),
                new Denomination("One Note", 1, "BILL", "one_note.jpg"),
                new Denomination("Quarter Cent", .25, "COIN", "quarter.jpg"),
                new Denomination ("Ten Cent", .10, "COIN", "dime.jpg"),
                new Denomination ("Five Cent", .05, "COIN", "nickel.jpg"),
                new Denomination ("One Cent", .01, "COIN", "penny.jpg")
        ) );
    }

    public Purse makeChange(double amt) {
        Purse purse = new Purse();
        for (Denomination denomination : denominations) {
            int count = (int) (amt / denomination.amt());
            if (count > 0) {
                amt -= count * denomination.amt();
                purse.add(denomination.form().equals("bill") ? MoneyType.BILL : MoneyType.COIN, denomination.name(), count);
            }
        }
        return purse;
    }

    public static void main(String[] args) {
        Register register = new Register();

        double cashInput;

        System.out.print("Please enter a Dollar & Cent Value: " );

        Scanner scanner = new Scanner(System.in);
        cashInput = scanner.nextDouble();

         // Example amount to make change for
        Purse change = register.makeChange(cashInput);

        System.out.println("Change for " + cashInput + " is: \n" + change);


    }
}
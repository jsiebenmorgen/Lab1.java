

import java.util.*;


public class Register {
    private static List<Denomination> denominations;
    private MakingChange makingChange;

    public Register() {
        denominations = new ArrayList<>(Arrays.asList(

                new Denomination("One Hundred Note", 100, DenominationForm.BILL, "hundred_note.png"),
                new Denomination("Fifty Note", 50, DenominationForm.BILL, "fifty.png"),
                new Denomination("Twenty note", 20, DenominationForm.BILL, "twenty_note.png"),
                new Denomination("Ten Note", 10, DenominationForm.BILL, "ten_note.png"),
                new Denomination("Five Note", 5, DenominationForm.BILL, "five_note.png"),
                new Denomination("One Note", 1, DenominationForm.BILL, "one_note.png"),
                new Denomination("Quarter Cent", .25, DenominationForm.COIN, "quarter.png"),
                new Denomination ("Ten Cent", .10, DenominationForm.COIN, "dime.png"),
                new Denomination ("Five Cent", .05, DenominationForm.COIN, "nickel.png"),
                new Denomination ("One Cent", .01, DenominationForm.COIN, "penny.png")
        ) );
    }

    public static Purse makeChange(double amount) {
        Purse purse = new Purse();

        for (Denomination d : denominations) {
            boolean flag = false;

            while (amount > .0001 && !flag) {

                if (amount >= d.amt()) {
                    amount = (amount - d.amt());
                    purse.add(d, 1);

                }
                else {
                    flag = true;
                }
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
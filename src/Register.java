import java.util.*;

public class Register {
    private List<Denomination> denominations;

    public Register() {
        denominations = new ArrayList<>(Arrays.asList(

                new Denomination("One Hundred Note", 100, DenominationForm.BILL, "img.png"),
                new Denomination("Fifty Note", 50, DenominationForm.BILL, ".png"),
                new Denomination("Ten Note", 10, DenominationForm.BILL, ".png"),
                new Denomination("Five Note", 5, DenominationForm.BILL, ".png"),
                new Denomination("One Note", 1, DenominationForm.BILL, ".png"),
                new Denomination("Quarter Cent", .25, DenominationForm.COIN, ".png"),
                new Denomination ("Ten Cent", .10, DenominationForm.COIN, ".png"),
                new Denomination ("Five Cent", .5, DenominationForm.COIN, ".png"),
                new Denomination ("One Cent", .01, DenominationForm.COIN, ".png")
        ) );
    }

    public Purse makeChange(double amount) {
        Purse purse = new Purse();
        for (Denomination d : denominations) {
            int count = (int) (amount / d.amt());



                if (count > 0) {
                    purse.add(d, count);
                    amount -= d.amt() * count;
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

        System.out.println("Change for " + cashInput + " is: " + change);
    }
}
// Assignment:   Lab 1
// Description: Program using user input in money,
// and returns the change with the least number of bills/coins

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* name: String  // name of the denomination. E.g. Ten Note, Five Note, Dime, Nickle, etc.
        amt: double  // The amount of money this denomination represents
        form: String // “bill” or “coin”;  This could be an enum, if you know them.
         img: String  // The string containing the image name for an image of the type of money*/


        Denomination hundredNote = new Denomination("One Hundred Note", 100, DenominationForm.BILL, "img.png");
        Denomination fiftyNote = new Denomination("Fifty Note", 50, DenominationForm.BILL, ".png");
        Denomination tenNote = new Denomination("Ten Note", 10, DenominationForm.BILL, ".png");
        Denomination fiveNote = new Denomination("Five Note", 5, DenominationForm.BILL, ".png");
        Denomination oneNote = new Denomination("One Note", 1, DenominationForm.BILL, ".png");
        Denomination quarterCent = new Denomination("Quarter Cent", .25, DenominationForm.COIN, ".png");
        Denomination tenCent = new Denomination ("Ten Cent", .10, DenominationForm.COIN, ".png");
        Denomination fiveCent = new Denomination ("Five Cent", .5, DenominationForm.COIN, ".png");
        Denomination oneCent = new Denomination ("One Cent", .1, DenominationForm.COIN, ".png");







       System.out.print("Please enter a Dollar & Cent Value: " );

        double value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextDouble();


        System.out.println("Your value is " + value);








    }


}


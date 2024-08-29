// Assignment:   Lab 1
// Description: Program using user input in money,
// and returns the change with the least number of bills/coins

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* name: String  // name of the denomination. E.g. Ten Note, Five Note, Dime, Nickle, etc.
        amt: double  // The amount of money this denomination represents
        form: String // “bill” or “coin”;  This could be an enum, if you know them.
         img: String  // The string containing the image name for an image of the type of money






        */

        // Print Hello World! statement
        System.out.println("Hello world!");

        Denomination hundred = new Denomination("One Hundred Note", 100, "bill", "img.png"  );
        Denomination fifty = new Denomination("Fifty Note", 50, "bill", "img.png"  );


       System.out.printf("Please enter a Dollar & Cent Value: " );

        double value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextDouble();


        System.out.println("Your value is " + value);

        if (value == hundred.amt()){
            System.out.println("Your value is a hundred note");
        }






    }


}


import java.util.Scanner;

public class Number_8 {
    public static void main(String[] args) {
        //declare variables
        double tempF = 0;
        String trash;
        boolean isTrue = false;

        Scanner input = new Scanner(System.in); //setup scanner

        do{
            System.out.print("Please enter the temperature in Celsius: "); //output to user
            if(input.hasNextDouble()){
                tempF = input.nextDouble()*(9.0/5.0) + 32;// does conversion if input is double
                input.nextLine();
                isTrue = true; //ends while loop
            }else {
                trash = input.nextLine();
                System.out.println("Enter a valid number: " + trash + " is not valid"); //prompts the user that input is incorrect
            }
        } while (!isTrue);

        System.out.println("The temperature in Fahrenheit is: " + tempF); //Output of conversion
    }
}

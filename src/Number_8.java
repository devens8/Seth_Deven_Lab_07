import java.util.Scanner;

public class Number_8 {
    public static void main(String[] args) {

        double tempF = 0;
        String trash;
        boolean isTrue = false;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter the temperature in Celsius: ");
            if(input.hasNextDouble()){
                tempF = input.nextDouble()*(9.0/5.0) + 32;
                input.nextLine();
                isTrue = true;
            }else {
                trash = input.nextLine();
                System.out.println("Enter a valid number: " + trash + " is not valid");
            }
        } while (!isTrue);

        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}

public class TheExtraCredit {
    public static void main(String[] args) {
        //declare variables

        for (int i = 0; i < 5; i++) { //5 rows
            if(i == 0 || i == 4){
                System.out.printf("%5s%n","******"); //Ptints the top and bottom of D
            } else {
                System.out.printf("%5s%n","*     *"); //Prints the center of D
            }
        }
    }
}

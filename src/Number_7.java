public class Number_7 {
    public static void main(String[] args) {
        //declare variables
        int ROW = 5;
        int COLUMN = 5;
        for (int row = 0; row < ROW; row++) { //Iterates and creates 5 rows
            for (int column = 0; column < COLUMN; column++) { //Iterates and prints asterisks in 5 colums
                System.out.printf("%s", "*");
            }
            System.out.println("");
        }
    }
}

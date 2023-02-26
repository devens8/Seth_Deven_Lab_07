public class Number_5 {
    public static void main(String[] args) {
        //declare variables
        int ROW = 5;
        int COLUMN = 1;

        for (int row = 0; row < ROW; row++) { //Creates a row and iterates to create 5 rows
            for (int column = 0; column < COLUMN; column++) { //nested loop that prints the number of asterisks based on COLUMN value
                System.out.printf("%s", "*");
            }
            System.out.println("");
            COLUMN++;
        }
    }
}

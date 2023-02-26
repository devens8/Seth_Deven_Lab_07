public class Number_6 {
    public static void main(String[] args) {

        int ROW = 5;
        int COLUMN = 5;
        for (int row = 0; row < ROW; row++) { //Creates and iterates though 5 rows
            for (int column = 0; column < COLUMN; column++) { //Prints asterisks based on the number from COLUMN; decreased by 1
                System.out.printf("%s", "*");
            }
            System.out.println("");
            COLUMN--;
        }
    }
}

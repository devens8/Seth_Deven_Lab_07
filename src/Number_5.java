public class Number_5 {
    public static void main(String[] args) {

        int ROW = 5;
        int COLUMN = 1;
        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {
                System.out.printf("%s", "*");
            }
            System.out.println("");
            COLUMN++;
        }
    }
}

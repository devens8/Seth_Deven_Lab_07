public class TheExtraCredit {
    public static void main(String[] args) {
        //declare variables

        for (int i = 0; i < 5; i++) {
            if(i == 0 || i == 4){
                System.out.printf("%5s%n","******");
            } else {
                System.out.printf("%5s%n","*     *");
            }
        }
    }
}

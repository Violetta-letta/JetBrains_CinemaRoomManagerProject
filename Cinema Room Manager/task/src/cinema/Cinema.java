package cinema;

public class Cinema {

    public static void main(String[] args) {

        String seat = "S";

        System.out.println("Cinema:");
        for (int i = 1; i <=8; i++) {
            if (i == 1){
                System.out.print("  " + i);
            } else if (i == 8) {
                System.out.println(" " + i);
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i <= 7; i++) {
            System.out.print(i);
            for (int k = 1; k <= 8; k++) {
                if (k != 8) {
                    System.out.print(" " + seat);
                } else {
                    System.out.println(" " + seat);
                }
            }
        }
    }
}
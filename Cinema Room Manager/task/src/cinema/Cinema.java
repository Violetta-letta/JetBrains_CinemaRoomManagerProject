package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInARow = scanner.nextInt();

        int totalAmountOfSeats = numberOfRows * seatsInARow;

        int frontRows = numberOfRows / 2;
        int backRows = numberOfRows - frontRows;
        int frontSeatsForBigRooms = frontRows * seatsInARow;
        int backSeatsForBigRooms = backRows * seatsInARow;
        int priceForFrontSeat = 10;
        int priceForBackSeat = 8;
        int priceForSmallRooms = 10;
        int totalCost = 0;


        if (totalAmountOfSeats <= 60) {
            totalCost = priceForSmallRooms * totalAmountOfSeats;
        } else {
            int priceForFrontSeats = frontSeatsForBigRooms * priceForFrontSeat;
            int priceForBackSeats = backSeatsForBigRooms * priceForBackSeat;
            totalCost = priceForFrontSeats + priceForBackSeats;
        }

        System.out.println("Total income:");
        System.out.println("$" + totalCost);


    }
    public void cinemaSchema() {
        String seat = "S";

        System.out.println("Cinema:");
        for (int i = 1; i <= 8; i++) {
            if (i == 1) {
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
package lowst.salary;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BusProblem {
    // constants
    private static final double DAYTIME_FARE_PER_STOP = 0.8;
    private static final double NIGHTTIME_FARE_PER_STOP = 0.6;
    private static final int LONG_DISTANCE_DISCOUNT_START = 5;
    private static final double LONG_DISTANCE_DISCOUNT_RATE = 0.2;
    private static final double WEEKEND_DISCOUNT_RATE = 0.1;
    private static final double MAX_FARE = 10.0;
    private static final double MIN_BALANCE = 10.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // set up initial balance for smart card
        System.out.print("Enter initial balance for smart card: ");
        double balance = scanner.nextDouble();

        // check if initial balance is valid
        if (balance < MIN_BALANCE) {
            System.out.println("Error: Smart card should have a minimum balance of " + MIN_BALANCE);
            return;
        }

        // set up time of swipe-in
        System.out.println("Enter time of swipe-in in the format 'yyyy-mm-ddThh:mm': ");
        LocalDateTime swipeInTime = LocalDateTime.parse(scanner.next());

        // set up starting stop
        System.out.print("Enter starting stop (between 2 and 14): ");
        int startingStop = scanner.nextInt();

        // check if starting stop is valid
        if (startingStop < 2 || startingStop > 14) {
            System.out.println("Error: Starting stop should be between 2 and 14");
            return;
        }

        // set up ending stop
        System.out.print("Enter ending stop (between 2 and 14): ");
        int endingStop = scanner.nextInt();

        // check if ending stop is valid
        if (endingStop < 2 || endingStop > 14) {
            System.out.println("Error: Ending stop should be between 2 and 14");
            return;
        }

        // calculate number of stops travelled
        int stopsTravelled = Math.abs(endingStop - startingStop) + 1;

        // apply long distance discount if applicable
        double farePerStop = DAYTIME_FARE_PER_STOP;
        if (stopsTravelled > LONG_DISTANCE_DISCOUNT_START) {
            stopsTravelled -= LONG_DISTANCE_DISCOUNT_START;
            farePerStop *= (1 - LONG_DISTANCE_DISCOUNT_RATE);
            stopsTravelled += LONG_DISTANCE_DISCOUNT_START;
        }

        // apply weekend discount if applicable
        if (swipeInTime.getDayOfWeek().getValue() == 6 || swipeInTime.getDayOfWeek().getValue() == 7) {
            farePerStop *= (1 - WEEKEND_DISCOUNT_RATE);
        }

        // calculate fare
        double fare = stopsTravelled * farePerStop;
        fare = Math.min(fare, MAX_FARE);

        // check if smart card has enough balance to pay fare
        if (balance < fare) {
            System.out.println("Error: Smart card balance is insufficient");
            return;
        }

        // update smart card balance
        balance -= fare;
        System.out.printf("Fare: $%.2f, New balance: $%.2f\n", fare, balance);

        scanner.close();
    }
}

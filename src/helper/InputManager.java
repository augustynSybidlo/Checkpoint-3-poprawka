package helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    public static int getNumber(String message) {
        boolean done = false;
        Scanner newScanner;
        int choice = 0;
        while (!(done)) {
            try {
                newScanner = new Scanner(System.in);
                System.out.println(message);
                choice = newScanner.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Must be 123 format!");
            }
        }
        return choice;
    }
}

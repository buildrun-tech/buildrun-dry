package goodcode;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGoodCode {

    private static final Logger logger = Logger.getLogger(MyGoodCode.class.getName());

    public static void main(String[] args) {

        logger.info("Whats your age?");

        var age = getAgeInput();

        logAgeGroup(age);

        logger.info("Whats your Mother age?");

        age = getAgeInput();

        logAgeGroup(age);
    }

    private static void logAgeGroup(int age) {
        if (age < 2) {
            log("Baby");
        } else if (age > 2 && age < 16) {
            log("Children");
        } else if (age > 16 && age < 30) {
            log("Young Adult");
        } else if (age > 30 && age < 45) {
            log("Middle Age Adult");
        } else {
            log("Old Adult");
        }
    }

    private static void log(String message) {
        logger.log(Level.INFO, message);
    }

    private static int getAgeInput() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}

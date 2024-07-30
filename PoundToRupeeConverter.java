 // File: PoundToRupeeConverter.java

import java.util.Scanner;

public class PoundToRupeeConverter {
    public static void main(String[] args) {
        // Check if command line argument is provided
        if (args.length > 0) {
            double pounds = Double.parseDouble(args[0]);
            convertPoundsToRupees(pounds);
        } else {
            // Use Scanner class to get input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Pounds: ");
            double pounds = scanner.nextDouble();
            convertPoundsToRupees(pounds);
        }
    }

    private static void convertPoundsToRupees(double pounds) {
        // 1 Pound = 100 Rupees
        double rupees = pounds * 100;
        System.out.println(pounds + " Pounds = " + rupees + " Rupees");
    }
    
}

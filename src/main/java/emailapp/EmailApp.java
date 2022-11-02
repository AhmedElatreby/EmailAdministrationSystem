package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        // User info
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scan.next();
        System.out.println("Enter last name: ");
        String lastName = scan.next();

        // Create object for email class
        Email em1 = new Email(firstName, lastName);
        int choice = -1;
        do {
            System.out.println("\n*******\nEnter your choice\n1.Show Info\n2.Change Password\n3.Change mailbox capacity\n4.Set Alternate mail\n5.Store data in file\n6.Display data from file\n7.Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    em1.getInfo();
                    break;
                case 2:
                    em1.setPassword();
                    break;
                case 3:
                    em1.setMailCapacity();
                    break;
                case 4:
                    em1.alternateEmail();
                    break;
                case 5:
                    em1.storeFile();
                    break;
                case 6:
                    em1.readFile();
                    break;
                case 7:
                    System.out.println("Thank you for using this application!");
                    break;
                default:
                    System.out.println("Invalid choice!!\nEnter proper choice again.");
            }
        } while (choice !=7);
    }
}

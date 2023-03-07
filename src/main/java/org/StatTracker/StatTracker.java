package org.StatTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class StatTracker {
    public ArrayList<Dataset> datasets = new ArrayList<Dataset>();


    public static void main(String[] args) {
        menu();




    }




    public static void menu() {
        System.out.println("Welcome to the pokemon tanking stat tracker!\nWhat would you like to do?\n" +
                "1: Read Dataset 2:Input New Dataset 3:Edit Dataset 4:Delete Dataset 5: Show Total Season Stats");
        java.util.Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
                break;
            default:
                System.out.println("Invalid Choice Selected");
                menu();
        }
    }

    public static void readDataset() {
        System.out.println("Reading dataset...");

    }
}

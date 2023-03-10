package org.StatTracker;

import java.util.HashMap;
import java.util.Scanner;

import static org.StatTracker.ScannerClass.initializeDataSets;
import static org.StatTracker.ScannerClass.writeDataset;

public class StatTracker {
    public static HashMap<String ,Dataset> datasets = new HashMap<String, Dataset>();


    public static void main(String[] args) {
        //initialize datasets
        datasets = initializeDataSets();

        //open menu
        menu();
    }




    public static void menu() {
        System.out.println("Welcome to the pokemon tanking stat tracker!\nWhat would you like to do?\n" +
                "1: Read Dataset 2:Input New Dataset 3:Edit Dataset 4:Delete Dataset 5: Show Total Season Stats");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                readDataset();
                menu();
                break;
            case 2:
                System.out.println("Enter the date of the dataset you would like to create (Example: Mar 2):\n");
                String date = input.nextLine();
                //check if dataset already exists
                if (datasets.containsKey(date)) {
                    System.out.println("Dataset already exists");
                    menu();
                }
                System.out.println("Enter the number of battles you earned:");
                int battles = input.nextInt();
                System.out.println("Enter the number of wins you earned:");
                int wins = input.nextInt();
                System.out.println("Enter the number of stardust you earned:");
                int stardust = input.nextInt();
                System.out.println("Enter the number of rare candy you earned:");
                int candy = input.nextInt();
                Dataset dataset = new Dataset(date, battles, wins, stardust, candy);
                writeDataset(dataset);
                break;
            case 3:
                editDataset();
                break;
            case 4:
                deleteDataset();
                break;
            case 5:
                showTotalSeasonStats();
                break;
            default:
                System.out.println("Invalid Choice Selected");
                menu();
        }
    }

    public static void readDataset() {
        System.out.print("Enter the date of the dataset you would like to read (Example: Mar 2): ");
        Scanner input = new Scanner(System.in);
        String inputDate = input.nextLine();
        input.close();
        if (datasets.containsKey(inputDate)) {
            System.out.println(datasets.get(inputDate).getStats());
        } else {
            System.out.println("Dataset not found");
        }
    }

    public static void editDataset() {
        System.out.println("Enter Data of Dataset to Edit");

    }

    public static void deleteDataset() {
        System.out.println("Deleting Dataset");
    }

    public static void showTotalSeasonStats() {
        System.out.println("Total Battles: " + getTotalBattles() + "\nTotal Wins: " + getTotalWins() + "\nTotal Stardust Earned: " + getTotalStardust() + "\nTotal Rare Candy Earned: " + getTotalCandy());
    }

    public static int getTotalBattles() {
        int totalBattles = 0;
        for (Dataset dataset : datasets.values()) {
            totalBattles += dataset.getBattles();
        }
        return totalBattles;
    }

    public static int getTotalWins() {
        int totalWins = 0;
        for (Dataset dataset : datasets.values()) {
            totalWins += dataset.getWins();
        }
        return totalWins;
    }

    public static int getTotalStardust() {
        int totalStardust = 0;
        for (Dataset dataset : datasets.values()) {
            totalStardust += dataset.getStardustEarned();
        }
        return totalStardust;
    }

    public static int getTotalCandy() {
        int totalCandy = 0;
        for (Dataset dataset : datasets.values()) {
            totalCandy += dataset.getRareCandy();
        }
        return totalCandy;
    }


}

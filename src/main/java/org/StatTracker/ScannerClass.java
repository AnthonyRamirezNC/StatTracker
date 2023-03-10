package org.StatTracker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class ScannerClass {
    public static HashMap<String, Dataset> initializeDataSets() {
        //read data from data.csv
        HashMap<String, Dataset> datasets = new HashMap<>();
        try {
            File file = new File("src/main/java/org/StatTracker/data.csv");
            java.util.Scanner input = new java.util.Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] data = line.split(",");
                String date = data[0];
                datasets.put(date, createDataSet(line));
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return datasets;
    }

    public static Dataset createDataSet(String line) {
        String[] data = line.split(",");
        String date = data[0];
        int battles = Integer.parseInt(data[1]);
        int wins = Integer.parseInt(data[2]);
        int stardust = Integer.parseInt(data[3]);
        int rareCandy = Integer.parseInt(data[4]);
        return new Dataset(date, battles, wins, stardust, rareCandy);
    }

    public static void writeDataset(Dataset dataset) {
        //write dataset to end of data.csv
        File file = new File("src/main/java/org/StatTracker/data.csv");
        try {
            FileWriter output = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(output);
            PrintWriter out = new PrintWriter(bw);

            String dataSetStr = dataset.getCurrentDate() + "," + dataset.getBattles() + "," + dataset.getWins() + "," + dataset.getStardustEarned() + "," + dataset.getRareCandy();
            //print dataSetStr to end of file
            out.println(dataSetStr);
            out.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

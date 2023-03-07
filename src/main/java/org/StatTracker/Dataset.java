package org.StatTracker;
public class Dataset {

    public final String StartDate = "Mar 2";
    public String CurrentDate = "Mar 2";
    public final String EndDate = "Jun 1";
    public int battles = 0;
    public int wins = 0;
    public int StardustEarned = 0;
    public int rareCandy = 0;

    public Dataset(String currentDate, int battles, int wins, int StardustEarned, int rareCandy) {
        System.out.println("Creating new dataset...");
        this.CurrentDate = currentDate;
        this.battles = battles;
        this.wins = wins;
        this.StardustEarned = StardustEarned;
        this.rareCandy = rareCandy;
        System.out.println("Dataset created successfully!\n" + getStats());
    }
    public String getStats() {
        String returnStr = "Getting stats...\n";
        returnStr += "Day " + this.CurrentDate + "\n";
        returnStr += "Battles: " + this.battles + "\n";
        returnStr += "Wins: " + this.wins + "\n";
        returnStr += "Stardust Earned: " + this.StardustEarned + "\n";
        returnStr += "Rare Candy: " + this.rareCandy;
        return returnStr;
    }

    public String getStartDate() {
        return this.StartDate;
    }
    public String getCurrentDate() {
        return this.CurrentDate;
    }
    public String getEndDate() {
        return this.EndDate;
    }
    public int getBattles() {
        return this.battles;
    }
    public int getWins() {
        return this.wins;
    }
    public int getStardustEarned() {
        return this.StardustEarned;
    }
    public int getRareCandy() {
        return this.rareCandy;
    }

    public void setCurrentDate(String date) {
        this.CurrentDate = date;
    }
    public void setBattles(int battles) {
        this.battles = battles;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public void setStardustEarned(int StardustEarned) {
        this.StardustEarned = StardustEarned;
    }
    public void setRareCandy(int rareCandy) {
        this.rareCandy = rareCandy;
    }
}

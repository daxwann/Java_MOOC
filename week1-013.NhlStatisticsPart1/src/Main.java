
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Print the top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nPrint the top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nPrint the statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nPrint the statistics for Philadelphia Flyers (abbreviation: PHI).\nNote in which order the players are printed in and why that might be!");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nPrint the players in Anaheim Ducks (abbreviation: ANA) ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}

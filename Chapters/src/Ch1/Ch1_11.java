package Ch1;

public class Ch1_11 {
    public static void main(String[] args) {

        double birthPerSec = 7.0;
        double deathPerSec = 13.0;
        double immigrationPerSec = 45.0;

        double yearsInSec = 60 * 60 * 24 * 365;

        double currentPopulation = 312032486;

        //implement the seconds in the year
        double birthPerYear = yearsInSec / birthPerSec;
        double deathPerYear = yearsInSec / deathPerSec;
        double immigrationPerYear = yearsInSec / immigrationPerSec;
        //create a loop to display per each year of the current changes
        for (int i = 1; i <= 5; i++) {
            currentPopulation += birthPerYear + immigrationPerYear - deathPerYear;
            System.out.println("Year " + i + ":" + (int) currentPopulation);
        }
    }
}

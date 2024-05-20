package Ch1;
/*
    Average speed in Kilometers.
    Runner runs 24 Miles in 1 hour, 40 mins, and 30 seconds.
    Convert it to kilometers as 1 mile is 1.6 km
 */
public class Ch1_12 {
    public static void main(String[] args) {

        double mile = 24;
        double kilometers = mile * 1.6;
        //if one hour is 60 mins
        double mins = 60 + 40 + (35 / 60);
        //total mins that runner runs within the time given
        double kmPerMinute = kilometers / mins;
        double kmPerHour = kmPerMinute * 60;
        System.out.println(kmPerHour);

    }
}

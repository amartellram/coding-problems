package amartell.hackerrank.weekprep;

public class TimeConversion {

    public static String timeConversion(String s) {

        String[] parts = s.split(":");

        String hourString = parts[0];
        String minutes = parts[1];
        String secondsAndZone = parts[2];
        String seconds = secondsAndZone.substring(0, 2);
        String zone = secondsAndZone.substring(2);

        int hour = Integer.valueOf(hourString);
        if (zone.equals("PM") && hour != 12)
            hour = hour + 12;
        if(zone.equals("AM") && hour == 12)
            hour = 0;

        return  (hour < 10 ? "0"+ hour: hour)+ ":" + minutes + ":"+ seconds;
    }


    public static void main(String[] args) {

    }
}

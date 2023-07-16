public class ConvertTools {
    public static int convertTimeToIndex(int time) {
        //1350(1:00pm) -> 27
        int index = time/50;
        return index;
    }

    public static int convertIndexToTime(int index) {
        //27 -> 1350(1:00pm)
        int time = index * 50;
        return time;
    }

    public static String convertMilitaryToStandard(int time) {
        String result = "";
        String stamp = "";
        int t = time / 100;
        //1. Check if AM or PM
        if (time < 1200) {
            stamp = "AM";
            result = t + ":00 " + stamp;
        }
        else {
            stamp = "PM";
            if (t == 12) {t = 12;}
            else {t = t - 12;}
            
            result = t + ":00 " + stamp;
        }

        return result;

        
        
    }
}
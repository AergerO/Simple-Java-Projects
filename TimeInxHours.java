package Projects1;
public class TimeInxHours {
    public static void main(String[] args) {
        int hours = 4, minutes = 10;
        
        //Display Time with a 0 in fron if < 10
        if (hours < 10){
            System.out.println("Current Time: 0" + hours + ":" + minutes);
        } else if (minutes < 10){
            System.out.println("Current Time: " + hours + ":0" + minutes);
        } else if (minutes < 10 && hours < 10) {
            System.out.println("Current Time 0: " + hours + ":0" + minutes);
        } else {
            System.out.println("Current Time: " + hours + ":" + minutes);
        }
        
        int add_n_hours = 8;
        int add_n_minutes = 40;

        int wish_time_minutes = (hours*60 + minutes) + (add_n_hours * 60) + add_n_minutes;

        int new_hours = wish_time_minutes / 60;
        int new_minute = wish_time_minutes - new_hours*60;
    
        if (new_hours < 10){
            System.out.println("New Time: 0" + new_hours + ":" + new_minute);
        } else if (new_minute < 10){
            System.out.println("New Time:: " + new_hours + ":0" + new_minute);
        } else if (new_minute < 10 && new_hours < 10) {
            System.out.println("New Time: 0: " + new_hours + ":0" + new_minute);
        } else {
            System.out.println("New Time: " + new_hours + ":" + new_minute);
        }
        
    }
}

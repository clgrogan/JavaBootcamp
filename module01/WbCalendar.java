public class WbCalendar {
    public static void main(String[] args) {
        String day = "Friday"; //Can be any day.
        day = "friday";
        day = "Thursday";
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check calendar here:

            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 
        switch (day) {
            case "Monday": System.out.println("Sorry, I have to wash my hair."); break;
            case "Tuesday": System.out.println("It looks like I just don't want to see you."); break;
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time then?"); break;
            case "Thursday": System.out.println("Sorry, Thursday is date night!"); break;
            case "Friday": System.out.println("I'm free!!"); break;
            case "Saturday": System.out.println("I'm free!!"); break;
            case "Sunday": System.out.println("I'm free!!"); break;
            default: System.out.println("Enter a valid day of the week, genius."); break;
        }
    }
}

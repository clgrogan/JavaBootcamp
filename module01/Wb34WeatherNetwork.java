public class Wb34WeatherNetwork {
    public static void main(String[] args) {
        


        int temp = 25;  
        temp = -12;   
        // temp = -5;   

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!
        System.out.println("\nThe inital forecast is "+ forecast+".\nThe temperature is "+temp+" degrees." );

        if (temp <-0) {
            forecast ="FREEZING! Stay home!";
        } else if (temp < 11) {
            forecast = "Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }

        System.out.println("\nThe forecast updated based on temperature is: \n"+forecast);
        System.out.println();

    }
}
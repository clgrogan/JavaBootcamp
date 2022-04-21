public class WbWorkSchedule {
    
// Workbook 3.5
// From Java Bootcamp Resources -> Module 1 -> 3\. Booleans and Conditionals, open Workbook 3.5.



// Your Work Schedule
// Assume that day can be any value between 1 (Monday) and 7 (Sunday). There's also a boolean variable: holiday.

// public class WorkSchedule {

//      public static void main﻿(﻿String[] args﻿) {
//            int day = 3;
//            boolean holiday = true;                ﻿ ﻿
//      }
// }

// Task 1 - Do I have work that day?
// If it's a holiday, print:

// Woohoo, no work

// If it's the weekend (Saturday or Sunday), print:

// it's the weekend, no work!

// Otherwise, print:

// Wake up at 7:00 :(

// Run your code.
// >>woohoo, no work!

// Test cases
// 1. Change holiday to false:
// >>Wake up at 7:00 :(

// 2. Change day to 6 and keep holiday at false:
// >>it's the weekend, no work!
    public static void main(String[] args) {
        
        int day = 3;  
        boolean holiday = true;
        holiday = !holiday;
        day = 6;
         
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";
        if (holiday == true) {
            System.out.println("Woohoo, no work!");
        } else if (day >= 6) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }


        }
    
}

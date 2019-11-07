/* Link to challenge on Hackerrank: https://www.hackerrank.com/challenges/time-conversion/problem */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        
        int new_hours = -1;

        String[] arr = s.split(":", -1);
        int hours = Integer.parseInt(arr[0]);
        
        String minutes = arr[1];
        String seconds = arr[2].substring(0, 2);
        String PorA = arr[2].substring(2, 4);

        if(hours < 12 && PorA.equals("AM")) {
          new_hours = hours;
        }
        if(hours < 12 && PorA.equals("PM")) {
          new_hours = 12 + hours;
        }
        else if(hours == 12 && PorA.equals("PM")) {
          new_hours = hours;
        }
        else if(hours == 12 && PorA.equals("AM")) {
          new_hours = 0;
        }

        if (new_hours == 0) {
          return("00" + ":" + minutes + ":" + seconds);
        } else if (new_hours < 12) {
          return("0" + new_hours + ":" + minutes + ":" + seconds);
        } else {
          return(new_hours + ":" + minutes + ":" + seconds);
        }
    }
}

package examples;

import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String NumStr = reader.readLine();
        int Num = Integer.parseInt(NumStr);
        int NumLength = NumStr.length();
        if (inRange(Num)) {
            System.out.println(oddeven(Num)+" "+sigh(NumLength)+" число");
        }
    }
    public static boolean inRange(int n) {
        if ((n >= 1) && (n <=999)) {return true;}
        else {return false;}

    }
    public static String oddeven (int a) {
        if  (a%2==0) {return "четное";} else
        {return "нечетное";}
    }
    public static String sigh(int length) {
        if (length == 1) {
            return "однозначное";
        } else if (length == 2) {
            return "двузначное";
        } else if (length == 3) {
            return "трехзначное";
        } else {return "";}
    }
}
 



package String;

import java.util.Scanner;

public class Reformat_The_String {
    public static void main(String[] args) {
        String str = "x1y2z34" ;
        System.out.println(checkString(str));
    }
    public static String checkString(String str)
    {
        StringBuilder word = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);//because u cannot apply the charAt to String
            if(ch >= '0' && ch <='9')
            {
                digit.append(ch);
            }else
            {
                word.append(ch);
            }

        }
        int dlength = digit.length();
        int wlength = word.length();
        int diff = Math.abs(dlength - wlength);
        StringBuilder result = new StringBuilder();
        if( diff > 1 ) return "";
        boolean flag = wlength >= dlength ? true : false;
        int j=0,k=0;
        for (int i = 0; i < str.length(); i++)
        {
            if(flag){
                result.append(word.charAt(j));
                j++;
            }else {
                result.append(digit.charAt(k));
                k++;
            }
            flag =! flag;
        }
        return result.toString();
    }

}

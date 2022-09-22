package String;

import java.util.Scanner;

public class Alice_And_String {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         String string_one = inp.nextLine();
         String string_two =inp.nextLine();

        for (int i = 0; i <string_one.length() ; i++)
        {
            if(string_one.length() != string_two.length())
            {
                System.out.println("No");
            }
        }
        boolean flag = true;
        for (int i = 0; i < string_two.length(); i++)
        {
            if(string_one.length() > string_two.length())
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    }
}

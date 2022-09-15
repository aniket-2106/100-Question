package Java_Fundamental;

import java.util.Scanner;

public class Reverse_Number_Hackerrank {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt(); //t denotes the number of the test cases

        while(t-->0){
            int n1 = inp.nextInt();
            int n2 = inp.nextInt();

            int reverseNum1 = reverse(n1);
            int reverseNum2 = reverse(n2);

            int ans = reverse(reverseNum1+reverseNum2);
            System.out.println(ans);

        }

    }
    static int reverse(int x ){
        int rev = 0;
        while (x > 0){
            int d = x % 10;
            rev = (rev * 10)+d;
            x = x /10;

        }
        return rev;
    }
}

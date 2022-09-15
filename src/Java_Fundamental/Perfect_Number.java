package Java_Fundamental;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String args[] ) throws Exception {

        Scanner inp = new Scanner(System.in);
        //t denotes the number of the test cases
        int t = inp.nextInt();
        while(t-->0){
            int n = inp.nextInt();
            int i = 1,sum=0;
            for( i=1;i<=n/2; i++){
                sum+=i;
            }
            if(sum==n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}

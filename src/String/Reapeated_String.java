package String;
import java.util.Scanner;
public class Reapeated_String {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        long K = inp.nextLong();
        long NumberOfReps =  K / str.length();
        long remainder =   K % str.length();
        long count=0;


        for (int i = 0; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'a')
            {
                count++;
            }
        }
        count = count * NumberOfReps;
        for (int i = 0; i <  remainder; i++)
        {
            if(str.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

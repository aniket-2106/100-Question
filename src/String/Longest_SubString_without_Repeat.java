package String;
import java.util.*;
public class Longest_SubString_without_Repeat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str =inp.nextLine();
        System.out.println(findSubstring(str));
    }
    public static int findSubstring(String str){
        int i=0,j=0,max=0;
        Set<Character> HS = new HashSet<Character>();
       while ( j < str.length())
       {
        if(!HS.contains(str.charAt(j)))
        {
            HS.add(str.charAt(j));
            max = Math.max(max, HS.size());
            j++;
        }else
        {
            HS.remove(str.charAt(i));
            i++;
        }
       }
       return max;
    }
}

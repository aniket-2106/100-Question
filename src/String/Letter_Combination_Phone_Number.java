package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combination_Phone_Number {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(CheckString(digits));
    }

    public static List<String> CheckString(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        backtracking(digits, 0,hm, new StringBuilder(), ans);
        return ans;
    }


    private static void backtracking(String digits, int i, HashMap<Character, String> hm, StringBuilder stringBuilder, List<String> ans) {
        if(i == digits.length())
        {
            ans.add(stringBuilder.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));

        for (int j = 0; j < curr.length() ; j++)
        {
            stringBuilder.append(curr.charAt(j));
            backtracking(digits, i+1, hm, stringBuilder, ans);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

}

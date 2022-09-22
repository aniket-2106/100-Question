package String;

public class Special_Substring {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(checkSubstring(str));
    }
    public static int checkSubstring(String str){
        int ans = str.length();
        for (int i = 0; i < str.length(); i++) {
            int counter=0;
            while (i +1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                counter++;
                i++;
            }
            ans = ans+(counter*(counter+1))/2;
            int pointer = 1;
            while (i - pointer >= 0 && i +pointer < str.length() && str.charAt( i + pointer) == str.charAt( i - 1 )
            && str.charAt(i - pointer) == str.charAt( i -1))
            {
                ans++;
                pointer++;
            }
        }
        return ans;
    }
}

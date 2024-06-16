// problem link
// https://codeforces.com/problemset/problem/1790/A


// 314159265358979323846264338327

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        String actual_val = "314159265358979323846264338327";

        while(t-- > 0){
            String str;
            str = sc.nextLine();

            int val = 0;

            for(int i = 0; i < str.length();i++){
                Character c1 = str.charAt(i);
                Character c2 = actual_val.charAt(i);

                if(c1.equals(c2)){
                    val++;
                }else{
                    break;
                }
            }

            System.out.println(val);
        }
    }
}

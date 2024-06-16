// problem link
// https://codeforces.com/problemset/problem/1607/A


import java.util.*;


public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str1, str2;
            str1 = sc.nextLine();
            str2 = sc.nextLine();

            HashMap<Character, Integer> mp = new HashMap<>();

            for(int i = 0; i < str1.length();i++){
                mp.put(str1.charAt(i), i+1);
            }

            int a = mp.get(str2.charAt(0)), val = 0;

            for(int i = 1;i < str2.length();i++){
                int b = mp.get(str2.charAt(i));
                val += Math.abs(a-b);
                a = b;
            }

            System.out.println(val);
        }
    }
}

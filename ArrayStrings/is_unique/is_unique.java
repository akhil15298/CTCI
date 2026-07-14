package CTCI.ArrayStrings.is_unique;

import java.util.Scanner;

public class is_unique {
    
    public static boolean isunique(String s){
        if(s.length()>26){
            return false;
        }
        int checker=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'a';
            if((checker & (1<<val))>0){
                return false;
            }
            checker|=(1<<val);
        }
        return true;
    }

    public static void main(String[] args) {
        //String s="abcde";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isunique(s));
    }
}

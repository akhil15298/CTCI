package CTCI.ArrayStrings.check_permutation;
import java.util.Scanner;



public class checkpermutation {

    public static boolean checkpermutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[128];
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i =0;i<t.length();i++){
            count[t.charAt(i)]--;
            if(count[t.charAt(i)]<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(checkpermutation(s,t));
    }
    
}

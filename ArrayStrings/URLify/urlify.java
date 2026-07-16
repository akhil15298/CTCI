package CTCI.ArrayStrings.URLify;

import java.util.Scanner;

public class urlify {
    
    public static String replacespace(String str,int truelength){
        char[] chararr = str.toCharArray();
        int spacecount = 0;
        for(int i = 0;i<truelength;i++){
            if(chararr[i] == ' '){
                spacecount++;
            }
        }
        int idx = truelength + spacecount*2;
       // if(truelength < chararr.length) chararr[truelength] = '\0';
        for(int i = truelength-1;i>=0;i--){
            if(chararr[i] == ' '){
                chararr[idx-1] = '0';
                chararr[idx-2] = '2';
                chararr[idx-3] = '%';
                idx = idx - 3;
            }else{
                chararr[idx-1] = chararr[i];
                idx--;
            }
        }
        return new String(chararr);
    }

    public static void main(String[] args) {
        //String str = "Mr John Smith    ";
        //int truelength = 13;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int truelength = sc.nextInt();
        String result = replacespace(str,truelength);
         System.out.println(result);
    }
}

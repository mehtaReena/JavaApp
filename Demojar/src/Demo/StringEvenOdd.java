package Demo;

import java.io.*;
import java.util.*;

   public class StringEvenOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i < T ;i++ )
            {
            String s = scan.nextLine();
            for(int j = 0;j < s.length() ; j+=2)
                {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1;j < s.length() ; j+=2)
                {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
   }
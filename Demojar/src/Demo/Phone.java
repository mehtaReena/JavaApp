package Demo;

import java.util.*;
import java.io.*;

class Phone{
    public static void main(String []argh){
         Map<String,Integer> map=new HashMap<String,Integer>(); 
         System.out.println("Please enter the no of records");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();          
            map.put(name,phone);  

        }
        
        while(in.hasNext()){
        	
            String s = in.next();
            
           if(map.containsKey(s)) {
        	   int phone=map.get(s);
        	   System.out.println(s+"="+ phone );
        	 }
           else {
        	   System.out.println("Not Found");
           }
        }
        in.close();
    }
}
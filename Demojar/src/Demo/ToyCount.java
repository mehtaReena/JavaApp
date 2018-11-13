package Demo;

import java.util.Arrays;

public class ToyCount {


public static  void maximumToys(int[] prices, int k) {
    
    
     Arrays.sort(prices); 
     System.out.println(Arrays.toString(prices));
      int sum=0;
       int count=0;
    for (int i =0; i<prices.length ;i++){
         
         sum= sum+ prices[i];
         if(sum<=k){
         count=count+1   ;
          }
     }
      System.out.println(sum);
      System.out.println(count);
}

     public static void main(String args[]) {
    	 int[] Prices = {1,5,11,15,12,10,25};
    	 ToyCount.maximumToys(Prices,50);
      }
  }
package Demo;

public class hello {
/*
	 private  int check(String word) {
	        String store="";
	        for (int i = 0; i < word.length(); i++) {
	        	//System.out.println(store.indexOf(word.charAt(i)));
	            if (store.indexOf(word.charAt(i))<0) {
	            	
	                store = store+word.charAt(i);
	               
	            }
	        }
	        System.out.println("Result word " +store);
	        return store.length();
	    }*/
	
	

	 private  int check(String word) {
	        String store="";
	        int j=1;
	        int len=word.length();
	        for (int i = 0; i < len-1; i++) {
	        	
	            if (word.charAt(i)==word.charAt(j)) {
	            	
	                store = store+word.charAt(i)+"#";
	               
	            }
	            else {
	            	store = store+word.charAt(i);
	            }
	            j++;
	        }
	        System.out.println("Result word " +store);
	        
	        String[] array=store.split("#");
	        
	        int maxLength = 0;	
	        String longestString = null;
	        
	        for (String s : array) {
	            if (s.length() > maxLength) {
	              maxLength = s.length();
	              //longestString = s;
	            }
	          }
	        
	        return maxLength;
	    }
 public  static void main (String agrs[]) {

	  hello h= new hello();

	 int j = h.check("asdcvbsdfaadfghijkl") ;
	 
	 System.out.println("len " + j);
	 
	 
}
 
}

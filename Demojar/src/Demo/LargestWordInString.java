package Demo;

public class LargestWordInString {

	public  static void main(String arg[]) {
	 LargestWordInString obj= new LargestWordInString();	
	 String s= "for bbbbbb nnnnnnnnnnnnnnnnnn vvvvvvvvvvvvvv";
	 System.out.println(obj.findLargestString(s) );
		
	}
	
		
	



public String  findLargestString(String str) {
	
	   int maxlenght=0;
	   String largestWord="";
	   String [] word = str.split(" ");
	   for(int i=0;i<word.length;i++) {
		 if(word[i].length()>maxlenght) {
			 maxlenght=word[i].length();
			 largestWord=word[i];
		 }
	   }
	
	
	return largestWord;
     }


}
package Demo;

public class AlternateChar {
	// Returns count of minimum characters to 
    // be removed to make s alternate. 
    static int countToMake0lternate(String s) 
    { 
        int result = 0; 
  
        for (int i = 0; i < (s.length() - 1); i++) 
  
            // if two alternating characters 
            // of string are same 
            if (s.charAt(i) == s.charAt(i + 1)) 
                result++; // then need to 
        // delete a character 
  
        return result; 
    } 
  
    // Driver code 
    static public void main(String[] args) 
    { 
        System.out.println(countToMake0lternate("AAAA")); 
        System.out.println(countToMake0lternate("ABABAB")); 
        System.out.println(countToMake0lternate("ABBBAA")); 
    } 

}

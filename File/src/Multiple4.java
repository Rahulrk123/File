public class Multiple4 
{
	static boolean isAMultipleOf4(int n) 
    { 
        
        if ((n & 3) == 0) 
            return true; 
  
         
        return false; 
    } 
  
    
    public static void main(String[] args) 
    { 
        int n = 16; 
        System.out.println(isAMultipleOf4(n) ? "Yes" : "No"); 
    } 
}

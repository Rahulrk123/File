//Check if a number is multiple of 5 without using / and % operators
public class Multiple5 
{
	static boolean isMultipleof5 (int n) 
	{ 
	    while (n > 0) 
	        n = n - 5; 
	  
	    if (n == 0) 
	        return true; 
	  
	    return false; 
	} 
	  

	public static void main(String[] args) 
	{ 
	    int n = 19; 
	    if (isMultipleof5(n) == true) 
	        System.out.printf("%d is multiple of 5\n", n); 
	    else
	        System.out.printf("%d is not a multiple of 5\n", n); 
	} 
	} 
	  
	



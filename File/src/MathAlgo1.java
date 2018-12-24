//Write an Efficient Method to Check if a Number is Multiple of 3
public class MathAlgo1 
{
	static int isMultipleOf3(int n) 
	  { 
	    int odd_count = 0; 
	    int even_count = 0; 
	 
	    if(n < 0) n = -n; 
	    if(n == 0) return 1; 
	    if(n == 1) return 0; 
	  
	    while(n != 0) 
	    { 
	       
	        if((n & 1) != 0 )  
	        odd_count++; 
	        n = n>>1; 
	  
	      if((n & 1) != 0) 
	            even_count++; 
	        n = n>>1; 
	    } 
	  
	    return isMultipleOf3 
	    (Math.abs(odd_count - even_count)); 
	} 
	      
	
	    public static void main(String[] args)  
	    { 
	    int num = 24; 
	  
	    if (isMultipleOf3(num) != 0)  
	        System.out.println(num +  
	        " is multiple of 3"); 
	    else
	        System.out.println(num +  
	        " is not a multiple of 3"); 
	} 
	} 
	  



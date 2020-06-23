package com.test.javaproject; 

public class TestProgram { 
      
    static int getOccurence(int n, int d) 
    { 
          
        // Initialize result 
        int result = 0; 
      
        // Count appearances in numbers 
        // starting from d. 
        int itr = d; 
          
        while (itr <= n) 
        { 
              
            // When the last digit is 
            // equal to d 
            if (itr % 10 == d) 
                result++; 
      
            // When the first digit is 
            // equal to d then 
            if (itr != 0 && itr/10 == d) 
            { 
                  
                // increment result as 
                // well as number 
                result++; 
                itr++; 
            } 
      
            // In case of reverse of number  
            // such as 12 and 21 
            else if (itr/10 == d-1) 
                itr = itr + (10 - d); 
            else
                itr = itr + 10; 
        } 
          
        return result; 
    } 
  
      
    static int numberOfKsBetween0AndN (int n, int k)   
    { 
        int originalNumber = n;
        int power = 1;
        int i = 0;
        int counter = 0;            

        while (n > 0)
        {
            int d = n % 10;
            System.out.println("d = "+d);
            n /= 10;
            System.out.println("n = "+n);
            
            counter += d * (power * i) / 10;
            System.out.println("counter = "+counter);

            if (d > k)
                counter += power;
            else if (d == k)
                counter += originalNumber % power + 1;
            System.out.println("c = "+counter);

            power *= 10;
            i++;
        }

        return counter;
    }
    
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 35, d = 2; 
      
        //System.out.println(getOccurence(n, d) ); 
        System.out.println(numberOfKsBetween0AndN(n ,d));
    } 
} 
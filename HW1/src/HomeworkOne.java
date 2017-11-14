// CSE 114 Homework 1
//
// Fall 2017, Stony Brook University
//
// Name:
// SBU ID #:

import java.util.*; // needed for the Scanner class

public class HomeworkOne
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Test the getFees() method
        System.out.print("Enter the starting account balance: ");
        double bal = sc.nextDouble();
        sc.nextLine(); // consume the extra newline character
        System.out.print("Enter the number of checks that were written: ");
        int checks = sc.nextInt();
        sc.nextLine(); // consume extra newline
        double fee = getFees(bal, checks);
        System.out.println("You paid $" + fee + " in fees.\n");
        
        
        // Test the addDivisors() method
        System.out.print("Enter an integer to process: ");
        int val = sc.nextInt();
        sc.nextLine(); // consume any leftover newline characters
        int sum = addDivisors(val);
        System.out.println("Sum of proper divisors: " + sum + "\n");
        
        
        // Test the getGender() method
        System.out.print("Please enter the name of the Bynar you are speaking to: ");
        String bName = sc.nextLine();
        String gender = getGender(bName);
        System.out.println("This Bynar is " + gender + "\n");
        
        
        // Test the "index of coincidence" method
        System.out.print("Enter a string to examine: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string to examine: ");
        String s2 = sc.nextLine();
        double index = coincidence(s1, s2);
        System.out.println("These strings have an index of coincidence of " + index + "\n");

    }
    
    
    
    // COMPLETE THE METHODS BELOW FOR HOMEWORK 1
    
    public static double getFees (double balance, int checks)
    {
        // Fill in this method for the homework
    	
        double checkFee = 0, lowBalanceFee = 0;
        if (balance < 400) lowBalanceFee = 15.0;
        if(checks<20)
        	checkFee = .10 * checks;
        else if(checks>=20 && checks<40)
        	checkFee = .08 * checks;
        else if(checks>=40 && checks<60)
        	checkFee = .06 * checks;
        else
        	checkFee = .04 * checks;
        
        return 10.0 + checkFee + lowBalanceFee;
    }
    
    
    public static int addDivisors (int input)
    {
    	// Fill in this method for the homework
    	
        int finalVal = 0;
    	for( int i=1;i<input;i++) {
    		if(input%i == 0)
    			finalVal+=i;
    	}
    	
    	return finalVal;
    }
    
    
    public static String getGender (String name)
    {
        // Fill in this method for the homework
    	
    	int numberOfOnes = 0;

    	for(int i = 0; i < name.length(); i++){
    		if(name.charAt(i)=='1'){
    			numberOfOnes++;
    		}
    	}

    	if(numberOfOnes%2==0){
    		return "Female";
    	}else{
    		return "Male";
    	}
    }
    
    
    public static double coincidence (String first, String second)
    {
        // Fill in this method for the homework
    	
        double percentCoincidence = 0, matchAmount = 0;
        for(int i = 0; i < first.length(); i++)
        {
            if(first.charAt(i) == second.charAt(i))
            {
                matchAmount++;
            }
        }
       
        percentCoincidence = (matchAmount / first.length())*100;
        return percentCoincidence;
    }
    
    
}
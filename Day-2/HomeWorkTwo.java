public class HomeWorkTwo {

    public static void main (String args [])  {
     
        double amount = 11.56;
        int remainingAmount = (int)(amount * 100); 
        
        // Find the number of one dollars 
        int numberOfOneDollars = remainingAmount / 100; 
        remainingAmount = remainingAmount % 100; 
        
        // Find the number of quarters in the remaining amount 
        int numberOfQuarters = remainingAmount / 25; 
        remainingAmount = remainingAmount % 25; 
        
        // Find the number of dimes in the remaining amount 
        int numberOfDimes = remainingAmount / 10; 
        remainingAmount = remainingAmount % 10; 
        
        // Find the number of nickels in the remaining amount 
        int numberOfNickels = remainingAmount / 5; 
        remainingAmount = remainingAmount % 5; 
        
        
        System.out.println("number Of One Dollars: "+numberOfOneDollars);
        // and so on
        
        
        /* 
         * Your program should report maximum number of Hazar tk, then the maximum number of eksho tk, and so on, in this order.  
         * 
         * amount : BDT 5567.97
         * 
         * 1. 1000
         * 2. 500
         * 3. 100
         * 4. 50
         * 5. 20
         * 6. 10
         * 7. 5
         * 8. 2
         * 9. 1
         * 10. 0.50
         * 11. 0.1
         * 
         * Deadline: 23 January 12:00 Night
         */
        
    }
}
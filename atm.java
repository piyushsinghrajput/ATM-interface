  import java.util.Scanner;   
public class atm  {    
    public static void main(String args[] )  
    {   Scanner scanner = new Scanner(System.in);
        int pin = 1234;
        int tries = 0;
        System.out.println("Welcome Mr Piyush Singh Rajput");
        System.out.println("Please ENTER YOUR PIN: ");
        int entry = scanner.nextInt();
        tries++;
        while (entry != pin && tries < 3) {
            System.out.println("\nSORRY INCORRECT PIN. PLEASE TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = scanner.nextInt();
            tries++;
        }
        if (entry == pin)
            System.out.println("\nPIN ACCEPTED. ACCESS GRANTED.");
        else if (tries >= 3)
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
            System.out.println(""); 
        
        int balance = 50000, withdraw, deposit;  
          
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("-----------------------ATM--------------------------");  
            System.out.println("");  
            System.out.println("        1)Withdraw              2)Deposit");  
            System.out.println("        3)Check Balance         4)Transfer"); 
            System.out.println("        5)EXIT");  
            System.out.print("Choose the operation you want to perform:");  

            int choice = sc.nextInt();  
            switch(choice)   { 

        case 1:  
        System.out.print("Enter money to be withdrawn:");  
            withdraw = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {   
            balance = balance - withdraw;    //remove the withdrawl amount from the total balance 
            System.out.println("Please collect your money");  
        }  
        else  
        {   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        System.out.println("            Avl Balance :Rs "+balance);
        System.out.println("");  
        break;  
   
        case 2:  
                      
        System.out.print("Enter money to be deposited:");   
        deposit = sc.nextInt();  
    
        balance = balance + deposit;    //add the deposit amount to the total balanace  
        System.out.println("Your Money $"+deposit+" has been successfully depsited");  
        System.out.println("");  
        System.out.println("            Avl Balance :Rs "+balance);
        System.out.println("");   
        break;  
   
        case 3:  
        System.out.println("            Avl Balance :Rs "+balance);
        System.out.println("");  
        break;  

        case 4:    
        System.out.print("Enter Account number to be Transfered:");     
        int b= sc.nextInt();           
        System.out.print("Enter money to be Transfered:");  
            withdraw = sc.nextInt();  

        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  //remove the transfered amount from the total balance  
            System.out.println("your money is successfully transfered to " +b);  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        System.out.println("            Avl Balance :Rs "+balance);
        System.out.println("");  
        break;  
   
        case 5:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}  
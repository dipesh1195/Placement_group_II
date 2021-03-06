import java.util.Scanner;

public class SavingAmount {
	
	private int saving = 1000;
	
	 public int getter() {
		 return saving;
	 }
	 public int setter(int x) {
		 saving += x;
		 return saving;
	 }
	 public int increment() {
		 saving +=1000;
		 return saving;
	 }
	 public int decrement() {
		 saving -=100;
		 return saving ;
	 }
	 public void checkSaving() {
		 if(saving >1000) {
			 System.out.println("Congratulations! You have saved a good amount");
		 System.out.println("Your current savings is Rs. "+saving);
		 
		 }
		 if(saving <1000 && saving >=0) {
			 System.out.println("Insufficient saving! ");
			 System.out.println("Your current savings is Rs. "+saving);
		 }
		 if(saving <0) {
			 System.out.println("You are in debt");
			 System.out.println("Your current savings is Rs. "+saving);
		 }
	 }
	 

	public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     SavingAmount amt = new SavingAmount();
     while(true) {
    	 System.out.println("_______________________________________");
         System.out.println("1.Deposite");
         System.out.println("2.increment by 1000");
         System.out.println("3.Decreament by 100");
         System.out.println("4.Check Saving Balance");
         System.out.println("5.Exit");
         System.out.println("---------------------------------------");
         System.out.println("Enter your Choise");
         System.out.println("---------------------------------------");

         int c= in.nextInt();
     switch(c) {
     case 1:
    	 System.out.println("Enter Amount to Deposite.");
    	 int d= in.nextInt();
    	 amt.setter(d);
    	     amt.checkSaving();
    	     break;
     case 2 :
    	 amt.increment();
    	 amt.checkSaving();
    	 break;
     case 3 :
    	 amt.decrement();
    	 amt.checkSaving();
    	 break;
     case 4 :
    	 amt.checkSaving();
    	 break;
    	 
     case 5 :
    	 System.exit(0);
    	 break;
     }}
     
	}
	
}



/*Output
1.Deposite
2.increment by 1000
3.Decreament by 100
4.Check Saving Balance
5.Exit
---------------------------------------
Enter your Choise
---------------------------------------
1
Enter Amount to Deposite.
299
Congratulations! You have saved a good amount
Your current savings is Rs. 1299
_______________________________________
1.Deposite
2.increment by 1000
3.Decreament by 100
4.Check Saving Balance
5.Exit
---------------------------------------
Enter your Choise
---------------------------------------
2
Congratulations! You have saved a good amount
Your current savings is Rs. 2299
_______________________________________
1.Deposite
2.increment by 1000
3.Decreament by 100
4.Check Saving Balance
5.Exit
---------------------------------------
Enter your Choise
---------------------------------------
3
Congratulations! You have saved a good amount
Your current savings is Rs. 2199

*/






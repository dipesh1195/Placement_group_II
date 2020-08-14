import java.util.Scanner;

public class Program_2 {
	public Program_2(int x,int y) {
		int sum = x+y;
		System.out.println("Sum of Two INtegerd are "+sum);
	}
    public Program_2(String x,String y) {
		System.out.println(x+y);
	}
    public Program_2(String x,int y) {
	char[] ch = x.toCharArray();
	int res = 0;
	for(int i=0;i< ch.length;i++) {
		 res += (int)ch[i];
		 System.out.println((int)ch[i]);
	}
	int result = res+y;
	System.out.println(result);
}


	
public static void main(String[] args) {
	System.out.println("Enter Choice");
	System.out.println("1.Sum two Integer");
	System.out.println("2.Concatenate two Strings");
	System.out.println("3.Sum of Ascii Value of String");
	Scanner in = new Scanner(System.in); 
	int c = in.nextInt();
	switch(c) {
	case 1:
		System.out.println("Enter two Interger Value");
		int x = in.nextInt();
		int y = in.nextInt();
		Program_2 p = new Program_2(x,y);
		break;
	case 2:
		System.out.println("Enter two String Value");
       String  s = in.next();
		String s1 = in.next();
		Program_2 p1 = new Program_2(s,s1);
		break;
	case 3:
		System.out.println("Enter string and Integer Value");
		String s2 = in.next();   
		int z = in.nextInt();
			
			Program_2 p2 = new Program_2(s2,z);
		break; 
		
	default:
		System.out.println("Invalid Operation!!!");
	}
}
}


/* 
Enter Choice
1.Sum two Integer
2.Concatenate two Strings
3.Sum of Ascii Value of String
1
Enter two Integer Value
11 22
Sum of Two Integer are 33

Enter Choice
1.Sum two Integer
2.Concatenate two Strings
3.Sum of Ascii Value of String
3
Enter string and Integer Value
dipesh 23
660
*/

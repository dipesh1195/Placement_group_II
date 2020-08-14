import java.util.Scanner;

public class SecretEncryption {
	private static String msg ;
	public void setmsg(String msg) {
		this.msg=msg;
	}
	public void Asia(String msg) {
	
		char[] ch =msg.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			System.out.print((char)(ch[i]+2));
		}
}     
	public void Us(String msg) {
		char[] ch1= msg.toCharArray();
		for(int i = 0;i<ch1.length;i++) {
			System.out.print((int)ch1[i]+".");
		}
}   
	public void Dubai(String msg) {
		char[] ch1= msg.toCharArray();
		for(int i = ch1.length-1;i>=0 ;i--) {
			System.out.print(ch1[i]);
		}
}
	
	
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Secret message to send.");
    SecretEncryption se =new SecretEncryption();
    se.setmsg(in.nextLine());
	System.out.println("Choose your Encrypting technology");
	
	System.out.println("1.Asia");
	System.out.println("2.United States");
	System.out.println("3.Dubai");
    int c = in.nextInt();
    System.out.println("Encrypted messsage is: ");
    switch(c) {
    case 1:
    	se.Asia(msg);
    	break;
    case 2:
    	se.Us(msg);
    	break;
    case 3:
	se.Dubai(msg);
	break;
	default:
		System.out.println("Invalid Input!!!");
		break;
    }
	}

}

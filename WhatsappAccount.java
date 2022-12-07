// Singleton Class EXAMPLE

public class WhatsappAccount {
	private static WhatsappAccount a;    // private variable
	private static long cno;
	private static String name;
	
	private WhatsappAccount(long cno, String name) { // private constructor
		this.cno=cno;
		this.name=name;
		System.out.println("Account Created");
	}
	static WhatsappAccount createWhatsappAccount() {   // static method 
		// in place of WhatsappAccount, we can also used "void" and delete the return statement.
		if(a ==null) {
			a=new WhatsappAccount(123456789, "Jack");
			System.out.println("Contact Number : " + cno);
			System.out.println("Name : " + name);
		}else {
			System.out.println("Account is already exist"); 
		}
		return a;
	}
}
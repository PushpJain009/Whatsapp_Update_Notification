public class WhatsappDriver {
	public static void main(String [] args) {
		Whatsapp1 w=new Whatsapp1();
		w.feature1();
		System.out.println("-------------");
		Whatsapp2 w1 = new Whatsapp2();
		w1.feature1();
		w1.feature2();
		System.out.println("--------------");
		Whatsapp1 w2 =w1;
		w2.feature1();
		System.out.println("---------------");
		Whatsapp3 w3 = new Whatsapp3();
		w3.feature1();
		w3.feature2();
		w3.feature3();
		System.out.println("----------------");
		Whatsapp2 w4 =w3;
		w4.feature1();
		w4.feature2();
	}

}

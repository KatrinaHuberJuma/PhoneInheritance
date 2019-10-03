
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy s9 = new Galaxy("59", 99, "Verison", "Ring Ring Ring!");
		Iphone iphoneTen = new Iphone("x", 100, "AT&T", "Zing!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}

}

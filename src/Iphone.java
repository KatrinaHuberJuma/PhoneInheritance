
public class Iphone extends Phone implements Ringable{

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "iPhone is ringing!" + this.getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "iPhone is unlocking via face recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
		
	}

}

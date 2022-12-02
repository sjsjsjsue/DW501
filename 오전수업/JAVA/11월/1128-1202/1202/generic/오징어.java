package generic;

public class 오징어 extends Seafood { // 오징어
	public int among;
	public String origin;
	
	public void store(int among, String origin) {
		this.among = among;
		this.origin = origin;
	}
	
	public 오징어 판매() { // 판매
		return this;
	}
}

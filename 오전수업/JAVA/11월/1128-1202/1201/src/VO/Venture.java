package VO;

public class Venture implements Comparable {
	private int num;
	private String company;
	private String addr;
	private String category;
	private String business_name;
	private String product;
	// venture 클래스에 DB 테이블 필드에 맞춰서 변수 생성 및 get,set 작업
	
	public Venture () {}
	public Venture(int num, String company, String addr, String category, String business_name, String product) {
		this.num = num;
		this.company = company;
		this.addr = addr;
		this.category = category;
		this.business_name = business_name;
		this.product = product;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Venture tmp = (Venture)obj; 
		// venture 객체가 들어오니 타입을 변경시켜줘야 함!
		// 그냥 obj 를 쓰면 venture 의  private 타입을 쓸 수 없어서 변경시켜줘야 함!
		// 참고 1201.md - equals
		if(this.company.equalsIgnoreCase(tmp.company)) {		
			// a==b(Main_cmd 참고)	
			return true;
		}
		return false;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.company.compareTo( ((Venture)o) .company ) ;
		
	}
	
	
	@Override
	public int hashCode() {
		return this.addr.hashCode();
	}
	
	
	@Override
	public String toString() {
		return num+" "+company+"  "+addr+" "+category+" "+business_name+" "+product+"\n";
	} 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
			
}

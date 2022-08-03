
public class Engine { // 엔진
	String sn;
	String year;
	
	public Engine(String sn, String year) {
		super();
		this.sn = sn;
		this.year = year;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Engine [sn=" + sn + ", year=" + year + "]";
	}
	
	
	
	
	
	
}

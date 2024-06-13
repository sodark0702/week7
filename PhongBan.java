package OOP;

public class PhongBan {
	private String maPB, tenPB;
	public PhongBan(String maPB, String tenPB) {
		super();
		this.maPB = maPB;
		this.tenPB = tenPB;
	}
	@Override
	public String toString() {
		return maPB + "\t" + tenPB;
	}
	

}

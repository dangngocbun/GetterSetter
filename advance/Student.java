package advance;

public class Student {
	private String name;
	private int onl;
	private String adress;
	private String sdt;
	private float dtb;
	public void SinhVien(String name, int onl, String adress, String sdt, float dtb) {
		this.name = name;
		this.onl = onl;
		this.adress = adress;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOnl() {
		return onl;
	}
	public void setOnl(int onl) {
		this.onl = onl;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
}

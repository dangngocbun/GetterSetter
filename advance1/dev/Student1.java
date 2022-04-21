package advance1.dev;

public class Student1 {
	private String name;
	private int old;
	private float toan;
	private float li;
	private float hoa;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLi() {
		return li;
	}
	public void setLi(float li) {
		this.li = li;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public float getDtb() {
		return (toan + li + hoa)/3;
	}

}


package leTung_20109351_HinhTron_Bai1;

public class Toado {
	private String ten;
	private String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten=ten;
		
	}
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
		
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
		
	}
	public Toado() {}
	public Toado(String ten, double x, double y) {
		this.ten=ten;
		this.x=x;
		this.y=y;
		
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%2s(-%2s; %2s);",getTen(), getX(), getY());
		return s;
	}
	
}



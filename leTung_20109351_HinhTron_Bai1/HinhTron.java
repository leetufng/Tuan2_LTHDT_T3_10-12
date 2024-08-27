package leTung_20109351_HinhTron_Bai1;

public class HinhTron {
	public static final double PI=3.1416;
	private double banKinh;
	private Toado tam;
	
	private double 	getBanKinh() {
		return banKinh;
		
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public Toado getTam() {
		return tam;
	}
	public void settam(Toado tam) {
		this.tam = tam;
	}
	public HinhTron() {}
	public HinhTron(double banKinh, Toado tam) {
		this.banKinh = banKinh;
		this.tam = tam;
	}
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
		
	}
	public String toString() {
		String s1="";
				s1=s1+s1.format("ban kinh: %-5s; dien tich: %-10s;",getBanKinh(),getDienTich());
				return s1;
	}
}

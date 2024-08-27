package leTung_20109351_HinhTru_Bai3;

public class HinhTru {

	   
	    private double bankinh;
	    private double chieucao;

	   
	    public HinhTru() {
	        this.bankinh = 1.0;
	        this.chieucao = 1.0;
	    }

	    public HinhTru(double bankinh, double chieucao) {
	        this.bankinh = bankinh;
	        this.chieucao = chieucao;
	    }

	    
	    public double getLateralArea() {
	        return 2 * Math.PI * bankinh * chieucao;
	    }

	   
	    public double getTotalArea() {
	        return 2 * Math.PI * bankinh * (bankinh + chieucao);
	    }

	   
	    public double getVolume() {
	        return Math.PI * bankinh * bankinh * chieucao;
	    }

	    
	    @Override
	    public String toString() {
	        return "hinhtru[bankinh=" + bankinh + ", chieucao=" + chieucao + "]";
	    }

	    public static void main(String[] args) {

	        HinhTru c1 = new HinhTru();
	        System.out.println(c1.toString());
	        System.out.println("Dien tich xung quanh: " + c1.getLateralArea());
	        System.out.println("Dien tich toan phan: " + c1.getTotalArea());
	        System.out.println("The tich: " + c1.getVolume());

	        HinhTru c2 = new HinhTru(3.0, 5.0);
	        System.out.println(c2.toString());
	        System.out.println("Dien tich xung quanh: " + c2.getLateralArea());
	        System.out.println("Dien tich toan phan: " + c2.getTotalArea());
	        System.out.println("The tich: " + c2.getVolume());
	    }
	}

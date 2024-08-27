package leTung_20109351_Bai2;

public class LopPoint {

	 
	    private double x;
	    private double y;
	    public LopPoint() {
	        this.x = 0.0;
	        this.y = 0.0;
	    }

	    public LopPoint(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void negate() {
	        this.x = -this.x;
	        this.y = -this.y;
	    }

	   
	    public double getDistance() {
	        return Math.sqrt(this.x * this.x + this.y * this.y);
	    }

	    @Override
	    public String toString() {
	        return "(" + this.x + ", " + this.y + ")";
	    }

	    
	    public static void main(String[] args) {
	        LopPoint p1 = new LopPoint();
	        System.out.println("diem p1: " + p1.toString());
	        System.out.println("khoang cach p1 den O: " + p1.getDistance());

	       
	        LopPoint p2 = new LopPoint(3.0, 4.0);
	        System.out.println("diem p2: " + p2.toString());
	        System.out.println("khoang cach p2 den O: " + p2.getDistance());

	        p2.negate();
	        System.out.println("diem p2 sau khi negate: " + p2.toString());
	        System.out.println("khoang cach p2 sau khi negate den O " + p2.getDistance());
	    }
	}



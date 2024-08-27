package leTung_20109351_ThongTinDangKyXe_Bai6;

public class TestTTDKX {

	    public static void main(String[] args) {
	     
	        ThongTinDangKyXe[] danhSachXe = new ThongTinDangKyXe[3];
	        
	     
	        danhSachXe[0] = new ThongTinDangKyXe("Nguyen Thu Loan", "Future Neo", 100, 35);
	        danhSachXe[1] = new ThongTinDangKyXe("Le Minh Tri", "Ford Ranger", 3000, 2500);
	        danhSachXe[2] = new ThongTinDangKyXe("Nguyen Minh Triet", "Landscape", 1500, 10000);

	        
	        for (ThongTinDangKyXe xe : danhSachXe) {
	            System.out.println(xe.toString());
	        }
	    }
	}


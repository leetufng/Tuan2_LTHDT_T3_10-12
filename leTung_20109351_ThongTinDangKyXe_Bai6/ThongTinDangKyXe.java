package leTung_20109351_ThongTinDangKyXe_Bai6;

public class ThongTinDangKyXe {
	
	   
	    private String chuXe;
	    private String loaiXe;
	    private double triGiaXe;
	    private int dungTichXyLanh;

	    
	    public ThongTinDangKyXe(String chuXe, String loaiXe, double triGiaXe, int dungTichXyLanh) {
	        if (chuXe == null || chuXe.trim().isEmpty()) {
	            throw new IllegalArgumentException("Chu xe khong duoc de trong");
	        }
	        if (loaiXe == null || loaiXe.trim().isEmpty()) {
	            throw new IllegalArgumentException("Loai xe khong duoc de trong");
	        }
	        if (triGiaXe < 0) {
	            throw new IllegalArgumentException("Tri gia xe phai lon hon hoac bang 0");
	        }
	        if (dungTichXyLanh < 0) {
	            throw new IllegalArgumentException("Dung tich xylanh phai lon hon hoac bang 0");
	        }
	        
	        this.chuXe = chuXe;
	        this.loaiXe = loaiXe;
	        this.triGiaXe = triGiaXe;
	        this.dungTichXyLanh = dungTichXyLanh;
	    }

	    
	    public double tinhThueTruocBa() {
	        if (dungTichXyLanh < 100) {
	            return 0.01 * triGiaXe;
	        } else if (dungTichXyLanh <= 200) {
	            return 0.03 * triGiaXe;
	        } else {
	            return 0.05 * triGiaXe;
	        }
	    }

	  
	    public String getChuXe() {
	        return chuXe;
	    }

	    public String getLoaiXe() {
	        return loaiXe;
	    }

	    public double getTriGiaXe() {
	        return triGiaXe;
	    }

	    public int getDungTichXyLanh() {
	        return dungTichXyLanh;
	    }

	   
	    @Override
	    public String toString() {
	        return "ThongTinDangKyXe[chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", triGiaXe=" + triGiaXe +
	               ", dungTichXyLanh=" + dungTichXyLanh + ", thueTruocBa=" + tinhThueTruocBa() + "]";
	    }
	}



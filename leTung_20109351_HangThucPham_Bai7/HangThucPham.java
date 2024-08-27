package leTung_20109351_HangThucPham_Bai7;

	import java.time.LocalDate;

	public class HangThucPham {
	    // Thuộc tính
	    private final String maHang;
	    private String tenHang;
	    private double donGia;
	    private LocalDate ngaySanXuat;
	    private LocalDate ngayHetHan;

	
	    public HangThucPham(String maHang, String tenHang) {
	        if (maHang == null || maHang.trim().isEmpty()) {
	            throw new IllegalArgumentException("Ma hang khong duoc de trong");
	        }
	        this.maHang = maHang;
	        this.tenHang = (tenHang == null || tenHang.trim().isEmpty()) ? "xxx" : tenHang;
	        this.donGia = 0;
	        this.ngaySanXuat = LocalDate.now();
	        this.ngayHetHan = this.ngaySanXuat;
	    }

	    
	    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
	        if (maHang == null || maHang.trim().isEmpty()) {
	            throw new IllegalArgumentException("Ma hang khong duoc de trong");
	        }
	        this.maHang = maHang;
	        this.tenHang = (tenHang == null || tenHang.trim().isEmpty()) ? "xxx" : tenHang;
	        this.donGia = (donGia >= 0) ? donGia : 0;

	        if (ngaySanXuat.isAfter(LocalDate.now())) {
	            throw new IllegalArgumentException("Ngay san xuat phai truoc ngay hien tai");
	        }
	        this.ngaySanXuat = ngaySanXuat;

	        if (ngayHetHan.isBefore(ngaySanXuat)) {
	            throw new IllegalArgumentException("Ngay het han phai sau ngay san xuat");
	        }
	        this.ngayHetHan = ngayHetHan;
	    }

	   
	    @Override
	    public String toString() {
	        return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia +
	               ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]";
	    }
	}



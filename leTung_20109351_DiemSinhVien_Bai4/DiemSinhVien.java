package leTung_20109351_DiemSinhVien_Bai4;

public class DiemSinhVien {
	
		    
		    private int maSinhVien;
		    private String hoTen;
		    private float diemLT;
		    private float diemTH;

		    public DiemSinhVien() {
		        this.maSinhVien = 0;
		        this.hoTen = "Chua xac dinh";
		        this.diemLT = 0.0f;
		        this.diemTH = 0.0f;
		    }

		   
		    public DiemSinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
		        setMaSinhVien(maSinhVien);
		        setHoTen(hoTen);
		        setDiemLT(diemLT);
		        setDiemTH(diemTH);
		    }

		    
		    public int getMaSinhVien() {
		        return maSinhVien;
		    }

		    public void setMaSinhVien(int maSinhVien) {
		        if (maSinhVien > 0) {
		            this.maSinhVien = maSinhVien;
		        } else {
		            this.maSinhVien = 0; 
		        }
		    }

		   
		    public String getHoTen() {
		        return hoTen;
		    }

		    public void setHoTen(String hoTen) {
		        if (hoTen != null && !hoTen.trim().isEmpty()) {
		            this.hoTen = hoTen;
		        } else {
		            this.hoTen = "Chua xac dinh"; 
		        }
		    }

		    
		    public float getDiemLT() {
		        return diemLT;
		    }

		    public void setDiemLT(float diemLT) {
		        if (diemLT >= 0.0 && diemLT <= 10.0) {
		            this.diemLT = diemLT;
		        } else {
		            this.diemLT = 0.0f; // Giá trị mặc định
		        }
		    }

		    
		    public float getDiemTH() {
		        return diemTH;
		    }

		    public void setDiemTH(float diemTH) {
		        if (diemTH >= 0.0 && diemTH <= 10.0) {
		            this.diemTH = diemTH;
		        } else {
		            this.diemTH = 0.0f; // Giá trị mặc định
		        }
		    }

		    
		    public float tinhDiemTrungBinh() {
		        return (diemLT + diemTH) / 2;
		    }

		    
		    @Override
		    public String toString() {
		        return "Ma Sinh Vien: " + maSinhVien +
		               ", Ho Ten: " + hoTen +
		               ", Diem LT: " + diemLT +
		               ", Diem TH: " + diemTH +
		               ", Diem TB: " + tinhDiemTrungBinh();
		    }
		}



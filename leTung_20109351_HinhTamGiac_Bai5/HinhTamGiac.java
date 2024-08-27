package leTung_20109351_HinhTamGiac_Bai5;

public class HinhTamGiac {
	
		    private float ma;
		    private float mb;
		    private float mc;

		    public HinhTamGiac() {
		        this.ma = 0.4f;
		        this.mb = 0.4f;
		        this.mc = 0.4f;
		    }

	
		    public HinhTamGiac(float ma, float mb, float mc) {
		        if (isValidTamGiac(ma, mb, mc)) {
		            this.ma = ma;
		            this.mb = mb;
		            this.mc = mc;
		        } else {
		            this.ma = 0.4f;
		            this.mb = 0.4f;
		            this.mc = 0.4f;
		        }
		    }

		 
		    public float getMa() {
		        return ma;
		    }

		    public void setMa(float ma) {
		        if (isValidTamGiac(ma, mb, mc)) {
		            this.ma = ma;
		        }
		    }

		   
		    public float getMb() {
		        return mb;
		    }

		    public void setMb(float mb) {
		        if (isValidTamGiac(ma, mb, mc)) {
		            this.mb = mb;
		        }
		    }

		   
		    public float getMc() {
		        return mc;
		    }

		    public void setMc(float mc) {
		        if (isValidTamGiac(ma, mb, mc)) {
		            this.mc = mc;
		        }
		    }

		    private boolean isValidTamGiac(float ma, float mb, float mc) {
		        return ma > 0 && mb > 0 && mc > 0 &&
		               (ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma);
		    }

		    
		    public float tinhChuVi() {
		        return ma + mb + mc;
		    }

		   
		    public float tinhDienTich() {
		        float s = tinhChuVi() / 2;
		        return (float) Math.sqrt(s * (s - ma) * (s - mb) * (s - mc));
		    }

		   
		    public String kiemTraKieuTamGiac() {
		        if (!isValidTamGiac(ma, mb, mc)) {
		            return "Khong phai tam giac";
		        } else if (ma == mb && mb == mc) {
		            return "Deu";
		        } else if (ma == mb || ma == mc || mb == mc) {
		            return "Can";
		        } else {
		            return "Thuong";
		        }
		    }

		    
		    @Override
		    public String toString() {
		        return String.format("Canh ma: %.2f, Canh mb: %.2f, Canh mc: %.2f, " +
		                             "Kieu tam giac: %s, Chu vi: %.2f, Dien tich: %.2f",
		                             ma, mb, mc, kiemTraKieuTamGiac(), tinhChuVi(), tinhDienTich());
		    }
		}



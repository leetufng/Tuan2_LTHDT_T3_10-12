package leTung_20109351_HangThucPham_Bai7;
import java.time.LocalDate;
public class TestHTP {


	    public static void main(String[] args) {
	        
	        HangThucPham htp1 = new HangThucPham("001", "Sua", 15000, LocalDate.of(2023, 8, 15), LocalDate.of(2023, 9, 15));
	        HangThucPham htp2 = new HangThucPham("002", "Banh mi", 10000, LocalDate.of(2023, 8, 20), LocalDate.of(2023, 8, 30));
	        
	        
	        try {
	            HangThucPham htp3 = new HangThucPham("003", "Trung", 12000, LocalDate.of(2023, 8, 25), LocalDate.of(2023, 8, 24));
	            System.out.println(htp3);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Loi: " + e.getMessage());
	        }

	        
	        System.out.println(htp1);
	        System.out.println(htp2);
	    }
	}



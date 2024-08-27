package leTung_20109351_DiemSinhVien_Bai4;
import java.util.Scanner;
public class InDanhSach {

	

	

		   public static void main(String[] args) {
		        
		        DiemSinhVien sv1 = new DiemSinhVien(12345, "Nguyen Van A", 8.5f, 9.0f);

		        
		        DiemSinhVien sv2 = new DiemSinhVien(67890, "Tran Thi B", 7.0f, 6.5f);

		        
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Nhap thong tin sinh vien thu 3:");
		        
		        System.out.print("Nhap ma sinh vien: ");
		        int maSinhVien = scanner.nextInt();
		        scanner.nextLine(); 

		        System.out.print("Nhap ho ten: ");
		        String hoTen = scanner.nextLine();

		        System.out.print("Nhap diem LT: ");
		        float diemLT = scanner.nextFloat();

		        System.out.print("Nhap diem TH: ");
		        float diemTH = scanner.nextFloat();

		        
		        DiemSinhVien sv3 = new DiemSinhVien(maSinhVien, hoTen, diemLT, diemTH);

		       
		        scanner.close();

		       
		        System.out.printf("%-10s %-20s %-8s %-8s %-8s%n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
		        System.out.println("------------------------------------------------------");
		        System.out.println(sv1);
		        System.out.println(sv2);
		        System.out.println(sv3);
		    }
		}


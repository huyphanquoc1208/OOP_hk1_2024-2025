package PhanQuocHuy_21078701;

public class Test {
	public static void main(String[] args) throws Exception {
	  PhanSo ps1 = new PhanSo(1, 2);
	  PhanSo ps2 = new PhanSo(3, 4);
	
	  System.out.println("Tổng: " + ps1.cong(ps2));
	  System.out.println("Hiệu: " + ps1.tru(ps2));
	  System.out.println("Tích: " + ps1.nhan(ps2));
	  System.out.println("Thương: " + ps1.chia(ps2));
	}
}

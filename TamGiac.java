package Java.Trycatch;
import java.util.*;
import java.util.Scanner;

public class TamGiac {

	public static void main(String[] args) {
		do {
			try {
				int a, b, c;
				float p, s, cv;
				
				a=NhapSoNguyen("Nhap canh a : ");
				b=NhapSoNguyen("Nhap canh b : ");
				c=NhapSoNguyen("Nhap canh c : ");
				p=nuaChuVi(a,b,c);
				s=dienTich(a,b,c);
				cv=chuVi(a,b,c);
				System.out.println("Nua chu vi hinh tam giac:" + p);
				System.out.println("Chu vi hinh tam giac:" + cv);
				System.out.println("Dien tich hinh tam giac:" + s);
				return;
			} catch (Exception e) {
				System.out.println("Phải nhập giá trị số");
			}
		} while (true);
		
				
	}

	private static float chuVi(int a, int b, int c) {
		float p=(float)(a+b+c)/2;
		float sd;
		
		sd = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return sd;
	}

	private static float dienTich(int a, int b, int c) {
		return a+b+c;
	}

	private static float nuaChuVi(int a, int b, int c) {
		return (float)(a+b+c)/2;
	}

	private static int NhapSoNguyen(String string) {
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(string);
		x=sc.nextInt();
		if (x > 0 ) 
		throw new InputMismatchException("Giá trị không được nhỏ hơn 0.");
		return x;
	}


}

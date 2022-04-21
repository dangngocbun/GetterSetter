package advance1.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 arr[] = new Student1[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("NHAP VAO 5 SINH VIEN");
		System.out.println("******************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap vao sinh vien thu " + (i + 1));
			arr[i] = new Student1();
			
			System.out.println("Nhap ten");
			arr[i].setName(sc.nextLine());
			
			System.out.println("Nhap tuoi");
			arr[i].setOld(sc.nextInt());
			
			System.out.println("Toan");
			arr[i].setToan(sc.nextFloat());
			
			System.out.println("Li");
			arr[i].setLi(sc.nextFloat());
			
			System.out.println("Hoa");
			arr[i].setHoa(sc.nextFloat());
			sc.nextLine();
			
			System.out.println("***********************");
		}
		//In danh sach sinh vien
		System.out.println("DANH SACH SINH VIEN");
		for (int i = 0; i < arr.length; i++) {
			System.out.format("Name:%s - Old:%d - DTB:%.2f", arr[i].getName(), arr[i].getOld(), arr[i].getDtb()).println();
		}
		
		//Tim dtb cao nhat
		float dtb = arr[0].getDtb();
		for (int i = 0; i < arr.length; i++) {
			if(dtb < arr[i].getDtb())
				dtb = arr[i].getDtb();
		}
		//In danh sach sinh vien co dtb cao nhat
		System.out.println("DANH SACH SINH VIEN CO DIEM TRUNG BINH CAO NHAT");
		System.out.println("**********************************************");
		print(arr);
		
		//Sap xep
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].getDtb() < arr[j].getDtb()) {
					Student1 sv = arr[i];
					arr[i] = arr[j];
					arr[j] = sv;
				}
			}
		}
		System.out.println("SAP XEP DANH SACH");
		System.out.println("****************");
		print(arr);
	}

	private static void print(Student1[] arr) {
		// TODO Auto-generated method stub
		//In danh sach sinh vien
		for (int i = 0; i < arr.length; i++) {
			System.out.format("Name:%s - Old:%d - DTB:%.2f", arr[i].getName(), arr[i].getOld(), arr[i].getDtb()).println();
		}
		
	}

}

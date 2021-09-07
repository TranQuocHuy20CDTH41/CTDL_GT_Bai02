package basic.dev;
import java.util.Scanner;
class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x =  new int [10];
		inputArr(x);
		expArr(x);	
		countChanLe(x);
		printChia(x);
	}
	
	// Nhap mang
	public static void inputArr( int []x) {
	Scanner sc =new Scanner(System.in);
	
		for(int i = 0 ; i < x.length; i++) {
		System.out.printf("Nhap vao A[%d] = ", i);
		x[i] = sc.nextInt();
		}
	}
	//in mang
	static void expArr(int []x) {
		for(int i = 0 ; i < x.length; i++) {
			System.out.printf("%d\t ", x[i]);
		}
	}
	//Dem cac phan tu chan
	static void countChanLe(int [] x) {
		int countC = 0;
		int countL = 0;
		
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] % 2 == 0) {
				countC++;
			}	else {
				countL++;
			
		System.out.printf("Mang co so phan tu chan la: %d", countC);
		System.out.printf("Mang co so phan tu le la: %d\n", countL);
		}
	}
}
	//Cac phan tu chan khong chia het cho 3
	static void printChia(int [] x) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] % 2 == 0)
				if(x[i] % 3 == 0) {
					System.out.printf("Phan tu chan chia het cho 3 la: ", x[i]);
				}
			}
		}
	//Sap xep tang dan
	static void shortInc(int []x) {
		int temp = x[0];
		
		for(int i = 0 ; i < x.length; i++) {
			for(int j = i + 1 ; j < x.length ; j++) {
				if(x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		
		}
		System.out.println("Mang tang dan la:\n");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.printf("%d\t",x[i]);
		}
	}
	static void shortDec(int []x) {
		int temp = x[0];
		
		for(int i = 0 ; i < x.length; i++) {
			for(int j = i + 1 ; j < x.length ; j++) {
				if(x[i] < x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		
		}
		System.out.println("\nMang giam dan la:");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.printf("%d\t",x[i]);
		}

	}
	}


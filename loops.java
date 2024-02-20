package mekif_v;

 import java.util.Scanner;

public class main {
	
	public static void f1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 grades");
		int sum = 0;
		for(int i = 0; i < 5; i++){
			int grade = scan.nextInt();
			sum+=grade;
		}
		System.out.println(sum / 5);
	}
	
	public static void f2(){
		Scanner scan = new Scanner(System.in);
		String s1 = "";
		int counter = 0;
		while(!s1.equals("enter")){
			s1 = scan.nextLine();
			counter++;
		}
		System.out.println(counter);
	}
	
	public static void f3(int num){
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int attempts = 3;
		do{
			x = scan.nextInt();
			if(x == num){
				System.out.println("how much money?");
				break;
			}
			else{
				System.out.println("error");
			}
			attempts--;
		}while(attempts > 0);
		
	// 931 % 10 == 1
	// sum += 1 ---> sum = 1
	// 93 % 10 == 3
	// sum += 3 ---> sum = 4
	// 9 % 10 == 9
	// sum += 9 ---> sum = 13
	}
	public static void f20(int num) {
		int count =0;
		while(num>0) ;
		{
		num = num/10;
		count++;
		}
	}
	
	// abba
	}
	
	public static boolean f5(String s){
		for(int i = 0; i <= s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
	
	public static void f6(int num){
		for(int i = 1; i < num; i++){
			if(num % i == 0)
				System.out.print(i + ",");
		}
		System.out.print(num);
	}
	
	public static void f7(){
		for(int i = 0; i < 10; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(10 * i + j + "  ");
			}
			System.out.println();
		}
	}
	
	// f1 = 1, f2 = 1, 1,1,2,3,5,8,13...
	public static boolean f9(int num)
	{
		int f1 = 1;
		int f2 = 1;
		int fn = f1 + f2;
		while(fn <= num)
		{
			if(fn == num)
				return true;
			else
			{
				int temp = fn;
				f1 = f2;
				fn = fn + f2;
				f2 = temp;
			}
		}
		return false;
	}
	
	public static int f10(int num1, int num2)
	{
		int sum = 0;
		for(int i = 0; i < num2; i++)
		{
			sum += num1;
		}
		return sum;
	}
	
	public static void f11(int a1, int d, int n)
	{
		int an = a1 + (n - 1) * d;
		for(int i = a1; i <= an; i += d)
		{
			System.out.println(i+" ");
		}
	}
	// 1% = 0.01, 0.5% = 0.005
	
	public static void f13(int i1, int i2) {
		int f1 = 1, f2 = 1, fn = f1 + f2, cnt=0;
		do {
			int temp = fn;
			f1 = f2;
			fn = fn + f2;
			f2 = temp;
			if(cnt<i1)
				continue;
			System.out.print(f2+" ");
		}while(cnt<i2-1);
	}
	public static void f15(int mashkanta, int months)
	{
		int total = 0;
		double monthly_bill = (mashkanta / months) + (0.005 * mashkanta);
		for(int i = 0; i < months; i++)
		{
			total += monthly_bill;
		}
		System.out.println(total);
	
	}
	 public static void f12(int height) {
		 int i, j;
		 int fix = height-1;
		 int base = fix+height;
		 int x1 = base/2;
		 int x2 = base/2;
		 for(i=0; i<height; i++) {
			 for(j=0; j<base; j++) {
				 if(j >= x1 && j<= x2)
					 System.out.print("*");
				 		else
					 System.out.print(" ");
			 }
			 x1--;
			 x2++;
			 System.out.println();
		 }

		public static void main(String[] args) {
		f20(5);
	}
}

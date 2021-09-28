package basic.java;

public class basic {
	public static void main(String args[]) {
		System.out.println("Welcome!");
		byte age = 29;
		short year_of_birth = 2000;
		int pincode = 416118;
		long phone_number = 8669827122L;
		char section = 'B';
		String name = "Tanishqua Mudaliar";
		int my_Int = 9;
		double my_Double = my_Int;
		double my_Double_Var = 9.78d;
		int my_Int_Var = (int) my_Double_Var;
		int my_num = 20;
		 if(my_num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		 int num1 = 50;
		 if(num1 > 0 && num1 % 2 == 0) {
			 System.out.println("Even positive");
		 }
		 else if(num1 < 0 && num1 % 2 == 0) {
			 System.out.println("Even negative");
		 }
		 else if(num1 == 0) {
			 System.out.println("Zero");
		 }
		 else if(num1 < 0 && num1 % 2 != 0) {
			 System.out.println("Odd negative");
		 }
		 else {
			 System.out.println("Odd positive");
		 }
		 int num2 = 30;
		 if(num2 > 0 || num2 < 0) {
			 System.out.println("Not Zero");
		 }
		 else {
			 System.out.println("Zero");
		 }
		 boolean value = true;
		 System.out.println(!value);
		 boolean value1 = true;
		 System.out.println(!!value1);
		 int n1 = 20; int n2 = 50;
		 if(n1>n2) {
			 System.out.println("n1 is greater");
		 }
		 else {
			 System.out.println("n2 is greater");
		 }
		System.out.println(1==1);
		System.out.println(1==10);
		System.out.println(1!=10);
		System.out.println(1!=1);
		System.out.println(100>1);
		System.out.println(100>100);
		System.out.println(100<100);
		System.out.println(100>=100);
		System.out.println(age);
		System.out.println(year_of_birth);
		System.out.println(pincode);
		System.out.println(phone_number);
		System.out.println(section);
		System.out.println(name);
		System.out.println(my_Double);
		System.out.println(my_Int_Var);
		
	}
}

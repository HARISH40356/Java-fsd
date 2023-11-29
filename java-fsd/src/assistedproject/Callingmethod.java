package assistedproject;

public class Callingmethod {

		public static void main(String[] args) {
			Callingmethod m1=new Callingmethod();
		m1.method1();
		int sub=m1.add(50,2 );

		System.out.println(sub);
		m1.method2("Method with a parameter and no return type");
		}
		void method1() {
		 System.out.println("Method with no argument and no return type");
	 }
		int add(int a,int b) {
		 return a-b;
		}
		void method2(String Statement) {
		 System.out.println(Statement);
	 }
	 
	}



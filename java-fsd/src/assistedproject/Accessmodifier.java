package assistedproject;

public class Accessmodifier {
	//Public
		public static void m1() {
			System.out.println("public modifier ");
		}
		//protected
		protected static void m2() {
			System.out.println("protected modifier ");
		}
		//private
		private static void m3() {
			System.out.println("private modifier");
		}
		//default
		static void m4() {
			System.out.println("default access modifer");
		}
		public static void main(String[] args){
			Accessmodifier.m1();
			Accessmodifier.m2();
			Accessmodifier.m3();
			Accessmodifier.m4();
		  
			}
		

}

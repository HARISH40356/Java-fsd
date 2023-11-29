package assistedproject;

class innerClass2 {

	 private String msg="Welcome to java simplelearn"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+" hiiii");}  
	 }  
}
	 class innerClassAssisted7 {

		 private String msg=("Inner Classes");

		  void display(){  
		 	 class Inner{  
		 		 void msg(){
		 			 System.out.println(msg);
		 		 }  
		   }  
		  
		   Inner l=new Inner();  
		   l.msg();  
		  }  }
		  abstract class AnonymousInnerClass {
			   public abstract void display();
			}

public class Innerclass {

	public static void main(String[] args) {

		innerClass2 obj=new innerClass2();
		innerClass2.Inner in=obj.new Inner();  
		in.hello();
		System.out.println(" ");
		innerClassAssisted7  ob=new innerClassAssisted7 ();  
		ob.display(); 
		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	}
	}



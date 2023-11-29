package assistedproject;
public class Constructor {
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Constructor(int a)
	{
		System.out.println("parameteraized constructor with int: " + a);
		
	}
	public Constructor(String s, int b)
	{
		System.out.println("parameteraized constructor with string and int: " + s + " "+ b);
	}
	

	public static void main(String[] args) {
		Constructor defaultConstructor = new Constructor();
		Constructor parameterConstructor = new Constructor(10);
		Constructor twoparameterConstructor = new Constructor("Hi ", 30);
		

	}

}
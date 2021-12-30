public class Exceptions {

	public static void main(String[] args) {
		try {
			int a=1;
			int b=42/a;
			int c[]= {100};
			c[40] = 20;
		}
		
		catch(ArithmeticException e) {
			System.out.println("This exception is caught only for division by zero not for array indexed of Bound.");
		}
		
		catch(Exception e) {
			System.out.println("Generic Exception catch");
		}

	}

}

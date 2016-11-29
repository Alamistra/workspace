
public class FooBarBaz {
	public static void main(String[] args){
		for (int num=1; num <=50; num++){
			System.out.printf("%n"+num);
			if ((num % 3) == 0)
				System.out.print(" Foo");
			
			if ((num % 5) == 0)
				System.out.print(" Bar");
			
			if ((num % 7) == 0)
				System.out.print(" Baz");
			
			//System.out.println();
		}
	}
}

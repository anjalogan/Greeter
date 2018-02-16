
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		GreeterClass bob = new GreeterClass();
		System.out.println(bob.toString());
		
		GreeterClass[] array = new GreeterClass[10];
		for(int x = 0;x<10;x++){
			array[x] = new GreeterClass();
		}
		for(int x = 0;x<10;x++){
			System.out.println(array[x].toString());
		}
	}

}

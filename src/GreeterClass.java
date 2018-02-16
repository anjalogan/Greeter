
public class GreeterClass {

	private String name;
	private int age;
	
	public GreeterClass(){
		name = "Anja";
		age = 16;
	}
	public GreeterClass(String xName, int xAge){
		name = xName;
		age = xAge;
	}
	public String toString(){
		return "GreeterClass: "+name+age;
	}

}

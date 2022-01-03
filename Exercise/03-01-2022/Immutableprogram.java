
public class Immutableprogram {
	private String name;
	Immutableprogram (String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}
	public static void main(String[] args) {
	Immutableprogram obj = new Immutableprogram("hello");
	System.out.println(obj.getName());
	//obj.setName("new hello");
	//System.out.println(obj.getName());
	}
	}
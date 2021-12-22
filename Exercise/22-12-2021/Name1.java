import java.util.*;
import java.util.stream.Collectors;
 class Name{
 int id;
 String name;
  float age;
 
public Name(int id,String name,float age) {
		this.id=id;
		this.name=name;
		this.age=age;

	}

}
 public class Name1 {
	 
	public static void main(String[] args) {
	//TODO AUTO-generated method stub
		List<Name>nameList=new ArrayList<Name>();
		nameList.add(new Name(1,"Rajesh",20));
		nameList.add(new Name(2,"Raj",21));
		nameList.add(new Name(3,"bhanti",22));
		nameList.add(new Name(4,"bhuvan",27));
		
		 List<Float> nameList3=nameList.stream()
				 .filter(a-> a.age>20)
				 .map(a->a.age)
				 .collect(Collectors.toList());
		 System.out.println(nameList3);

  }
}
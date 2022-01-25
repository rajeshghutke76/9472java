
public class Room {
	
	int roomNo;
	String roomType;
	float roomArea;
	boolean ac_machine;
	
	void setdata(int a, String b,float c, boolean d) {
		roomNo=a;
		roomType=b;
		roomArea=c;
		ac_machine=d;
		
	}
   void displaydata() {
	   System.out.println("roomNo: " + roomNo);
	   System.out.println("roomType: " + roomType);
	   System.out.println("roomArea: " + roomArea);
	   String s= (ac_machine)?"yes":"no";
	  System.out.println("ac machine is needed " + s);
	 //System.out.println("ac_machine: " + ac_machine);
	   
	   
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room();
		
		r.setdata(10, "RAJESH", 10.2f, true);
		
		r.displaydata();
		

	}

}
/*
Output:
 roomNo: 10
roomType: RAJESH
roomArea: 10.2
ac machine is needed yes

 */














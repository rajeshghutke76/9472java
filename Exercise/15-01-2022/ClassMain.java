
class ClassMain {
	void dis(int number){
		System.out.println("method:"+number);
		}
		void dis(int number1,int number2){
		System.out.println("method:"+number1+","+number2);
		}
		double dis(double number){
		System.out.println("method:"+number);
		return number;
		}
		}

		class CompileTimePolymorphismExample{

	public static void main(String[] args) {
		ClassMain obj=new ClassMain();
		double result;
		obj.dis(40);
		obj.dis(70,30);
		result=obj.dis(6.1);
		System.out.println("Answer is:"+result);
	}
		}
/*
Output:
method:40
method:70,30
method:6.1
Answer is:6.1

		 
 */

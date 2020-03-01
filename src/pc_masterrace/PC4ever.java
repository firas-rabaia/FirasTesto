package pc_masterrace;

public class PC4ever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Consle for ever");
		calc c= new calc();
		int add=c.add(5, 6);
		System.out.println(add);
		
	}
}
class calc {
	public int a,b;
	
	int add(int a,int b) {
		return a+b;
		
	}
	
}

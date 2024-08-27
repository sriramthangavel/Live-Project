package episode6;

public class ThisAndInstance {
	int c = 15;
	void add(int a,int b) {
	int c=10;
		System.out.println(a+b+this.c);
	}
	
	public static void main(String[] args) {
		ThisAndInstance obj1 = new ThisAndInstance();
		obj1.add(5,12);
	}

}


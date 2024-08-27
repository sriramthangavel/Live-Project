package episode5;

public class Mobile {
	
	public void SaveContact(long a) {
		System.out.println(a+"~~Number saved~~");
	}
	public void Call(long b) {
		System.out.println(b+" call connected by typing the number");
	}
	public void Call(String c) {
		System.out.println(c+" call connected by name");
	}

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.SaveContact(994439754);
		obj1.Call("Kiruthiga");
		obj1.Call("Sriram");
	}

}

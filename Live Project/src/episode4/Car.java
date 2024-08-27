package episode4;

public class Car {

		String Car1 = "BMW";
		String Car2 = "AUDI";
		
		public void CarColor() {
			System.out.println("The Car color is Blue");
		}
		public String CarDirection() {
			return "The Car is turning right";	
		}
		private static String CarSpeed() {
			return "The Car is moving @ a speed of 50 km/hr";
		}
		public boolean Status(){
			return true;					
		}
		
		public static void main(String[] args) {
			CarSpeed();
			System.out.println(CarSpeed());
		}
}

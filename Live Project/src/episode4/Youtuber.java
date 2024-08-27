package episode4;

public class Youtuber {

	public void CreateVideo() {
		System.out.println("Video created");
	}
	private static boolean Uploading() {
		System.out.println("Uploading..");
		return true;			
	}
	public String ShareVideo() {
		return "Happy Sharing..";	
	}
	public static void main(String[] args) {
	Uploading();}
}

package episode5;

public class Youtuber {

	public void CreateVideo() {
		System.out.println("Video created");
	}
	private boolean Uploading() {
		System.out.println("Uploading..");
		return true;			
	}
	public String ShareVideo() {
		return "~Happy Sharing~";	
	}
	private void DeleteVideo(String Videoid) {
		System.out.println("Video Deleted - "+Videoid);
	}
	
	public static void main(String[] args) {
	Youtuber obj1 = new Youtuber();
	obj1.Uploading();
	obj1.DeleteVideo("1d1g2d545");
	Youtuber obj2 = new Youtuber();
	obj2.DeleteVideo("jdj8564jh");
	}
	
	
}

package episode4;

public class MyYoutube {

	public static void main(String[] args) {
		Youtuber yt = new Youtuber();
		yt.CreateVideo();
		String message = yt.ShareVideo();
		System.out.println(message);
	}

}

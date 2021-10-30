package week1.day1;

public class ObjectCreation {

	String modelName;
	char logo;
	int displaySize;

	public void makecall() {
		System.out.println("Able to make call");
	}

	public static void main(String[] args) {

		ObjectCreation apple = new ObjectCreation();
		apple.makecall();

		apple.displaySize = 6;
		System.out.println("Display size = " + apple.displaySize);

	}

}

package vivian.com;

public class Main {

	public static void main(String[] args) {
		System.out.println("Get up.");
		Breakfast breakfast = new Breakfast();
		breakfast.start();

		BrushTeeth bt = new BrushTeeth();
		Thread thread= new Thread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main end");
	}

}

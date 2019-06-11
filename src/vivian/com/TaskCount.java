package vivian.com;

public class TaskCount {

	public static void main(String[] args) {
		System.out.println("Get up.");
		Breakfast breakfast = new Breakfast();
	
		breakfast.start();

		BrushTeeth bt = new BrushTeeth();
		bt.start();
	}

}

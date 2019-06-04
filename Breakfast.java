package vivian.com;

public class Breakfast extends Thread {
@Override
	public void run() {
		try {
			System.out.println("MAking breakfast");
			Thread.sleep(4000);
			System.out.println("breakfast done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

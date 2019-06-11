package vivian.com;

public class BrushTeeth extends Thread {
@Override
	public void run() {
		try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("brush teeth done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

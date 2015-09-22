
public class DownCounter implements Runnable {
	private int startNumber;
	
	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	@Override
	public void run() {
		countdown();
	}

	private void countdown() {
		while(getStartNumber() > -1) {
			
			System.out.println(startNumber--);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class NewThread1 implements Runnable {
	String word;
	Thread t;	
	NewThread(String text, int time) {
		word = text;
		t = new Thread(this, word);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			while(1) {
				System.out.println(word);
				Thread.sleep(time);
			}
		}
		catch(InterruptedException e) {
			System.out.println(word + " Interrupted");
		}
		System.out.println(word + " exited");
	}
}

class Thread_pr9 {
	public static void main(String args[]) {
		new NewThread("BMS College of Engineering", 10000);
		new NewThread("CSE", 2000);
	}
}

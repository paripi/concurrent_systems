
public class Multithreads {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		for(int i = 0; i < 1000; i++){
			System.out.print("Good"+i);
		}

	}

}

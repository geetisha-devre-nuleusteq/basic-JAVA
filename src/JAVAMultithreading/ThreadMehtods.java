package JAVAMultithreading;

public class ThreadMehtods extends Thread {
	public void run() {
		try {
			System.out.println("hello I am Thread" + Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	public static void main(String... ar) throws Exception {
		ThreadMehtods tm1 = new ThreadMehtods();

		ThreadMehtods1 tm2 = new ThreadMehtods1();

//ThreadMehtods tm2=new ThreadMehtods();
//
//ThreadMehtods tm3=new ThreadMehtods();
//
//ThreadMehtods tm4=new ThreadMehtods();
		tm1.setName("first");
		tm2.setName("second");
//tm3.setName("three");
//Question 7 set priority
		tm1.setPriority(MAX_PRIORITY);

		tm1.start();
		tm2.start();
//tm3.start();

	}
}

class ThreadMehtods1 extends Thread {
	public void run() {
		try {
			System.out.println("hello I am Thread" + Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

package ABC;

public class Thread2 extends Thread {
	int B[];
	long t3 = 0;
	long t4 = 0;
	public Thread2(int a[])
	{
		t3 = System.currentTimeMillis();
		this.B = a;
	}
	public void run() {
		for (int i = (int)B.length/2; i < (int)B.length; i++) {
			System.out.println("Thread2 : " + B[i]);
		}
		t4 = System.currentTimeMillis();
		System.out.println("t sau 2222222222222222222222 = " + (t4-t3));
	}
}

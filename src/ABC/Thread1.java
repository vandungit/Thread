package ABC;

public class Thread1 extends Thread {
	
	int A[];
	long t1 = 0;
	long t2 = 0;
	public Thread1(int a[])
	{
		t1 = System.currentTimeMillis();
		this.A = a;
	}
	public void run() {
		for (int i = 0; i < (int)A.length/2; i++) {
			System.out.println("Thread1 : " + A[i]);
		}
		t2 = System.currentTimeMillis();
		System.out.println("t sau 11111111111111111111111111111 = " + (t2-t1));
	}
}

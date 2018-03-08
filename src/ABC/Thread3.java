package ABC;

public class Thread3 extends Thread{
	int A[];
	long t5 = 0;
	long t6 = 0;
	public Thread3(int a[])
	{
		t5 = System.currentTimeMillis();
		this.A = a;
	}
	public void run() {
		System.out.println("t ban dau = " + t5);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread1 : " + i);
		}
		t6 = System.currentTimeMillis();
		System.out.println("t sau 3333333333333333333333 = " + (t6-t5));
	}
}

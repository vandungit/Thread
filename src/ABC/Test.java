package ABC;
import java.util.Calendar;

public class Test {
	
	private static final Calendar Calender = null;

	public static void main(String[] args) throws InterruptedException {
		int a[] = new int[1000];
		for(int i=0; i<1000; i++)
		{
			i++;
			a[i] = i;
		}
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		t1.start();
		t2.start();
		
		Thread3 t3 = new Thread3(a);
		t3.start();
	}
}

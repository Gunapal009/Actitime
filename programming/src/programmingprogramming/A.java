package programmingprogramming;

public class A extends Thread
{
	@Override
 public synchronized void run()
 {
		/*System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());*/
	String name = Thread.currentThread().getName();
	
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(name);
	}
 }
}

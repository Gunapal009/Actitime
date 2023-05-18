package programmingprogramming;

public class Bus implements Runnable 
{
	int available;
	int passenger;
    Bus(int available, int passenger)
    {
     this.available=available;
     this.passenger=passenger;
    }
	@Override
	public synchronized void run() 
	{
	 if(available>=passenger)
	 {
		 String name = Thread.currentThread().getName();
		 System.out.println(name+" seat got");
		 available=available-passenger;
	 }
	 else
	 {
		 System.out.println("seat not got");
	 }
	}

}

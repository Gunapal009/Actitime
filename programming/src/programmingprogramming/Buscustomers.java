package programmingprogramming;

public class Buscustomers 
{
public static void main(String[] args)
{
	
Bus b=new Bus(2,2);

Thread t1=new Thread(b);
Thread t2=new Thread(b);
Thread t3=new Thread(b);

t1.setName("raju");
t2.setName("irfan");
t3.setName("chetan");

t1.start();
t2.start();
t3.start();

}
}

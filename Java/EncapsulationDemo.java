package OOPS;
import java.lang.Object;
class Furniture
{
	public double length=100.00;
	public double width=200.00;
	public double height=300.00;
	public void volume()
	{
		double vol;
		vol=length*width* height;
		System.out.println("VOLUME IS:"+vol);
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Furniture chair=new Furniture();//object /instance creation
    chair.volume();
   
   System.out.println("works fine");
  
    
	}

}

import java.rmi.Naming;


public class Health_Care_Centre_server{
	public static void main(String[] args) {
			
			try{
				Health_Care_Centre_Interface object = new Health_Care_Centre();
				Naming.rebind("Add",object);
				System.out.print("-----------Welcome to Health Care Centre-----------\n-----------We give our best services to you-----------");

		}
		
		catch(Exception e){
			System.out.print("Error"+e);
		}
	}
}

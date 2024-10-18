import java.rmi.Naming;
import java.util.*;
import java.util.Arrays;
public class Health_Care_Centre_client{
	public static void main(String[] args) {
		try{
			Health_Care_Centre_Interface new1=(Health_Care_Centre_Interface) Naming.lookup("Add");
			//System.out.print(new1.Show());
			String[] show  = new1.Show();
			String[] show1 = new1.Doctor_Details();
			String[] show2 = new1.Dr_Kamal();
			String[] show3 = new1.Dr_Ranaweera();
			String[] show4 = new1.Dr_Senaratne();
			String[] show5 = new1.Dr_VipulaDeSilva();
			String[] show6 = new1.Dr_Perera();

			//Pharmacy Details
			String[] p1=new1.Pharmacy_Detils();
			String[] p2=new1.Pharmacy();
			String[] p3=new1.Medicines();
			String[] p4=new1.Stock();
			

			//Clinic
			String[] f1=new1.Clinics();
			String[] f2=new1.Primary_Care_Clinics();
			String[] f3=new1.Specialized_Clinics();
			String[] f4=new1.Mental_Health_Clinic();
			String[] f5=new1.Addiction_Services_Clinic();

			//Facilities
			String[] c1=new1.Facilities();
			String[] c2=new1.ICU();
			String[] c3=new1.ECG();
			String[] c4=new1.Laboratory();
			String[] c5=new1.X_ray();
			

			while(true){
				for (int i=0;i<5 ;i++ ) {
					System.out.println((i+1)+"."+show[i]);
				}
				Scanner sc=new Scanner(System.in);

				System.out.println("-----------Welcome to Health Care Centre-----------");
				System.out.println("-----------We give our best services to you-----------");
				System.out.println("\nEnter your Choice:");
				int choice=sc.nextInt();
				System.out.print("\n");

//Doctor Details
if (choice==1) 
{	
	while (true) 
	{
						for (int i=0;i<6 ;i++ ) {
							System.out.println((i+1)+"."+show1[i]);

						}
						System.out.println("\nEnter your Choice:");
						int doc=sc.nextInt();
						System.out.print("\n");

						if(doc==1){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(show2[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}

							
						}

						else if(doc==2){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(show3[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}

							
						}
						else if(doc==3){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(show4[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}

							
						}

						else if(doc==4){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(show5[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}

							
						}

						else if(doc==5){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(show6[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}

							
						}
						else if (doc==6) {
							break;
						}
						
	}



				
}





				//Pharmacy Details
	else if (choice==2) 
	{
		while (true) 
		{
						for (int i=0;i<4 ;i++ ) {
							System.out.println((i+1)+"."+p1[i]);

						}
						System.out.println("\nEnter your Choice:");
						int pharma=sc.nextInt();
						System.out.print("\n");
						
						//pharmacy details
						if(pharma==1){
							for (int i=0;i<2 ;i++ ) {
								System.out.println(p2[i]);
							}

							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int b2=sc.nextInt();
							if (b2==1) {
									continue;
							}
							if (b2==2) {
								System.exit(0);
							}
							}


						//medicine details
						else if(pharma==2){
							for (int i=0;i<4 ;i++ ) {
								System.out.println(p3[i]);
							}
							
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int b2=sc.nextInt();
							if (b2==1) {
									continue;
							}
							if (b2==2) {
								System.exit(0);
							}
							}


						//stock details
						else if(pharma==3){
							for (int i=0;i<4 ;i++ ) {
								System.out.println(p4[i]);
							}
							
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int b2=sc.nextInt();
							if (b2==1) {
									continue;
							}
							if (b2==2) {
								System.exit(0);
							}
							}


						//back to the main options
						else if (pharma==4) {
							break;
						}
		}
				
				
	}
			
			//Clinic
		else if (choice==3) 
		{	
					
			while (true) 
			{
						for (int i=0;i<5 ;i++ ) {
							System.out.println((i+1)+"."+f1[i]);
							}	//

						System.out.println("\nEnter your Choice:");
						int doc1=sc.nextInt();
						System.out.print("\n");

						//Primary_Care_Clinics details
						if(doc1==1){
							for (int i=0;i<2 ;i++ ) {
								System.out.println(f2[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}	//
							if (back==2) {
								System.exit(0);
							}	//

							
						}

						//Specialized_Clinics details
						else if(doc1==2){
							for (int i=0;i<2;i++ ) {
								System.out.println(f3[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}	//
							if (back==2) {
								System.exit(0);
							}		//
						}

						//Mental_Health_Clinic details
						else if(doc1==3){
							for (int i=0;i<2;i++ ) {
								System.out.println(f4[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}	//
							if (back==2) {
								System.exit(0);
							}	//
						}

						//Addiction_Services_Clinic details
						else if(doc1==4){
							for (int i=0;i<2;i++ ) {
								System.out.println(f5[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}	//
							if (back==2) {
								System.exit(0);
							}	//
						}	//


						else if (doc1==5) {
							break;
						}	//
						
		}	//
					
	}	














				//
				//Facilities#

				
		else if (choice==4) 
		{	
			while (true) 
			{
						for (int i=0;i<4 ;i++ ) {
							System.out.println((i+1)+"."+c1[i]);
							}

						System.out.println("\nEnter your Choice:");
						int doc=sc.nextInt();
						System.out.print("\n");

						//ICU details
						if(doc==1){
							for (int i=0;i<3 ;i++ ) {
								System.out.println(c2[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}
						}

						//ECG details
						else if(doc==2){
							for (int i=0;i<3 ;i++ ) {
								System.out.println(c3[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}
						}

						//Laboratory
						else if(doc==3){
							for (int i=0;i<5 ;i++ ) {
								System.out.println(c4[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}
						}

						//X-ray details
						else if(doc==4){
							for (int i=0;i<4 ;i++ ) {
								System.out.println(c5[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter your Choice:");
							int back=sc.nextInt();
							if (back==1) {
									continue;
							}
							if (back==2) {
								System.exit(0);
							}
						}

						else if (doc==5) {
							break;
						}
					}
				}


					else if(choice==5){
					System.exit(0);

}
		}
					
	}	
				
			catch (Exception e){
			System.out.print("error"+e);
		}
	}

}

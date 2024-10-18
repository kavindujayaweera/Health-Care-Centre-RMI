import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class Health_Care_Centre extends UnicastRemoteObject implements Health_Care_Centre_Interface {
	public Health_Care_Centre() throws RemoteException {
	}

	public String[] Show() {
		String[] a = { "Doctor Details", "Pharmacy Details", "Clinics", "Facilities", "Exit" };
		return a;
	}

	public String[] Doctor_Details() {
		String[] b = { "Dr.Kamal", "Dr.Ranaweera", "Dr.Senarathne", "Dr.Vipula De Silva", "Dr.Perera", "Back" };
		return b;
	}

	public String[] Dr_Kamal() {
		String[] b = { "**ID number:01", "**Name:Dr.Kamal", "**Specialist:Cardiology", "**Time: 6.00pm-8.00pm",
				"**Qualification:MBBS", "**Channelling Days:(Mon/Wed/Sat)" };
		return b;
	}

	public String[] Dr_Ranaweera() {
		String[] b = { "**ID number:02", "**Name:Dr.Ranaweera", "**Specialist:Neurology", "**Time: 10.00am-12.00pm",
				"**Qualification:MBBS,phd", "**Channelling Days:(Tue/Fri/Sun)" };
		return b;
	}

	public String[] Dr_Senaratne() {
		String[] b = { "**ID number:03", "**Name:Dr.Senarathne", "**Specialist:ENT", "**Time: Full-Day",
				"**Qualification:MBBS", "**Channelling Days:(Every Days)"};
		return b;

	}

	public String[] Dr_VipulaDeSilva() {
		String[] b = { "**ID number:04", "**Name:Dr.VipulaDeSilva", "**Specialist:Dentistry", "**Time: Full-Day",
				"**Qualification:MBBS,Dental", "**Channelling Days:(Every Days) "};
		return b;
	}

	public String[] Dr_Perera() {
		String[] b = { "**ID number:05", "**Name:Dr.Perera", "**Specialist:Dermatalogy", "**Time: 8.00pm-11.00pm",
				"**Qualification:MBBS", "**Channelling Days:(Weekends) " };
		return b;

	}

	//Pharmacy Details
	public String[] Pharmacy_Detils() {
		String[] x = { "Pharmacy", "Medicines", "Stock", "Back" };
		return x;
	}

	public String[] Pharmacy() {
		String[] y = { "--Medical Accessories", "--Baby Products" };
		return y;
	}


	public String[] Medicines() {
		String[] q = { "--Acetaminophen","--Amitriptyline","--Atorvastatin","--Azithromycin" };
		return q;
	}

		public String[] Stock() {
		String[] z = { "--Inhalers 600ps", "--Injections 1000ps","--Drops 500ps","--Suppositories"};
		return z;
	}



	//Clinics
	public String[] Clinics() {
		String[] t = { "Primary_Care_Clinics","Specialized_Clinics","Mental_Health_Clinic","Addiction_Services_Clinic","Back"};
		return t;

	}

	public String[] Primary_Care_Clinics() {
		String[] f = { "**Dr_Kamal", "**Date:sata/sun ", "**time:7am-10am" };
		return f;
	}

	public String[] Specialized_Clinics() {
		String[] f = { "**Dr_Senaratne", "**Date:Mon/Fri ", "**time:7am-10am" };
		return f;
	}

	public String[] Mental_Health_Clinic() {
		String[] f = { "**Dr_Ranaweera", "**Date:Thu/Wen ", "**time:7am-10am" };
		return f;
	}

	public String[] Addiction_Services_Clinic() {
		String[] f = { "**Dr_Perera", "**Date:Fri/sun ", "**time:7am-10am" };
		return f;
	}


	//Facilities
	public String[] Facilities() {
		String[] i = { "ICU","ECG","Laboratory","X-ray","Back" };
		return i;
	}
	public String[] ICU() {
		String[] i = { "**Open 24 hrs", "**Ambulance Service ", "**Best Staff" };
		return i;
	}
	public String[] ECG() {
		String[] i = { "**Date:Everyday/Morning", "**Cardiology Specialist ", "**Quick Service" };
		return i;
	}
	public String[] Laboratory() {
		String[] i = { "**Blood Testing", "**Urine Testing ", "**Vaccination", "**Quick Service", "**Best staff" };
		return i;
	} 
	public String[] X_ray() {
		String[] i = { "**Best Staff", "**High Quality ", "**24 hour radiography service","**basic X-rays including dental x-rays" };
		return i;
	}

	

}

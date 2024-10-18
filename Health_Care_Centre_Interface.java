import java.rmi.*;


public interface Health_Care_Centre_Interface extends Remote{
	public String[] Show() throws RemoteException;
	public String[] Doctor_Details() throws RemoteException;
	public String[] Dr_Kamal() throws RemoteException;
	public String[] Dr_Ranaweera() throws RemoteException;
	public String[] Dr_Senaratne() throws RemoteException;
	public String[] Dr_VipulaDeSilva() throws RemoteException;
	public String[] Dr_Perera() throws RemoteException;
	

	//Pharmacy Details
	public String[] Pharmacy_Detils() throws RemoteException;
	public String[] Pharmacy() throws RemoteException;
	public String[] Medicines() throws RemoteException;
	public String[] Stock() throws RemoteException;
	
	

	//Clinics
	public String[] Clinics() throws RemoteException;
	public String[] Primary_Care_Clinics() throws RemoteException;
	public String[] Specialized_Clinics() throws RemoteException;
	public String[] Mental_Health_Clinic() throws RemoteException;
	public String[] Addiction_Services_Clinic() throws RemoteException;

	
	//Facilities
	public String[] Facilities() throws RemoteException;
	public String[] ICU() throws RemoteException;
	public String[] ECG() throws RemoteException;
	public String[] Laboratory() throws RemoteException;
	public String[] X_ray() throws RemoteException;

	}

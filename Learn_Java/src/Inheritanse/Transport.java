package Inheritanse;
import java.util.*;

class Vehicles
{
	
	private String Vech_model;
	private int Regis_number;
	private int Vech_speed; //km/h
	private int Fuel_Capacity;   //li
	private int fule_counsumption;  //KM/lit
	
	Vehicles()
	{
		System.out.println("this defoult counstructoer");
	}
	
	Vehicles(String Vech_model, int Regis_number, int Vech_speed,int Fuel_Capacity,int fule_counsumption)
	{
		this.Vech_model=Vech_model;
		this.Regis_number=Regis_number;
		this.Vech_speed=Vech_speed;
		this.Fuel_Capacity=Fuel_Capacity;
		this.fule_counsumption=fule_counsumption;
		
	}
	
	void setVech_model(String Vech_model )
	{
		this.Vech_model=Vech_model;
	}
	
	void setRegis_number(int Regis_number)
	{
		this.Regis_number=Regis_number;
	}
	
	void setVech_speed(int Vech_speed)
	{
		this.Vech_speed=Vech_speed;
	}
	
	void setFuel_Capacity(int Fuel_Capacity)
	{
		this.Fuel_Capacity=Fuel_Capacity;
	}
	
	void setFul_Counsumption()
	{
		this.fule_counsumption=fule_counsumption;
	}
	
	// getMethode
	
	String getVech_model()
	{
		return Vech_model;
	}
	
	int getRegis_number()
	{
		return Regis_number;
	}
	
	int getVech_speed()
	{
		return Vech_speed;
	}
	
	int getsFuel_Capacity()
	{
		return Fuel_Capacity;
	}
	
	int Ful_Counsumption()
	{
		return fule_counsumption;
	}
	
	// methoed for the Calculation of the fule needed
	int fuelNeede(int distanse)
	{
		
		 int fule_needed=0;
		 fule_needed=distanse/fule_counsumption;
		return fule_needed;
	}
	
	// methoed for the Calculation of the Distanse coverdede
	int distCoverded(int time)
	{
		int dist_Coverded=0;
//		 methoed for the Calculation of the Distanse coverdede
		return dist_Coverded;
	}
	
	void Displey()

	{
		System.out.println("Vech_model"+"\t"+"Regis_number"+"\t"+"Vech_speed"+"\t"+"Fuel_Capacity"+"\t"+"fule_counsumption");
		
		System.out.println(Vech_model+"\t\t"+Regis_number+"\t\t"+Vech_speed+"\t\t"+Fuel_Capacity+"\t\t"+fule_counsumption);
	}
	
}

class Bus extends Vehicles
{
	int Num_Pasenger;
     
;	Bus(int Num_Pasenger,String Vech_model, int Regis_number, int Vech_speed,int Fuel_Capacity,int fule_counsumption)
	{
     	super(Vech_model, Regis_number, Vech_speed, Fuel_Capacity,fule_counsumption);
		this.Num_Pasenger=Num_Pasenger;
	}
}

class Truck extends Vehicles
{
	int Cargo_Wight;
	Truck(int Cargo_Wight,String Vech_model, int Regis_number, int Vech_speed,int Fuel_Capacity,int fule_counsumption)
	{
		super(Vech_model, Regis_number, Vech_speed, Fuel_Capacity,fule_counsumption);
		this.Cargo_Wight=Cargo_Wight;
	}
}

public class Transport
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Cargo_Wight=100;
		String Vech_model="MH2029";
		int Regis_number=1234;
		int Vech_speed=40;
		int Fuel_Capacity=100;
		int fule_counsumption=5;
		int noof_passenger=12;
		int distanse=0;
		
		Truck ref_truck=new Truck(Cargo_Wight,Vech_model,Regis_number,Vech_speed,Fuel_Capacity,fule_counsumption);
	    System.out.println("Information Abpout truck");
        
		ref_truck.Displey();
		int ret=0;
		System.out.println("Enter the Distanse for Truck");
		 distanse=sc.nextInt();
		ret=ref_truck.fuelNeede(distanse);
		System.out.println("Fuel Need for Truck->"+ret);
		
		//information of the bus
		System.out.println();
		Bus ref_bus=new Bus(noof_passenger,Vech_model,Regis_number,Vech_speed,Fuel_Capacity,fule_counsumption);
	    System.out.println("Information Abpout bus");
		ref_bus.Displey();
		System.out.println("Enter the Distanse For Bus");
		distanse=sc.nextInt();
		ret=ref_bus.fuelNeede(distanse);
		System.out.println("Fuel Need  for BUS->"+ret);

	}

}

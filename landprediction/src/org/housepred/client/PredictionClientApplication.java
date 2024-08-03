package org.housepred.client;

import java.util.Scanner;

import org.housepred.config.DbConfig;
import org.housepred.model.CityMasterModel;
import org.housepred.service.CityService;

public class PredictionClientApplication {

	public static void main(String str[])
	{
		CityService cs = new CityService();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1:add new city");
			System.out.println("2:view all city");
			System.out.println("Enter your choise");
			int choise =xyz.nextInt();
			switch(choise)
			{
				 case 1:
					 new DbConfig();
//					xyz.nextLine();
//					System.out.println("Enter the new city name");
//					String cityname =xyz.nextLine();
//					CityMasterModel model = new CityMasterModel();
//					model.setName(cityname);
//					boolean b =cs.isAddCity(model);
					 break;
				 case 2:
					 System.out.println("fnff");
					 break;
				default:
					System.out.println("Enter the Correct input");
			}
		}while(true);
	}
}

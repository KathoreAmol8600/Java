package org.housepred.service;

import org.housepred.model.CityMasterModel;
import org.housepred.repository.CityRepository;

public class CityService {
    CityRepository cityRepo = new CityRepository();
	public boolean isAddCity(CityMasterModel model) {
		
		return cityRepo.isAddCity(model);
	}

}

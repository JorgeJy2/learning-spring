package com.jorgejy.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgejy.beans.Brand;
import com.jorgejy.dao.DAOBrand;
import com.jorgejy.services.ServicesBrand;

@Service
public class ServiceBrandSQL implements ServicesBrand{
 
	@Autowired
	private DAOBrand daoBrand;
	
	@Override
	public void add(Brand brand) throws Exception {
		try {
			daoBrand.add(brand);
		} catch (Exception e) {
			throw e;
		}
	}
 
}

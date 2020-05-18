package com.jorgejy.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgejy.beans.Player;
import com.jorgejy.dao.DAOPlayer;
import com.jorgejy.services.ServicesPlayer;

@Service
public class ServicePlayerSQL implements ServicesPlayer{

	@Autowired
	private DAOPlayer daoPlayer;
	
	@Override
	public void add(Player player) throws Exception {
		try {
			daoPlayer.add(player);
		} catch (Exception e) {
			throw e;
		}
	}

}

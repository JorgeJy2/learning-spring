package com.jorgejy.player_bd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jorgejy.beans.Brand;
import com.jorgejy.beans.Player;
import com.jorgejy.beans.Team;
import com.jorgejy.services.ServicesBrand;
import com.jorgejy.services.ServicesPlayer;
import com.mysql.cj.util.DnsSrv.SrvRecord;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext applicationContext;

	public static void main( String[] args )
    {
        applicationContext = new ClassPathXmlApplicationContext("com/jorgejy/xml/beans.xml");
        
        ServicesPlayer servicesPlayer =(ServicesPlayer) applicationContext.getBean("servicePlayerSQL");
        Brand brand = (Brand) applicationContext.getBean("sportJeans");
        Team team = (Team) applicationContext.getBean("barcelona");
        Player player =(Player) applicationContext.getBean("player");
        
        try {
			servicesPlayer.add(player);
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}

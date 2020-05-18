package com.jorgejy.player_javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jorgejy.beans.Barcelona;
import com.jorgejy.beans.Brand;
import com.jorgejy.beans.Juventus;
import com.jorgejy.beans.Player;
import com.jorgejy.beans.Shirt;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Player player() {
		return new Player();
	}
	
	@Bean
	public Barcelona barcelona (){
		return new Barcelona();
	}
	
	@Bean
	public Shirt shirt() {
		return new Shirt();
	}
	
	@Bean Brand brand() {
		return new Brand();
	}
	
	@Bean Juventus juventus() {
		return new Juventus();
	}
}

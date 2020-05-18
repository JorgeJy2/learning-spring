package com.jorgejy.player_annotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jorgejy.beans.Barcelona;
import com.jorgejy.beans.Juventus;
import com.jorgejy.beans.Player;

/**
 * Hello world!
 *
 */
public class App 
{

	private static ApplicationContext applicationContext;
	Player player;
	
	public App() {
		applicationContext = new ClassPathXmlApplicationContext("com/jorgejy/xml/beans.xml");
		player = applicationContext.getBean(Player.class);
	}
	
	private void showPettionTeam() {
		System.out.println("Elige el equipo");
		System.out.println("1- Barcelon");
		System.out.println("2- Juventus");
	}
	
	private int getResponseTema() {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println("UPS! no get response.");
			scanner.next();
			return getResponseTema();
		}
	}
	
	
	private void selectTeam(int opt) {
		switch (opt) {
			case 1:
				player.setTeam(new Barcelona());
				break;
			case 2:
				player.setTeam(new Juventus());
				break;
			default:
				System.out.println("404 not found");
				break;
		}
	}
	
	public void showInfoPlayer() {
		System.out.println(player.getId());
		System.out.println(player.getName());
		System.out.println(player.getTeam().mostrar());
		System.out.println(player.getShirt().getId());
		System.out.println(player.getShirt().getNumber());
		System.out.println(player.getShirt().getBrand().getId());
		System.out.println(player.getShirt().getBrand().getName());
	}

	public static void main(String[] args) {
		App cli= new App();
		cli.showPettionTeam();
		cli.selectTeam(cli.getResponseTema());		
		cli.showInfoPlayer();
	}
}

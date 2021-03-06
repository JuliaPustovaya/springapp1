package ru.romaniuk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		context.close();
	}
}

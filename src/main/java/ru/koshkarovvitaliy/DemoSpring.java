package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 19.12.2019
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
  public static void main(String[] args) {
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
      MusicPlayer musicPlayerBean = context.getBean("musicPlayer", MusicPlayer.class);
      musicPlayerBean.playMusic();

      System.out.println(musicPlayerBean.getName());
      System.out.println(musicPlayerBean.getVolume());

      // MusicPlayer and RockMusic scopes = prototype => Spring-container creates beans again and do not destroying them
      MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
      mp.playMusic();
    }
  }
}

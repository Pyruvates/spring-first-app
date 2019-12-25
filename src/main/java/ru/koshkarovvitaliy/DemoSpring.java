package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 19.12.2019
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
  public static void main(String[] args) {
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
      MusicPlayer mPlayerBean = context.getBean("musicPlayer", MusicPlayer.class);
      mPlayerBean.playMusic();

      System.out.println(mPlayerBean.getName());
      System.out.println(mPlayerBean.getVolume());
    }
  }
}

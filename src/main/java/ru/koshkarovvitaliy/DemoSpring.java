package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 19.12.2019
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
  public static void main(String[] args) {
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
      Music musicBean = context.getBean("musicBean", Music.class);

      MusicPlayer musicPlayerBean = new MusicPlayer(musicBean);
      musicPlayerBean.playMusic();
    }
  }
}

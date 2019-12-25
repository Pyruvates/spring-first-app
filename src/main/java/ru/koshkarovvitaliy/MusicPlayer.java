package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 25.12.2019
 */

public class MusicPlayer {
  private Music music;

  // IoC
  public MusicPlayer(Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.println("Playing \"" + music.getSong() + "\"");
  }
}

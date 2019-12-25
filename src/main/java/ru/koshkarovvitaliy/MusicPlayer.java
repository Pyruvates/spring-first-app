package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 25.12.2019
 */

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
  private List<Music> musicList = new ArrayList<>();
  private String name;
  private int volume;

  public MusicPlayer() {}

  // IoC
  public MusicPlayer(List<Music> list) {
    this.musicList = list;
  }

  public void doInit() {
    System.out.println("Init " + this.toString() + " instance");
  }

  public void doDestroy() {
    System.out.println("Destroy " + this.toString() + " instance");
  }

  public void setMusicList(List<Music> list) {
    this.musicList = list;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void playMusic() {
    this.musicList.forEach( elem -> System.out.println("Playing \"" + elem.getSong() + "\""));
  }
}

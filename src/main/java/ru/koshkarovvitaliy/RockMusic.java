package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 25.12.2019
 */

public class RockMusic implements Music {
  public void doInit() {
    System.out.println("Init " + this.toString() + " instance");
  }

  public void doDestroy() {
    System.out.println("Destroy " + this.toString() + " instance");
  }

  @Override
  public String getSong() {
    return "Boulevard of broken dreams";
  }
}

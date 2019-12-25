package ru.koshkarovvitaliy;
/*
 * Creating by Koshkarov Vitaliy on 25.12.2019
 */

public class ClassicalMusic implements Music {
  private ClassicalMusic() {}

  public static ClassicalMusic factoryMethod() {
    return new ClassicalMusic();
  }

  public void doInit() {
    System.out.println("Initialisation of " + this.toString() + " instance");
  }

  public void doDestroy() {
    System.out.println("Destroying of " + this.toString() + " instance");
  }

  @Override
  public String getSong() {
    return "Moonlight sonata";
  }
}

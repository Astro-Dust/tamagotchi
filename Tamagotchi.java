public class Tamagotchi {

  private String name;
  private int age;
  private int hunger;
  private int happiness;
  private int health;
  private DateTime bornDate;

  public Tamagotchi(String name) {
    this.name = name;
    this.age = 1;
    this.hunger = 100;
    this.happiness = 100;
    this.health = 100;
    this.bornDate = new DateTime();
  }

  public String getName() {
    return this.name;
  }

  public void rename() {
    this.name = name;
  }

  public void feed() {
    if (this.hunger > 0 && this.hunger <= 100) {
      this.hunger += 10;
    } else {
      System.out.printf("%s is dead.", getName());
    }

  }

  public void play() {

  }

  public String checkStatus() {

  }

  public ageOneDay() {

  }

  

}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tamagotchi {

  private String name;
  private int daysAlive;
  private int hunger;
  private int happiness;
  private int health;
  private LocalDateTime bornDate;
  private boolean isDead;

  public Tamagotchi(String name) {
    this.bornDate = LocalDateTime.now();
    this.name = name;
    this.daysAlive = 1;
    this.hunger = 100;
    this.happiness = 100;
    this.health = 100;
    this.isDead = false;
  }

  public String getName() {
    return this.name;
  }

  public int getDaysAlive() {
    return this.daysAlive;
  }

  public int getHunger() {
    return this.hunger;
  }

  public int getHappiness() {
    return this.happiness;
  }

  public int getHealth() {
    return this.health;
  }

  public String getBornDate() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    return this.bornDate.format(formatter);
  }

  public boolean getIsDead() {
    return this.isDead;
  }

  public void setDead(boolean dead) {
    this.isDead = dead;
  }

  public boolean isAlive() {
    return !getIsDead(); // retorna como false caso tenha colocado o setDead(true)
  }

  public void rename(String name) {
    this.name = name;
  }

  public void feed() {
    if (this.hunger > 0 && this.hunger <= 100) {
      this.hunger += 10;
      this.happiness += 5;
    } else {
      System.out.printf("%s is dead.", getName());
    }

  }

  public void play() {
    // aumentar felicidade em 10

  }

  public void checkStatus() {
    System.out.printf("%s", getName());
    System.out.printf("| Hunger: %d | Happiness: %d | Health: %d | Alive: %b | Born date: %s |%n", getHunger(), getHappiness(), getHealth(), getIsDead(), getBornDate());
  }

  public boolean checkIsAlive() {
    if (getHealth() == 0 || getHunger() == 0) {
      setDead(true);
      return false;
    }

    return true;
  }

  public void ageOneYear() {
    while(checkIsAlive()) {

    }
    // contar ate 365 dias. se der 365 dias, conta como 1 ano de vida

  }

}

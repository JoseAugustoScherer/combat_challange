package entities;

public class Champion {
   
    private String name;
    private int life;
    private int atack;
    private int armor;
    
    public void takeDamage ( Champion champion ) {
      int damage = champion.getAtack() - this.armor;
      if ( this.life > 0 ) {
        this.life -= damage;
      }
    }

    public String status () {
       if ( this.life > 0) {
        return toString();
       } else {
        return toString() + " (dead)";
       }
    }

    public Champion(String name, int life, int atack, int armor) {
        this.name = name;
        this.life = life;
        this.atack = atack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString() {
        return name + ": " + life + " health";
    }

}

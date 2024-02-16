package hw23;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class Archer extends GameCharacter {

    public Archer(int health) {
        super(health);
    }

    @Override
    protected void attack() {
        System.out.println("Archer attack with " + health);
    }
}

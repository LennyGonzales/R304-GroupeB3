package fr.univamu.iut;

import fr.univamu.iut.attributs.Distance;
import fr.univamu.iut.attributs.Fly;

public class Mage extends Character implements Distance, Fly {

    public Mage(String name) {
        super(name);
        setDamage(10);
        setDefence(7);
    }

    @Override
    public void increaseStats() {
        setDamage((int) (getDamage() * 1.2));
        setDefence((int) (getDefence() * 1.2));
    }

    @Override
    public String fly() {
        return "Fly over the area !";
    }

    @Override
    public String distance() {
        return "Ranged attack !";
    }

    @Override
    public void specialAttack(Character pEnemy) throws InterruptedException {
        pEnemy.setLife(getLife() - getDamage());

        for (int i = 0; i < 5; ++i) {   // Make a passive attack for 5 seconds
            System.out.println(getName() + " -> " + pEnemy.getName() + " (1 damage) !");
            pEnemy.setLife(pEnemy.getLife() - 1);
            Thread.sleep(1);
        }
    }

    @Override
    public String toString() {
        return  "Mage" + '\n' +
                super.toString() + '\n' +
                "Skills : " + fly() + " | " + distance() + '\n';
    }
}

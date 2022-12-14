package fr.univamu.iut.game.characters;

import fr.univamu.iut.exceptions.RandomValueNotBetween0And1Exception;
import fr.univamu.iut.game.characters.charactersTypes.Mage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for the Mage class
 * @author LennyGonzales
 */
public class MageTest {
    @Test
    public void shouldCriticalAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Mage cPlayer = new Mage("Lenny");
        Mage ePlayer = new Mage("Enemy");

        cPlayer.attack(ePlayer, 0.02);
        assertEquals(ePlayer.getLife(), 77);
    }

    @Test
    public void shouldSpecialAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Mage cPlayer = new Mage("Lenny");
        Mage ePlayer = new Mage("Enemy");

        cPlayer.attack(ePlayer, 0.12);
        assertEquals(ePlayer.getLife(), 92);
    }

    @Test
    public void shouldBasicAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Mage cPlayer = new Mage("Lenny");
        Mage ePlayer = new Mage("Enemy");

        cPlayer.attack(ePlayer, 0.5);
        assertEquals(ePlayer.getLife(), 97);
    }
    @Test
    public void shouldGetName() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getName(), "Lenny");
    }

    @Test
    public void shouldGetXp() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getXp(), 0);
    }

    @Test
    public void shouldGetLevel() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getLevel(), 1);
    }

    @Test
    public void shouldGetXpNecessary() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getXpNecessary(), 10);
    }

    @Test
    public void shouldGetDamage() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDamage(), 10);
    }

    @Test
    public void shouldGetDamageWithEquipments() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDamageWithEquipments(), 10);
    }

    @Test
    public void shouldGetDefenceWithEquipments() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDefenceWithEquipments(), 7);
    }

    @Test
    public void shouldGetDefence() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDefence(), 7);
    }


    @Test
    public void shouldGetLife() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getLife(), 100);
    }

    @Test
    public void shouldGetDamageInFight() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDamageInFight(), 0);
    }

    @Test
    public void shouldGetDamageEquipments() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDamageEquipments(), 0);
    }

    @Test
    public void shouldGetDefenceEquipments() {
        Mage p = new Mage("Lenny");
        assertEquals(p.getDefenceEquipments(), 0);
    }

    @Test
    public void shouldSetName() {
        Mage p = new Mage("Lenny");
        p.setName("otherName");
        assertEquals(p.getName(), "otherName");
    }

    @Test
    public void shouldSetXp() {
        Mage p = new Mage("Lenny");
        p.setXp(1);
        assertEquals(p.getXp(), 1);
    }

    @Test
    public void shouldSetLevel() {
        Mage p = new Mage("Lenny");
        p.setLevel(2);
        assertEquals(p.getLevel(), 2);
    }

    @Test
    public void shouldSetXpNecessary() {
        Mage p = new Mage("Lenny");
        p.setXpNecessary(100);
        assertEquals(p.getXpNecessary(), 100);
    }

    @Test
    public void shouldSetDamage() {
        Mage p = new Mage("Lenny");
        p.setDamage(100);
        assertEquals(p.getDamage(), 100);
    }

    @Test
    public void shouldSetDefence() {
        Mage p = new Mage("Lenny");
        p.setDefence(100);
        assertEquals(p.getDefence(), 100);
    }

    @Test
    public void shouldSetLife() {
        Mage p = new Mage("Lenny");
        p.setLife(200);
        assertEquals(p.getLife(), 200);
    }

    @Test
    public void shouldSetDamageInFight() {
        Mage p = new Mage("Lenny");
        p.setDamageInFight(200);
        assertEquals(p.getDamageInFight(), 200);
    }

    @Test
    public void shouldSetDamageWithEquipments() {
        Mage p = new Mage("Lenny");
        p.setDamageEquipments(10);
        assertEquals(p.getDamageWithEquipments(), 20);
    }

    @Test
    public void shouldSetDefenceWithEquipments() {
        Mage p = new Mage("Lenny");
        p.setDefenceEquipments(10);
        assertEquals(p.getDefenceWithEquipments(), 17);
    }

    @Test
    public void shouldSetDamageEquipments() {
        Mage p = new Mage("Lenny");
        p.setDamageEquipments(10);
        assertEquals(p.getDamageEquipments(), 10);
    }

    @Test
    public void shouldSetDefenceEquipments() {
        Mage p = new Mage("Lenny");
        p.setDefenceEquipments(10);
        assertEquals(p.getDefenceEquipments(), 10);
    }

    @Test
    public void shouldThrowRandomValueNotBetween0And1Exception() {
        Mage magePlayer = new Mage("Lenny");
        Mage mageEnemy = new Mage("Enemy");
        assertThrows(RandomValueNotBetween0And1Exception.class, () -> magePlayer.attack(mageEnemy, -1));
        assertThrows(RandomValueNotBetween0And1Exception.class, () -> magePlayer.attack(mageEnemy, 2));
    }
}

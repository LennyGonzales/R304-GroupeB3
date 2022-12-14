package fr.univamu.iut.game.characters;

import fr.univamu.iut.exceptions.RandomValueNotBetween0And1Exception;
import fr.univamu.iut.game.characters.charactersTypes.Healer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for the Healer class
 * @author LennyGonzales
 */
public class HealerTest {
    @Test
    public void shouldCriticalAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Healer cPlayer = new Healer("Lenny");
        Healer ePlayer = new Healer("Enemy");

        cPlayer.attack(ePlayer, 0.02);
        assertEquals(ePlayer.getLife(), 78);
    }

    @Test
    public void shouldSpecialAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Healer cPlayer = new Healer("Lenny");
        Healer ePlayer = new Healer("Enemy");

        cPlayer.attack(ePlayer, 0.12);
        assertEquals(ePlayer.getLife(), 100);
    }

    @Test
    public void shouldBasicAttack() throws InterruptedException, RandomValueNotBetween0And1Exception {
        Healer cPlayer = new Healer("Lenny");
        Healer ePlayer = new Healer("Enemy");

        cPlayer.attack(ePlayer, 0.5);
        assertEquals(ePlayer.getLife(), 94);
    }

    @Test
    public void shouldGetName() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getName(), "Lenny");
    }

    @Test
    public void shouldGetXp() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getXp(), 0);
    }

    @Test
    public void shouldGetLevel() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getLevel(), 1);
    }

    @Test
    public void shouldGetXpNecessary() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getXpNecessary(), 10);
    }

    @Test
    public void shouldGetDamage() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDamage(), 8);
    }

    @Test
    public void shouldGetDefence() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDefence(), 2);
    }

    @Test
    public void shouldGetLife() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getLife(), 100);
    }

    @Test
    public void shouldGetHeal() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getHeal(), 20);
    }

    @Test
    public void shouldGetDamageEquipments() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDamageEquipments(), 0);
    }

    @Test
    public void shouldGetDefenceEquipments() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDefenceEquipments(), 0);
    }

    @Test
    public void shouldGetDamageInFight() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDamageInFight(), 0);
    }

    @Test
    public void shouldGetDamageWithEquipments() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDamageWithEquipments(), 8);
    }

    @Test
    public void shouldGetDefenceWithEquipments() {
        Healer p = new Healer("Lenny");
        assertEquals(p.getDefenceWithEquipments(), 2);
    }

    @Test
    public void shouldSetName() {
        Healer p = new Healer("Lenny");
        p.setName("otherName");
        assertEquals(p.getName(), "otherName");
    }

    @Test
    public void shouldSetXp() {
        Healer p = new Healer("Lenny");
        p.setXp(1);
        assertEquals(p.getXp(), 1);
    }

    @Test
    public void shouldSetLevel() {
        Healer p = new Healer("Lenny");
        p.setLevel(2);
        assertEquals(p.getLevel(), 2);
    }

    @Test
    public void shouldSetXpNecessary() {
        Healer p = new Healer("Lenny");
        p.setXpNecessary(100);
        assertEquals(p.getXpNecessary(), 100);
    }

    @Test
    public void shouldSetDamage() {
        Healer p = new Healer("Lenny");
        p.setDamage(100);
        assertEquals(p.getDamage(), 100);
    }

    @Test
    public void shouldSetDefence() {
        Healer p = new Healer("Lenny");
        p.setDefence(100);
        assertEquals(p.getDefence(), 100);
    }

    @Test
    public void shouldSetLife() {
        Healer p = new Healer("Lenny");
        p.setLife(200);
        assertEquals(p.getLife(), 200);
    }

    @Test
    public void shouldSetHeal() {
        Healer p = new Healer("Lenny");
        p.setHeal(100);
        assertEquals(p.getHeal(), 100);
    }

    @Test
    public void shouldSetDamageInFight() {
        Healer p = new Healer("Lenny");
        p.setDamageInFight(200);
        assertEquals(p.getDamageInFight(), 200);
    }

    @Test
    public void shouldSetDamageWithEquipments() {
        Healer p = new Healer("Lenny");
        p.setDamageEquipments(10);
        assertEquals(p.getDamageWithEquipments(), 18);
    }

    @Test
    public void shouldSetDefenceWithEquipments() {
        Healer p = new Healer("Lenny");
        p.setDefenceEquipments(10);
        assertEquals(p.getDefenceWithEquipments(), 12);
    }

    @Test
    public void shouldSetDamageEquipments() {
        Healer p = new Healer("Lenny");
        p.setDamageEquipments(10);
        assertEquals(p.getDamageEquipments(), 10);
    }

    @Test
    public void shouldSetDefenceEquipments() {
        Healer p = new Healer("Lenny");
        p.setDefenceEquipments(10);
        assertEquals(p.getDefenceEquipments(), 10);
    }

    @Test
    public void shouldThrowRandomValueNotBetween0And1Exception() {
        Healer healerPlayer = new Healer("Lenny");
        Healer healerEnemy = new Healer("Enemy");
        assertThrows(RandomValueNotBetween0And1Exception.class, () -> healerPlayer.attack(healerEnemy, -1));
        assertThrows(RandomValueNotBetween0And1Exception.class, () -> healerPlayer.attack(healerEnemy, 2));
    }
}

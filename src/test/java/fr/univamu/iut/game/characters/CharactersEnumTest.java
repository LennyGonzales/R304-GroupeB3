package fr.univamu.iut.game.characters;

import fr.univamu.iut.game.characters.charactersTypes.CharactersEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Market enumerator
 * @author LennyGonzales
 */
public class CharactersEnumTest {
    @Test
    public void shouldGetArcherPrice() {
        assertEquals(CharactersEnum.ARCHER.getPrice(), 200);
    }

    @Test
    public void shouldGetHealerPrice() {
        assertEquals(CharactersEnum.HEALER.getPrice(), 100);
    }

    @Test
    public void shouldGetMagePrice() {
        assertEquals(CharactersEnum.MAGE.getPrice(), 75);
    }
}

package fr.univamu.iut.game;

import fr.univamu.iut.exceptions.EmptyNameForPlayerTeamException;
import fr.univamu.iut.game.characters.Archer;
import fr.univamu.iut.game.characters.CharactersTeam;
import fr.univamu.iut.game.characters.Mage;
import fr.univamu.iut.game.characters.Character;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the characters team class
 */
public class CharactersTeamTest {
    @Test
    public void shouldGetName() throws EmptyNameForPlayerTeamException {
        CharactersTeam team = new CharactersTeam("LennyTeam");
        assertEquals(team.getName(), "LennyTeam");
    }

    @Test
    public void shouldSetName() throws EmptyNameForPlayerTeamException {
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.setName("OtherName");
        assertEquals(team.getName(), "OtherName");
    }

    @Test
    public void shouldGetGold() throws EmptyNameForPlayerTeamException {
        CharactersTeam team = new CharactersTeam("LennyTeam");
        assertEquals(team.getGold(), 0);
    }

    @Test
    public void shouldSetGold() throws EmptyNameForPlayerTeamException {
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.setGold(100);
        assertEquals(team.getGold(), 100);
    }

    @Test
    public void shouldGetSpecificCharacter() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(p);
        assertEquals(team.getSpecificCharacter(0), p);
    }

    @Test
    public void shouldAddACharacter() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(p);
        assertEquals(team.getSpecificCharacter(0), p);
    }

    @Test
    public void shouldGetSize() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(p);
        assertEquals(team.getSize(), 1);
    }

    @Test
    public void shouldDelCharacter() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(p);
        team.delCharacter(p);
        assertEquals(team.getSize(), 0);
    }

    @Test
    public void shouldGetCharacters() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        List<Character> listCharacters = new ArrayList<>();
        listCharacters.add(p);

        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(p);
        assertEquals(team.getCharacters(), listCharacters);
    }

    @Test
    public void shouldSetCharacters() throws EmptyNameForPlayerTeamException {
        Mage p = new Mage("Lenny");
        List<Character> listCharacters = new ArrayList<>();
        listCharacters.add(p);

        CharactersTeam team = new CharactersTeam("LennyTeam");
        team.addCharacter(new Archer("archer"));
        team.setCharacters(listCharacters);

        assertEquals(team.getCharacters(), listCharacters);
    }
}
package rpgtdd;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;


public class CharacterTest {
    @Test
    public void testHit(){
        Character character = new Character(10, "Bob");
        character.hit(5);
        assertTrue(character.isAlive());
        
    }
    @Test
    public void testHitWithDeath() {
        Character character = new Character(10, "Patrick");
        character.hit(10);
        assertFalse(character.isAlive());
    }
    @Test
    public void testTwoHit() {
        Character character = new Character(10, "Jean");
        character.hit(5);
        character.hit(4);
        assertTrue(character.isAlive());
    }
    @Test
    public void testTwoHitWithDeath() {
        Character character = new Character(10, "Paul");
        character.hit(5);
        character.hit(7);
        assertFalse(character.isAlive());
    }
}

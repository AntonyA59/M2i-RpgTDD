package rpgtdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CharacterTest {
    @Test
    public void testHit(){
        Character character = new Character(10);
        character.hit(5);
        assertTrue(character.isAlive());
        
    }
    @Test
    public void testHitWithDeath() {
        Character character = new Character(10);
        character.hit(10);
        assertFalse(character.isAlive());
    }
    @Test
    public void testTwoHit() {
        Character character = new Character(10);
        character.hit(5);
        character.hit(4);
        assertTrue(character.isAlive());
    }
    @Test
    public void testTwoHitWithDeath() {
        Character character = new Character(10);
        character.hit(5);
        character.hit(7);
        assertFalse(character.isAlive());
    }
}

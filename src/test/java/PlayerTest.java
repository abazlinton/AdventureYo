import beings.Dwarf;
import beings.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    @Test
    public void has_health(){
        Player dwarf = new Dwarf();
        assertEquals(100, dwarf.getHealth(), 0.01);
    }

    @Test
    public void has_attacking_damage(){
        Player dwarf = new Dwarf();
        assertEquals(10, dwarf.getAttackingDamage(), 0.01);

    }






}

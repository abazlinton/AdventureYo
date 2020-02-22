import beings.Dwarf;
import beings.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    @Test
    public void is_tough__takes_less_damage(){
        Player dwarf = new Dwarf();
        dwarf.takeDamage(100);
        assertEquals(50, dwarf.getHealth(), 0.01);
    }



}

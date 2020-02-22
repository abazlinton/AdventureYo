import beings.Dwarf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


    @Test
    public void has_health(){
        Dwarf dwarf = new Dwarf();
        assertEquals(100, dwarf.getHealth(), 0.01);
    }




}

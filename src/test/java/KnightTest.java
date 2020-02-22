import beings.Knight;
import beings.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    @Test
    public void is_strong__does_more_damage(){
        Player knight = new Knight();
        double attackingDamage = knight.getAttackingDamage();
        assertEquals(20, attackingDamage, 0.01);
    }

}

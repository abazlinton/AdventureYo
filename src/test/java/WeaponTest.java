import items.Sword;
import items.Weapon;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class WeaponTest {

    @Test
    public void can_get_damage_to_inflict(){
        Weapon sword = new Sword();
        assertEquals(10, sword.getDamageInflicted(), 0.01);
    }

}

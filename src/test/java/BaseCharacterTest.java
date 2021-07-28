import characters.BaseCharacter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//public class BaseCharacterTest {
//
//    BaseCharacter baseCharacter;
//    BaseCharacter baseCharacter2;
//
//    @Before
//    public void before(){
//        baseCharacter = new BaseCharacter("Hero", 10, 5, 2);
//        baseCharacter2 = new BaseCharacter("Enemy", 10, 5, 2);
//    }

//    @Test
//    public void hasName(){
//        assertEquals("Hero", baseCharacter.getName());
//    }
//
//    @Test
//    public void hasHP(){
//        assertEquals(10, baseCharacter.getHP());
//    }
//
//    @Test
//    public void hasBaseAttack(){
//        assertEquals(5, baseCharacter.getBaseAttack());
//    }
//
//    @Test
//    public void hasBaseResistance(){
//        assertEquals(2, baseCharacter.getBaseResistance());
//    }
//
//    @Test
//    public void hasTakeDamage(){
//        baseCharacter.receiveDamage(4);
//        assertEquals(8, baseCharacter.getHP());
//    }
//
//    @Test
//    public void canAttack(){
//        baseCharacter.attack(baseCharacter2);
//        assertEquals(7, baseCharacter2.getHP());
//    }
//
//    @Test
//    public void startsWithNoGold(){
//        assertEquals(0, baseCharacter2.getGold());
//    }
//
//    @Test
//    public void canAddGold(){
//        baseCharacter.addGold(8);
//        assertEquals(8, baseCharacter.getGold());
//    }
//}

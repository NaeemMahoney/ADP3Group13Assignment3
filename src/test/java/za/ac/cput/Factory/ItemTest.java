package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Test for Item Entity

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Item;
import za.ac.cput.Factory.ItemFactory;

class ItemTest {
    String itemNumber, prescriptionNumber;
    Item item1 = ItemFactory.build(itemNumber, prescriptionNumber,"Panado",
            90, "Pills");
    Item item2 = ItemFactory.build(itemNumber, prescriptionNumber,"",
            0, "");

//Objects Not Null

//This test will pass because values are provided
@Test
void testItemNotNull1(){
    System.out.println(item1);
    assertNotNull(item1);
}

//This test will fail because values are null
@Test
void testItemNotNull2(){
    System.out.println(item2);
    assertNotNull(item2);
    }

//Object Equality

//This test will pass as item1 and item1 are equal
@Test
void testItemEquality1(){
  assertEquals(item1, item1);
}

//This test will fail as item1 and item2 not are equal
@Test
void testItemEquality2(){
    assertEquals(item1, item2);
}

//Testing if items are not equal
@Test
void TestItemEquality3(){
    assertNotEquals(item1, item2);
}

//Object Identity

//This Test will pass as item1 and item1 are the same
@Test
void testItemIdentity1(){
   assertSame(item1, item1);
}

//This test will fail as item 1 and item2 are not the same
@Test
void testItemIdentity2(){
    assertSame(item1,item2);
}

//Testing if items are not the same
@Test
void testItemIdentity3(){
    assertNotSame(item1, item2);
}
//Timout
@Test
@Timeout(1000)
void testTimout() throws InterruptedException{
Thread.sleep(500);
assertSame(item2, item1);
}

//Disabling
@Disabled
@Test
void testDisable(){
    assertSame(item1, item2);
}
}
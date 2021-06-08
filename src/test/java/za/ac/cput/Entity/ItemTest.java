package za.ac.cput.Entity;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Test for Item Entity

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.ItemFactory;

class ItemTest {
    String itemNumber, prescriptionNumber;

//This test will pass because values are provided
@Test
void test(){
    Item item = ItemFactory.build(itemNumber, prescriptionNumber,"Panado",
            90, "Pills");
    System.out.println(item);
    assertNotNull(item);
}

//This test will fail because values are null
@Test
void test2(){
    Item item2 = ItemFactory.build(itemNumber, prescriptionNumber,"",
            0, "");
    System.out.println(item2);
    assertNotNull(item2);
    }
}
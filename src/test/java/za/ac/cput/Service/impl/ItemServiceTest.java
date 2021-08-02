package za.ac.cput.Service.impl;
//Na'eem Mahoney
//218190751
//ADP3
//TestService Class for Item Entity

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Item;
import za.ac.cput.Factory.ItemFactory;
import za.ac.cput.Repository.impl.ItemRepository;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class ItemServiceTest {
    private static ItemService itemService = ItemService.getItemService();
    private static Item item = ItemFactory.build("ITM43", "PRM09", "Panado", 80, "Pills");


    //This test creates a new item
    @Test
    void a_createItem(){
        Item itemcreated = itemService.create(item);
        assertEquals(itemcreated.getItemNumber(), item.getItemNumber());
        System.out.println("Create Item: "+ itemcreated);
    }

    //This test reads the created item
    @Test
    void b_readItem(){
        Item itemread = itemService.read(item.getItemNumber());
        assertEquals(itemread.getItemNumber(), item.getItemNumber());
        System.out.println("Read Item: "+ itemread);
    }

    //This test updates the item
    @Test
    void c_itemUpdate(){
        Item itemupdate = new Item.Builder().copy(item).itemNumber("ITM22").prescriptionNumber("PRM34").itemName("Gavascon").itemPrice(90).itemType("Medicine").builder();
        assertNull(itemService.update(itemupdate));
        System.out.println("Item Updated: "+ itemupdate);
    }

    //This test deletes the item
    @Test
    void d_itemDelete(){
        boolean deleted = itemService.delete(item.getItemNumber());
        assertTrue(deleted);
        System.out.println("Item Deleted: "+ deleted);
    }
}
package za.ac.cput.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Test Class for Item Repository

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Item;
import za.ac.cput.Factory.ItemFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class ItemRepositoryTest {
    private static String itemNumber, prescriptionNumber;
    private static ItemRepository repository = ItemRepository.getRepository();
    private static Item item = ItemFactory.build("ITM22", "PRM34", "Gavascon", 100, "Medicine");

    //This test creates a new item
    @Test
    void a_createItem(){
        Item itemcreated = repository.create(item);
        assertEquals(itemcreated.getItemNumber(), item.getItemNumber());
        System.out.println("Create Item: "+ itemcreated);
    }

    //This test reads the created item
    @Test
    void b_readItem(){
        Item itemread = repository.read(item.getItemNumber());
        assertEquals(itemread.getItemNumber(), item.getItemNumber());
        System.out.println("Read Item: "+ itemread);
    }

    //This test updates the item
    @Test
    void c_itemUpdate(){
        Item itemupdate = new Item.Builder().copy(item).itemNumber("ITM22").prescriptionNumber("PRM34").itemName("Gavascon").itemPrice(90).itemType("Medicine").builder();
        assertNull(repository.update(itemupdate));
        System.out.println("Item Updated: "+ itemupdate);
    }

    //This test deletes the item
    @Test
    void d_itemDelete(){
        boolean deleted = repository.delete(item.getItemNumber());
        assertTrue(deleted);
        System.out.println("Item Deleted: "+ deleted);
    }

    //This test displays all Items
    @Test
    void e_itemGetAll(){
        System.out.println("Show All Items: ");
        System.out.println(repository.getAll());
    }
}
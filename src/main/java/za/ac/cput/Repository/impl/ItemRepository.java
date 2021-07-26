package za.ac.cput.Repository.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Repository Class for Item Entity

import za.ac.cput.Entity.Item;
import za.ac.cput.Repository.IRepository;

import java.util.Set;
import java.util.HashSet;

public class ItemRepository implements IRepository<Item, String> {
    private static ItemRepository repository = null;
    private Set <Item> itemDB = null;

    private ItemRepository(){
        itemDB = new HashSet<Item>();
    }

    public static ItemRepository getRepository() {
        if (repository == null)
        {
            repository = new ItemRepository();
        }
        return repository;
    }

    //Create a new Item
    @Override
    public Item create(Item item){
        boolean itemcreated = itemDB.add(item);
        if(!itemcreated) {
            return null;
        }
        return item;
    }

    //Read Item
    @Override
    public Item read(String itemNumber){
        for (Item i : itemDB)
            if(i.getItemNumber().equals(itemNumber))
            {
                return i;
            }
        return null;
    }

    //Update Item
    @Override
    public Item update(Item item){
        Item originalItem = read(item.getItemNumber());
        if(originalItem != null){
            itemDB.remove(originalItem);
            itemDB.add(item);
            return item;
        }
        return null;
    }

    //Delete Item
    @Override
    public boolean delete(String itemNumber){
        Item removeItem = read(itemNumber);
        if (removeItem == null){
            return false;
        }
        itemDB.remove(removeItem);
        return true;
    }

    //Display All Items
    public Set<Item> getAll(){
        return itemDB;
    }
}

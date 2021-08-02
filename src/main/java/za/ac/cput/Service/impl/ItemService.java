package za.ac.cput.Service.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Service Class for Item Entity

import za.ac.cput.Entity.Item;
import za.ac.cput.Repository.impl.ItemRepository;
import za.ac.cput.Service.iService;


public class ItemService implements iItemService{
    private static ItemService itemService = null;
    private ItemRepository itemRepository = null;

    private ItemService(){
        this.itemRepository = ItemRepository.getRepository();
    }

    public static ItemService getItemService(){
        if(itemService == null) {
            itemService = new ItemService();
        }
        return itemService;
    }

    @Override
    public Item create(Item item){
        return this.itemRepository.create(item);
    }

    @Override
    public Item read(String itemNumber){
        return this.itemRepository.read(itemNumber);
    }

    @Override
    public Item update(Item item){
        return this.itemRepository.update(item);
    }

    @Override
    public boolean delete(String itemNumber){
        return this.itemRepository.delete(itemNumber);
    }
}

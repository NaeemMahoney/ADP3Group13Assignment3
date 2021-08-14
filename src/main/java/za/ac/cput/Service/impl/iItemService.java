package za.ac.cput.Service.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Service Class that extends iService for Item Entity

import za.ac.cput.Entity.Item;
import za.ac.cput.Service.iService;
import java.util.Set;

public interface iItemService extends iService<Item, String>{
    public Set<Item> getAll();
}

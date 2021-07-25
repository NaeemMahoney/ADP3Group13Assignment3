package za.ac.cput.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//IRepository Class for Item Entity

import za.ac.cput.Entity.Item;
import za.ac.cput.Repository.IRepository;
import java.util.Set;

public interface IItemRepository extends IRepository<Item, String> {
    public Set<Item> getAll();
}

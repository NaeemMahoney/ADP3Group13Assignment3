package za.ac.cput.Repository.impl;
//Na'eem Mahoney
//218190751
//ADP3
//IRepository Class for PrescriptionItem Entity

import za.ac.cput.Entity.PrescriptionItem;
import za.ac.cput.Repository.IRepository;
import java.util.Set;

public interface IPrescriptionItemRepository extends IRepository<PrescriptionItem, String> {
    public Set<PrescriptionItem> getAll();
}

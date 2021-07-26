package za.ac.cput.Repository.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Test Class for PrescriptionItem Repository

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.PrescriptionItem;
import za.ac.cput.Factory.PrescriptionItemFactory;
import za.ac.cput.Repository.impl.PrescriptionItemRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class PrescriptionItemRepositoryTest {
    private static PrescriptionItemRepository repository = PrescriptionItemRepository.getRepository();
    private static PrescriptionItem prescriptionitem = PrescriptionItemFactory.build("PRM45", "ITM33");

    //This test creates a new Prescriptionitem
    @Test
    void a_createPrescriptionItem(){
        PrescriptionItem prescriptionitemcreated = repository.create(prescriptionitem);
        assertEquals(prescriptionitemcreated.getPrescriptionNumber(), prescriptionitem.getPrescriptionNumber());
        System.out.println("Create PrescriptionItem: "+ prescriptionitemcreated);
    }

    //This test reads the created PrescriptionItem
    @Test
    void b_readPrescriptionItem(){
        PrescriptionItem prescriptionitemread = repository.read(prescriptionitem.getPrescriptionNumber());
        assertEquals(prescriptionitemread.getPrescriptionNumber(), prescriptionitem.getPrescriptionNumber());
        System.out.println("Read Prescription Item: "+ prescriptionitemread);
    }

    //This test updates the Prescriptionitem
    @Test
    void c_PrescriptionItemUpdate(){
        PrescriptionItem prescriptionitemupdate = new PrescriptionItem.Builder().copy(prescriptionitem).setPrescriptionNumber("PRM80").setItemNumber("ITM40").builder();
        assertNull(repository.update(prescriptionitemupdate));
        System.out.println("PrescriptionItem Updated: "+ prescriptionitemupdate);
    }

    //This test deletes the Prescriptionitem
    @Test
    void d_PrescriptionItemDelete(){
        boolean deleted = repository.delete(prescriptionitem.getPrescriptionNumber());
        assertTrue(deleted);
        System.out.println("PrescriptionItem Deleted: "+ deleted);
    }
}
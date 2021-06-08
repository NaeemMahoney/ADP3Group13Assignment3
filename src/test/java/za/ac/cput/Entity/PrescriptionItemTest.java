package za.ac.cput.Entity;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for PrescriptionItem Entity

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.PrescriptionItemFactory;

class PrescriptionItemTest {
    String prescriptionNumber, itemNumber;

    //Testing if values are not null
    @Test
    void test(){
        PrescriptionItem prescriptionItem = PrescriptionItemFactory.build(prescriptionNumber, itemNumber);
        System.out.println(prescriptionItem);
        assertNotNull(prescriptionItem);
    }

}
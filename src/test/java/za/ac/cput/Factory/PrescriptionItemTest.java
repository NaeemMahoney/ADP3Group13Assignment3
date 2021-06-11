package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for PrescriptionItem Entity

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.PrescriptionItem;
import za.ac.cput.Factory.PrescriptionItemFactory;

class PrescriptionItemTest {
    String prescriptionNumber, itemNumber;
    PrescriptionItem prescriptionItem1 = PrescriptionItemFactory.build(prescriptionNumber, itemNumber);
    PrescriptionItem prescriptionItem2 = PrescriptionItemFactory.build(prescriptionNumber, itemNumber);
    PrescriptionItem prescriptionItem3 = prescriptionItem1;
    //Object Not Null

    //Testing if values are not null
    @Test
    void testNotNull(){
        PrescriptionItem prescriptionItem = PrescriptionItemFactory.build(prescriptionNumber, itemNumber);
        System.out.println(prescriptionItem);
        assertNotNull(prescriptionItem);
    }

    //ObjectEquality

    //This test will pass as prescriptionitem1 and precriptionitem3 are equal
    @Test
    void testEquality1(){
        assertEquals(prescriptionItem1,prescriptionItem3);
    }

    //This test will fail as prescriptionitem1 and precriptionitem2  not are equal
    @Test
    void testEquality2(){
        assertEquals(prescriptionItem1,prescriptionItem2);
    }

    //Testing if objects are not equal
    @Test
    void testEquality3(){
        assertNotEquals(prescriptionItem1, prescriptionItem2);
    }

    //Object Identity

    //This test will pass as prescriptionItem1 and prescriptionItem3 are the same
    @Test
    void testIdentity1(){
        assertSame(prescriptionItem1, prescriptionItem3);
    }

    //This test will fail as prescriptionItem1 and prescriptionItem2 are not the same
    @Test
    void testIdentity2(){
        assertSame(prescriptionItem1, prescriptionItem2);
    }

    //Testing if precriptionitems are not the same
    @Test
    void testIdentity3(){
        assertNotSame(prescriptionItem1, prescriptionItem2);
    }

    //Timeout
    @Test
    @Timeout(500)
    void testTimout() throws InterruptedException{
        Thread.sleep(1000);
        assertSame(prescriptionItem1, prescriptionItem2);
    }

    //Disable
    @Disabled
    @Test
    void testDisable(){
        assertSame(prescriptionItem1, prescriptionItem2);
    }
}
package za.ac.cput.Factory;
/* PrescriptionFactoryTest.java
 This is the Prescription Test class
 Author: Ratidzai Makondo - (218187289)
 Date: 11 June 2021
 */


import za.ac.cput.Factory.PrescriptionFactory;
import za.ac.cput.Entity.Prescription;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

class PrescriptionFactoryTest {
    private PrescriptionFactory PRO1;
    private PrescriptionFactory PR02;
    private PrescriptionFactory PR04;

    @BeforeEach
    void setUp() {
        PRO1 = new PrescriptionFactory();
        PR02 = new PrescriptionFactory();
        PRO1 = PR04;
    }

    @Test
    void testIdentity() {

        assertEquals(PRO1, PR04);
        System.out.println("The following test is for object Identity");
    }

    @Test
    void testEquality() {
        assertEquals(PRO1, PRO1);
        System.out.println("These objects are equal");
    }

    @Test
    void testTimeout() {
        System.out.println("The following test has a timeout");
        new PrescriptionFactory();

    }

    @Test
    @Disabled
    void testDisabled() {
        System.out.println("The following test has been disabled");
        assertNotEquals(PR02, PR04);
    }

    @Test
    public void createPrescription() {
        Prescription prescription = PrescriptionFactory.createPrescription("PN01", "D230", 100.00, 5);
         System.out.println(prescription);
    }


    }










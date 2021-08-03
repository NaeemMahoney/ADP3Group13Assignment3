package za.ac.cput.Repository.impl;

/* PrescriptionRepository.java
 This is the Prescription Test class
 Author: Ratidzai Makondo - (218187289)
 Date: 26 July 2021
 */


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Prescription;
import za.ac.cput.Factory.PrescriptionFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class PrescriptionRepositoryTest {
    private static PrescriptionRepository repository = PrescriptionRepository.getRepository();
    private static Prescription prescription = PrescriptionFactory.createPrescription("PNO2","D230",15,6);


    @Test
    void create() {
        Prescription create = repository.create(prescription);
        assertEquals(create.getPrescriptionNumber(), prescription.getPrescriptionNumber());
        System.out.println("This was created" + " " + create);
    }
    @Test
    void read() {
        Prescription read = repository.read(prescription.getPrescriptionNumber());
        assertNull(read);
        System.out.println("The following has been read" + " " + prescription.getPrescriptionNumber() + " ");

    }

    @Test
    void update() {
        Prescription updated = new Prescription.Builder().copy(prescription).setPrescriptionNumber("PN300").setPatientNumber("PN12").setDoctorNumber("D231").setBill(1.25).setDosage(1).build();
      assertNotNull(repository.update(updated));
        System.out.println("Final update" +" "+ updated );

    }
    @Test
    void delete() {
        boolean complete = repository.delete(prescription.getPrescriptionNumber());
        assertTrue(complete);
        System.out.println("The following has been deleted" + " " + complete);

    }
     @Test
    void getAll() {
         System.out.println("display all contents");
         System.out.println(repository.getAll());
     }
}
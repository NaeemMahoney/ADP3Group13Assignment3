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
    private static Prescription prescription = PrescriptionFactory.createPrescription("PNO1","D230",100.00,5);

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
        System.out.println("The following was read" + " " + read);

    }
    @Test
    void update() {
        Prescription updated = new Prescription.Builder().copy(prescription).setPatientNumber("PN02").setDoctorNumber("D231").setBill(120.00).setDosage(15).build();
       assertNull(repository.update(updated));
        System.out.println("Final update" + updated );

    }
    @Test
    void delete() {
        boolean victory = repository.delete(prescription.getPrescriptionNumber());
        assertFalse(victory);
        System.out.println("This was deleted" + victory);

    }
     @Test
    void getAll() {
         System.out.println("display all contents");
         System.out.println(repository.getAll());
     }




}
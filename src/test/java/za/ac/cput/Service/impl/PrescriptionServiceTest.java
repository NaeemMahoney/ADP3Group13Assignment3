package za.ac.cput.Service.impl;
/* PrescriptionServiceTest.java
 This is the PrescriptionService Test class
 Author: Ratidzai Makondo - (218187289)
 Date: 2 August 2021

 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Prescription;
import za.ac.cput.Factory.PrescriptionFactory;



import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PrescriptionServiceTest {
    private static PrescriptionService service = PrescriptionService.getService();
    private static Prescription prescription = PrescriptionFactory.createPrescription("PN124","DN200",10,17);

    @Test
    void create() {
     Prescription createde = service.create(prescription) ;
     assertEquals(prescription.getPrescriptionNumber(), createde.getPrescriptionNumber());
        System.out.println("these have been created" + " " + createde);
    }

    @Test
    void read() {

       Prescription read = service.read(prescription.getPrescriptionNumber());
       assertNull(read);
        System.out.println("The following has been read" + " " + prescription.getPrescriptionNumber() + " ");
    }

    @Test
    void update() {
        Prescription updated = new Prescription.Builder().copy(prescription).setPrescriptionNumber("PN310").setPatientNumber("PN145").setDoctorNumber("DN121").setBill(1.25).setDosage(4).build();
        System.out.println("Final update" +" "+ updated );
    }

    @Test
    void delete() {
      service.delete(prescription.getPrescriptionNumber());
      System.out.println("the following is deleted" + " " + prescription.getPrescriptionNumber() + " ");
    }

   @Test
    void getAll() {
        System.out.println("Showing All stuff");
        System.out.println(service.getAll());
    }
}
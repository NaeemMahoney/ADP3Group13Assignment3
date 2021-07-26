package za.ac.cput.Repository.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Factory.PatientFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PatientRepositoryTest {
    String firstName, lastName, contactNumber;
    private Patient patient;
    private static PatientRepository patientRepository = new PatientRepository();
    @BeforeEach
    void valuesEntryTest(){
        firstName = JOptionPane.showInputDialog("Enter Name"," ");
        lastName = JOptionPane.showInputDialog("Enter Last Name"," ");
        contactNumber = JOptionPane.showInputDialog("Enter Contact Number"," ");
        patient = PatientFactory.build(firstName, lastName,contactNumber);
    }
    @Test
    void create() {
        Patient create = patientRepository.create(patient);
        assertEquals(patient.getPatientNumber(),create.getPatientNumber());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        Patient read = patientRepository.read(patient.getPatientNumber());
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Patient update = new Patient.Builder().copy(patient).setLastName("Manisi").build();
        System.out.println("Updated: " + update);
    }

    @Test
    void delete() {
        patientRepository.delete(patient.getPatientNumber());
        System.out.println("Deleted: "+ patient.getPatientNumber());
    }
}
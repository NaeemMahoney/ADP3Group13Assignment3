package za.ac.cput.Repository.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Entity.PatientAddress;
import za.ac.cput.Factory.PatientAddressFactory;
import za.ac.cput.Factory.PatientFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PatientAddressRepositoryTest {
    String addressNumber, patientNumber;
    private PatientAddress patientAddress;
    private static PatientAddressRepository patientAddressRepository = new PatientAddressRepository();
    @BeforeEach
    void valuesEntryTest(){
        patientNumber = JOptionPane.showInputDialog("Enter PatientNumber"," ");
        addressNumber = JOptionPane.showInputDialog("Enter AddressNumber"," ");
        patientAddress= PatientAddressFactory.build(patientNumber,addressNumber);
    }
    @Test
    void create() {
        PatientAddress create = patientAddressRepository.create(patientAddress);
        assertEquals(patientAddress.getPatientAddressNumber(),create.getPatientAddressNumber());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        PatientAddress read = patientAddressRepository.read(patientAddress.getPatientAddressNumber());
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        PatientAddress update = new PatientAddress.Builder().copy(patientAddress).setAddressNumber("AN09SM").build();
        System.out.println("Updated: " + update);
    }

    @Test
    void delete() {
        patientAddressRepository.delete(patientAddress.getPatientAddressNumber());
        System.out.println("Deleted: "+ patientAddress.getPatientAddressNumber());
    }

}
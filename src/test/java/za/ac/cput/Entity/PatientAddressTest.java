/*
 author : Siphosethu Manisi 219039380
 Description: This is a PatientAddress Test class
              which is basically what the client/patient will see
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.PatientAddressFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class PatientAddressTest {
    String addressNumber, patientNumber;
    @BeforeEach
    void valuesEntry(){
        addressNumber = JOptionPane.showInputDialog("Enter AddressNumber"," ");
        patientNumber = JOptionPane.showInputDialog("Enter PatientNumber"," ");
    }
    @Test
    void test(){
        PatientAddress patientAddress = PatientAddressFactory.build(patientNumber,addressNumber);
        System.out.println(patientAddress);
        assertNotNull(patientAddress);
    }
}

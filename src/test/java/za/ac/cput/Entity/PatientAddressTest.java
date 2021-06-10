/*
 author : Siphosethu Manisi 219039380
 Description: This is a PatientAddress Test class
              which is basically what the client/patient will see
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Factory.PatientAddressFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class PatientAddressTest {
    String addressNumber, patientNumber;
    PatientAddress patientAddress1, patientAddress2;
    @BeforeEach
    void valuesEntry(){
        patientNumber = JOptionPane.showInputDialog("Enter PatientNumber1"," ");
        addressNumber = JOptionPane.showInputDialog("Enter AddressNumber1"," ");
        patientAddress1= PatientAddressFactory.build(patientNumber,addressNumber);
        patientNumber = JOptionPane.showInputDialog("Enter PatientNumber2"," ");
        addressNumber = JOptionPane.showInputDialog("Enter AddressNumber2"," ");
        patientAddress2 = PatientAddressFactory.build(patientNumber,addressNumber);
    }
    //timeout test
    @Test
    @Timeout(1000)
    void test(){
        System.out.println(patientAddress1);
        System.out.println(patientAddress2);
        assertNotNull(patientAddress1);
        assertNotNull(patientAddress2);
    }
    //equality test
    @Test
    void testEquality(){
        System.out.println(patientAddress1);
        System.out.println(patientAddress2);
        assertNotSame(patientAddress1,patientAddress2);
    }
    //identity test
    @Test
    void testIdentity(){
        PatientAddress patientAddress3 = patientAddress1;
        System.out.println(patientAddress1);
        assertEquals(patientAddress1,patientAddress3);
    }
    //disabling tests
    @Disabled
    @Test
    void testDisable(){
        assertNotSame(patientAddress1,patientAddress2);
    }

}

/*
 author : Siphosethu Manisi 219039380
 Description: This is a Patient Test class
              which is basically what the client/patient will see
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.PatientFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
public class PatientTest {
    String firstName, lastName, contactNumber;
    @BeforeEach
    void valuesEntryTest(){
        firstName = JOptionPane.showInputDialog("Enter Name"," ");
        lastName = JOptionPane.showInputDialog("Enter Last Name"," ");
        contactNumber = JOptionPane.showInputDialog("Enter Contact Number"," ");
    }
    @Test
    void test(){
        Patient patient = PatientFactory.build(firstName, lastName,contactNumber);
        System.out.println(patient);
        assertNotNull(patient);
    }
}

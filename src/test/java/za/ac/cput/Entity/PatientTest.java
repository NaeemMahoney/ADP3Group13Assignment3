/*
 author : Siphosethu Manisi 219039380
 Description: This is a Patient Test class
              which is basically what the client/patient will see
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Factory.PatientFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
public class PatientTest {
    String firstName, lastName, contactNumber;
    Patient patient1, patient2;
    @BeforeEach
    void valuesEntryTest(){
        firstName = JOptionPane.showInputDialog("Enter Name"," ");
        lastName = JOptionPane.showInputDialog("Enter Last Name"," ");
        contactNumber = JOptionPane.showInputDialog("Enter Contact Number"," ");
        patient1 = PatientFactory.build(firstName, lastName,contactNumber);
        firstName = JOptionPane.showInputDialog("Enter second patients Name"," ");
        lastName = JOptionPane.showInputDialog("Enter second patients Last Name"," ");
        contactNumber = JOptionPane.showInputDialog("Enter second patients Contact Number"," ");
        patient2 = PatientFactory.build(firstName, lastName,contactNumber);
    }
    @Test
    @Timeout(1000)
    void test(){
        System.out.println(patient1);
        System.out.println(patient2);
        assertNotNull(patient1);
        assertNotNull(patient2);
    }
    //equality test
    @Test
    void testEquality(){
        System.out.println(patient1);
        System.out.println(patient2);
        assertNotSame(patient1,patient2);
    }
    //identity test
    @Test
    void testIdentity(){
        Patient patient3 = patient1;
        System.out.println(patient1);
        assertEquals(patient1,patient3);
    }
    //disabling tests
    @Disabled
    @Test
    void testDisable(){
        assertNotSame(patient1,patient2);
    }

}

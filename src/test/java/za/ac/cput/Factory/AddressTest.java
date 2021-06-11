/*
AddressTest.java
Testing class
Author:Ra'ees Manuel 219074089
Date:11 June 2021

 */

package za.ac.cput.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Address;
import za.ac.cput.Factory.AddressFactory;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest
{
    String addressNumber,houseNumber,streetName,suburb,postalCode;


    @BeforeEach
    void valuesEntryTest(){
        addressNumber = JOptionPane.showInputDialog("Enter Address number"," ");
        houseNumber = JOptionPane.showInputDialog("Enter House number"," ");
        streetName = JOptionPane.showInputDialog("Enter Street Name"," ");
        suburb = JOptionPane.showInputDialog("Enter suburb "," ");
        postalCode = JOptionPane.showInputDialog("Enter postal code"," ");


    }
    @Test
    void test()
    {
        Address address = AddressFactory.build(addressNumber,houseNumber,streetName,suburb,postalCode);
        System.out.println(address);
        assertNotNull(address);
    }
}
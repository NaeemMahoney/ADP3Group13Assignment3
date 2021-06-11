/*
AddressTest.java
Testing class
Author:Ra'ees Manuel 219074089
due date:11 June 2021

 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Address;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest
{
    String houseNumber, streetName, suburb, postalCode;

    Address address1 = AddressFactory.build("10", "Albermarle", "hazendal","7764" );
    Address address2 = AddressFactory.build("73", "Grasmere", "Athlone","7764" );

    @Test
    void testAddress()
    {
        Address address1 = AddressFactory.build("10", "Albermarle", "hazendal","7764" );
        System.out.println(address1);
        assertNotNull(address1);
    }

    @Test //Testing equality

    void testEqualityAddress()
    {
        assertNotEquals(address1, address2);
    }

    @Test // testing the timeouts
    @Timeout(1000)
    void testTimeoutAddress() throws InterruptedException
    {
        Thread.sleep(500);
        assertNotSame(address1, address2);
    }


    @Test //timeout
    @Disabled("disabled")
    void testDisable()
    {
        assertNotSame(address1, address2);
    }
}
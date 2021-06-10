/*
AddressFactory.java
Factory class
Author:Ra'ees Manuel 219074089
Date:11 June 2021
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Address;


public class AddressFactory
{
    public static  Address build(String addressNumber, String houseNumber,String streetName, String suburb, String postalCode)
    {
        if (addressNumber.isEmpty() || streetName.isEmpty()|| houseNumber.isEmpty() || suburb.isEmpty() || postalCode.isEmpty())

            return null;

        return new Address.Builder()
                .setAddressNumber(addressNumber).setHouseNumber(houseNumber)
                .setStreetName(streetName).setSuburb(suburb).setPostalCode(postalCode).build();

    }


}
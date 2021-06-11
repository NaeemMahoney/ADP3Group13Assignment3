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
    public static  Address build(String houseNumber,String streetName, String suburb, String postalCode)
    {
        if (streetName.isEmpty()||houseNumber.isEmpty()||suburb.isEmpty()||postalCode.isEmpty())

            return null;
        int rand = (int)(Math.random()*(1000-1+1)+1);
        String addressNumber ="AN"+Integer.toString(rand)+ streetName.charAt(0);


        return new Address.Builder()
                .setAddressNumber(addressNumber).setHouseNumber(houseNumber)
                .setStreetName(streetName).setSuburb(suburb).setPostalCode(postalCode).build();

    }


}
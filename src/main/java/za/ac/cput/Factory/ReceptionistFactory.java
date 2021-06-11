/*
 author : Vaneza Sito 211315044
 Description: This is a Receptionist Entity.
 Due Date: 11 June 2021
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Receptionist;

public class ReceptionistFactory {
    public static Receptionist build(String firstName, String lastName, String contactNumber) {

        int random = (int) (Math.random() * 999) + 1;

        String receptionistNumber = "R01" + Integer.toString(random);

        return new Receptionist.Builder()
                .setReceptionistNumber(receptionistNumber).setFirstName(firstName).setLastName(lastName)
                .setContactNumber(contactNumber).build();



    }
}




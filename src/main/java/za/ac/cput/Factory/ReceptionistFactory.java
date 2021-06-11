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




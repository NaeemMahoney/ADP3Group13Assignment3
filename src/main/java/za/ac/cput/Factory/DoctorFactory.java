package za.ac.cput.Factory;

import za.ac.cput.Entity.Doctor;
import za.ac.cput.Util.GenericHelper;

/*
 * DoctorFactory.java
 * Name :Mpumelelo Magagula
 * Student Number:218136021
 * Description: This entityFactory display all the records of doctors working in the clinic and their occupation level and status.
 * Date:08 June 2021
 * */
public class DoctorFactory {

    public static Doctor createDoctor(String firstName, String lastName, String emailAddress, String contactNumber ){
        String doctorId = GenericHelper.generateID();
        Doctor doctor = new Doctor.Builder()
                .setDoctorNumber(doctorId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailAddress(emailAddress)
                .setContactNumber(contactNumber)
                .Build();

        return doctor;
    }

}


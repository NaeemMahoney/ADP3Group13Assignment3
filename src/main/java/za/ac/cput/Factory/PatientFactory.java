/*
 author : Siphosethu Manisi 219039380
 Description: This is a Patient Factory
              where the complex process are hidden from the Patient
 Due Date: 11 June 2021
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Patient;

public class PatientFactory {
    public static Patient build(String firstName, String lastName, String contactNumber){
        if(firstName.isEmpty()||lastName.isEmpty()||contactNumber.isEmpty()||
                contactNumber.length()!=10||firstName.length()<2||lastName.length()<3)
            return null;
        int rand = (int)(Math.random()*(1000-1+1)+1);
        String patientNumber ="P"+Integer.toString(rand)
                + firstName.charAt(0) + lastName.charAt(0);
        return new Patient.Builder()
                .setPatientNumber(patientNumber).setFirstName(firstName).setLastName(lastName)
                .setContactNumber(contactNumber).build();
    }
}

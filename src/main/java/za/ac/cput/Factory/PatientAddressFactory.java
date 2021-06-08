/*
 author : Siphosethu Manisi 219039380
 Description: This is a PatientAddress Factory
              where the complex process are hidden from the Patient
 Due Date: 11 June 2021
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.PatientAddress;

public class PatientAddressFactory {
    public static PatientAddress build(String patientNumber, String addressNumber){
        if(patientNumber.isEmpty()||addressNumber.isEmpty())
            return null;

        int rand = (int)(Math.random()*(1000-1+1)+1);
        String patientAddressNumber ="PA"+Integer.toString(rand);

        return new PatientAddress.Builder()
               .setPatientNumber(patientNumber).setAddressNumber(addressNumber)
                .setPatientAddressNumber(patientAddressNumber).build();
    }
}

package za.ac.cput.Factory;
 import za.ac.cput.Entity.Prescription;

/* PrescriptionFactory.Java
This is the prescription Factory entity
Author: Ratidzai Makondo - 218187289
Date: 11 June 2021
 */

public class PrescriptionFactory {
    public static Prescription createPrescription(String patientNumber, String doctorNumber, double bill, int dosage) {

        int random = (int)(Math.random() * 999) + 1;
        String prescriptionNumber = "PR01" + Integer.toString(random);

        Prescription prescription = new Prescription.Builder()
                .setPrescriptionNumber(prescriptionNumber)
                .setPatientNumber(patientNumber)
                .setDoctorNumber(doctorNumber)
                .setBill(bill)
                .setDosage(dosage)
                .build();

        return prescription;

    }






























}





package za.ac.cput.Entity;
/* Prescription.java
This is the entity for the prescription
Author: Ratidzai Makondo - (218187289)
Date: 11 June 2021
 */

public class  Prescription {
    private String prescriptionNumber ;
    private String patientNumber;
    private String doctorNumber;
    private double bill;
    private int dosage;



    public Prescription(Builder builder) {
        this.prescriptionNumber = builder.prescriptionNumber;
        this.patientNumber = builder.patientNumber;
        this.doctorNumber = builder.doctorNumber;
        this.bill = builder.bill;
        this.dosage = builder.dosage;
    }



    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionNumber='" + prescriptionNumber + '\'' +
                ", patientNumber='" + patientNumber + '\'' +
                ", doctorNumber='" + doctorNumber + '\'' +
                ", bill=" + bill +
                ", dosage=" + dosage +
                '}';
    }
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    public static class Builder{
        private String prescriptionNumber;
        private String patientNumber;
        private String doctorNumber;
        private double bill;
        private int dosage;


        public Builder setPrescriptionNumber(String prescriptionNumber){
            this.prescriptionNumber  = prescriptionNumber;
            return this;

        }
        public Builder setPatientNumber(String patientNumber) {
            this.patientNumber = patientNumber;
            return this;
        }
        public Builder setDoctorNumber(String doctorNumber) {
            this.doctorNumber = doctorNumber;
            return this;
        }
        public Builder setBill(double Bill) {
            this.bill = bill;
            return this;
        }
        public Builder setDosage(int dosage) {
            this.dosage = dosage;
            return this;
        }

        public Prescription build() {
            return new Prescription(this);

        }
        public Builder copy(Prescription prescription) {
            this.prescriptionNumber = prescriptionNumber;
            this.patientNumber = patientNumber;
            this.doctorNumber = doctorNumber;
            this.bill = bill;
            this.dosage = dosage;

            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "prescriptionNumber='" + prescriptionNumber + '\'' +
                    ", patientNumber='" + patientNumber + '\'' +
                    ", doctorNumber='" + doctorNumber + '\'' +
                    ", bill=" + bill +
                    ", dosage=" + dosage +
                    '}';
        }
    }
}

/*
 author : Siphosethu Manisi 219039380
 Description: This is a PatientAddress Entity where a patients information
              is linked to they address with the patientsNumber and the addresses
              addressNumber for a clinic systems application
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;

public class PatientAddress {
    private String patientAddressNumber, patientNumber, addressNumber;

    public PatientAddress(PatientAddress.Builder builder){
        this.patientNumber = builder.patientNumber;
        this.addressNumber = builder.addressNumber;
        this.patientAddressNumber = builder.patientAddressNumber;
    }

    public static class Builder{
        private String patientNumber, patientAddressNumber, addressNumber;

        public PatientAddress.Builder setPatientNumber(String patientNumber) {
            this.patientNumber = patientNumber;
            return this;
        }

        public PatientAddress.Builder setAddressNumber(String addressNumber) {
            this.addressNumber = addressNumber;
            return this;
        }

        public PatientAddress.Builder setPatientAddressNumber(String patientAddressNumber) {
            this.patientAddressNumber = patientAddressNumber;
            return this;
        }

        public PatientAddress build(){
            return new PatientAddress(this);
        }


    }
    @Override
    public String toString() {
        return "PatientAddress{" +
                "patientNumber='" + patientNumber + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", patientAddressNumber='" + patientAddressNumber + '\'' +
                '}';
    }
}

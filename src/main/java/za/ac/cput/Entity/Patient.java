/*
 author : Siphosethu Manisi 219039380
 Description: This is a Patient Entity where a patients information
              is captured for a clinic systems application
 Due Date: 11 June 2021
 */
package za.ac.cput.Entity;

public class Patient {
    private String patientNumber, firstName, lastName, contactNumber;

    public Patient(Builder builder){
        this.patientNumber = builder.patientNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.contactNumber = builder.contactNumber;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    //builder pattern
    public static class Builder{
        private String patientNumber, firstName, lastName, contactNumber;

        public Builder setPatientNumber(String patientNumber) {
            this.patientNumber = patientNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Patient build(){
            return new Patient(this);
        }

        public Builder copy(Patient patient){
            this.contactNumber = contactNumber;
            this.patientNumber = patientNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }


    }
    @Override
    public String toString() {
        return "Patient{" +
                "patientNumber='" + patientNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}

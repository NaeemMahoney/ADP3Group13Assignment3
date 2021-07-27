package za.ac.cput.Entity;

/*
 * Doctor Entity
 * Name :Mpumelelo Magagula
 * Student Number:218136021
 * Description: This entity display all the records of doctors working in the clinic and their occupation level and status.
 * Date:08 June 2021
 * */
public class Doctor {

    private String doctorNumber, firstName, lastName, emailAddress, contactNumber;

    private Doctor(Builder builder) {
        this.doctorNumber = builder.doctorNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
        this.contactNumber = builder.ContactNumber;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "doctorNumber='" + doctorNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", ContactNumber='" + contactNumber + '\'' +
                '}';
    }

    public  static class Builder{
        private String doctorNumber, firstName, lastName, emailAddress, ContactNumber;

        public Builder setDoctorNumber(String doctorNumber) {
            this.doctorNumber = doctorNumber;

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

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;

            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            ContactNumber = contactNumber;

            return this;
        }

        public Doctor Build(){


            return new Doctor(this ) ;
        }

        public Builder copy(Doctor doctor){
            this.doctorNumber = doctor.doctorNumber;
            this.firstName = doctor.firstName;
            this.lastName = doctor.lastName;
            this.emailAddress = doctor.emailAddress;
            this.ContactNumber = doctor.contactNumber;

            return  this;
        }


    }
}



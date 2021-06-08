package za.ac.cput.Entity;


/*
* Name :Mpumelelo Magagula
* Student Number:218136021
* Description:
* Date:08 June 2021
* */
public class Doctor {

   private String doctorNumber, firstName, lastName, emailAddress, ContactNumber;

    private Doctor(Builder builder) {
        this.doctorNumber = builder.doctorNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
        this.ContactNumber = builder.ContactNumber;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "doctorNumber='" + doctorNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
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
             this.ContactNumber = doctor.ContactNumber;

             return  this;
         }


    }
}


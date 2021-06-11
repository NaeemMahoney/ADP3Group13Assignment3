package za.ac.cput.Entity;

public class Receptionist {

    private String receptionistNumber, firstName, lastName, contactNumber;

    private Receptionist() {
    }

    public Receptionist(Builder builder) {
        this.receptionistNumber= builder.receptionistNumber;
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
        this.contactNumber= builder.contactNumber;
    }

    public String getReceptionistNumber() {
        return receptionistNumber;
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

    @Override
    public String toString() {
        return "Receptionist{" +
                "receptionistNumber='" + receptionistNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String receptionistNumber, firstName, lastName, contactNumber;

        public Builder setReceptionistNumber(String receptionistNumber) {
            this.receptionistNumber = receptionistNumber;
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
        public Receptionist build(){

            return new Receptionist(this);

        }


    }
}





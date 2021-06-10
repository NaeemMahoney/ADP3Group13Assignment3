/*
Address.java
Builder class
Author:Ra'ees Manuel 219074089
Date:11 June 2021
 */

package za.ac.cput.Entity;

public class Address
{
private String addressNumber; //Declaring strings
private String houseNumber;
private String streetName;
private String suburb;
private String postalCode;

public Address(Builder builder)
{

    this.addressNumber = builder.addressNumber;
    this.houseNumber = builder.houseNumber;
    this.streetName = builder.streetName;
    this.suburb = builder.suburb;
    this.postalCode = builder.postalCode;
}

    public static class Builder   //Builder class
    {
        private String addressNumber;
        private String houseNumber;
        private String streetName;
        private String suburb;
        private String postalCode;

        public Builder setAddressNumber(String addressNumber)
        {
            this.addressNumber = addressNumber;
            return this;
        }

        public Builder setHouseNumber(String houseNumber)
        {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreetName(String streetName)
        {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb)
        {
            this.suburb = suburb;
            return this;
        }

        public Builder setPostalCode(String postalCode)
        {
            this.postalCode = postalCode;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }
}
    @Override
    public String toString() {
        return "Address{" +
                "addressNumber='" + addressNumber + '\'' +
                ",houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}


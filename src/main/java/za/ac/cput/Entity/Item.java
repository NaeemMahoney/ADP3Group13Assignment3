package za.ac.cput.Entity;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Builder Class for Item Entity

public class Item {
    private String itemNumber, prescriptionNumber, itemName, itemType;
    private double itemPrice;

    private Item(){}

    private Item (Builder builder){
        this.itemNumber=builder.itemNumber;
        this.prescriptionNumber=builder.prescriptionNumber;
        this.itemName=builder.itemName;
        this.itemPrice=builder.itemPrice;
        this.itemType=builder.itemType;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    //Builder for Item Entity
    public static class Builder{
        private String itemNumber, prescriptionNumber, itemName, itemType;
        private double itemPrice;

        public Builder itemNumber(String itemNumber){
            this.itemNumber = itemNumber;
            return this;
        }

        public Builder prescriptionNumber(String prescriptionNumber){
            this.prescriptionNumber = prescriptionNumber;
            return this;
        }

        public Builder itemName(String itemName){
            this.itemName = itemName;
            return this;
        }

        public Builder itemPrice(double itemPrice){
            this.itemPrice = itemPrice;
            return this;
        }

        public Builder itemType(String itemType){
            this.itemType = itemType;
            return this;
        }

        public Item builder(){
            return new Item(this);
        }

        public Builder copy(Item item) {
            this.itemNumber = item.itemNumber;
            this.prescriptionNumber = item.prescriptionNumber;
            this.itemName = item.itemName;
            this.itemPrice = item.itemPrice;
            this.itemType = item.itemType;
            return this;
        }
    }

    //to String for Item Entity
    @Override
    public String toString() {
        return "Item{" +
                "itemNumber='" + itemNumber + '\'' +
                ", prescriptionNumber='" + prescriptionNumber + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

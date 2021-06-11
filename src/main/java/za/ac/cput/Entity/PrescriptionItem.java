package za.ac.cput.Entity;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Builder Class for PrescriptionItem Entity

public class PrescriptionItem {
    private String prescriptionNumber, itemNumber;

    //Builder for PrescriptionItem Entity
    private PrescriptionItem(Builder builder){
        this.prescriptionNumber=builder.prescriptionNumber;
        this.itemNumber=builder.itemNumber;
    }
    public static class Builder{
        private String prescriptionNumber, itemNumber;

        public Builder setPrescriptionNumber(String prescriptionNumber){
            this.prescriptionNumber=prescriptionNumber;
            return this;
        }

        public Builder setItemNumber(String itemNumber){
            this.itemNumber=itemNumber;
            return this;
        }

        public PrescriptionItem builder(){
            return new PrescriptionItem(this);
        }
    }

    //to String for PrescriptionItem Entity
    @Override
    public String toString() {
        return "PrescriptionItem{" +
                "prescriptionNumber='" + prescriptionNumber + '\'' +
                ", itemNumber='" + itemNumber + '\'' +
                '}';
    }
}

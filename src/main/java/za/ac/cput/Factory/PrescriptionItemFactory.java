package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for PrecriptionItem Entity

import za.ac.cput.Entity.PrescriptionItem;

public class PrescriptionItemFactory {
    public static PrescriptionItem build(){
        int randomNumber;
        randomNumber = (int)Math.floor(Math.random()*(1000-1+1)+1);
        String itemNumber = "ITM"+Integer.toString(randomNumber);
        String prescriptionNumber = "PRM"+Integer.toString(randomNumber);
        return new PrescriptionItem.Builder().setPrescriptionNumber(prescriptionNumber).
                setItemNumber(itemNumber).builder();
    }
}

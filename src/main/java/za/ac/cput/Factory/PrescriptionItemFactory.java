package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for PrecriptionItem Entity

import za.ac.cput.Entity.PrescriptionItem;

public class PrescriptionItemFactory {
    public static PrescriptionItem build(String prescriptionNumber, String itemNumber){

        //Assign a code to PrescriptionNumber and ItemNumber using a random Number
        int randomNumber;
        randomNumber = (int)Math.floor(Math.random()*(1000-1+1)+1);
        itemNumber = "ITM"+Integer.toString(randomNumber);
        prescriptionNumber = "PRM"+Integer.toString(randomNumber);

        //Return
        return new PrescriptionItem.Builder().setPrescriptionNumber(prescriptionNumber).
                setItemNumber(itemNumber).builder();
    }
}

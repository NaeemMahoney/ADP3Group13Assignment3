package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for Item Entity

import za.ac.cput.Entity.Item;

public class ItemFactory {
    public static Item build(String itemNumber, String prescriptionNumber,
                             String itemName, double itemPrice, String itemType){

        //Check if values are null
        if(itemName.isEmpty() || itemPrice < 0 || itemType.isEmpty())
            return null;

       //Assign a code to PrescriptionNumber and ItemNumber using a random Number
        int randomNumber;
        randomNumber = (int)Math.floor(Math.random()*(1000-1+1)+1);
        itemNumber = "ITM"+Integer.toString(randomNumber);
        prescriptionNumber = "PRM"+Integer.toString(randomNumber);

        //Return
        return new Item.Builder().itemNumber(itemNumber).prescriptionNumber(prescriptionNumber)
                .itemName(itemName).itemPrice(itemPrice).itemType(itemType).builder();
    }
}

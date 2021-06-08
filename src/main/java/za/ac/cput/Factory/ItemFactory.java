package za.ac.cput.Factory;
//Na'eem Mahoney
//218190751
//ADP3
//Assignment 3
//Factory for Item Entity

import za.ac.cput.Entity.Item;

public class ItemFactory {
    public static Item build(String itemName, double itemPrice, String itemType){
        if(itemName.isEmpty() || itemPrice < 0 || itemType.isEmpty())
            return null;
        int randomNumber;
        randomNumber = (int)Math.floor(Math.random()*(1000-1+1)+1);
        String itemNumber = "ITM"+Integer.toString(randomNumber);
        String prescriptionNumber = "PRM"+Integer.toString(randomNumber);
        return new Item.Builder().itemNumber(itemNumber).prescriptionNumber(prescriptionNumber)
                .itemName(itemName).itemPrice(itemPrice).itemType(itemType).builder();
    }
}

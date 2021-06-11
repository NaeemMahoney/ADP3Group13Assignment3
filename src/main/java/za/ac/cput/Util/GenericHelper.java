package za.ac.cput.Util;

import java.util.UUID;

/*
 * GenericHelper.java for doctorID
 * Name :Mpumelelo Magagula
 * Student Number:218136021
 * Description: this class is for generating the doctorID randomly.
 * Date:08 June 2021
 * */
public class GenericHelper {
    public static String generateID(){


        return UUID.randomUUID().toString();
    }
}

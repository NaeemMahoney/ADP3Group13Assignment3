package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Doctor;

import static org.junit.jupiter.api.Assertions.*;

/*
 * DotorFactoryTest.java
 * Name :Mpumelelo Magagula
 * Student Number:218136021
 * Description: this class is for generating the doctorID randomly.
 * Date:08 June 2021
 * */
class DoctorFactoryTest {

    @Test
    public void createDoctor(){
        Doctor doctor= DoctorFactory.createDoctor("Mpumelelo","Magagula","successeugene3@gmail.com","0761235489");
        System.out.println(doctor);
    }
}
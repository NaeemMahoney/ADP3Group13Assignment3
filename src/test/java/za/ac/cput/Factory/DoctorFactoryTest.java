package za.ac.cput.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Doctor;

import static org.junit.jupiter.api.Assertions.*;

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
        Doctor doctor= DoctorFactory.createDoctor("DR M","Magagula","successeugene3@gmail.com","0761235489");
        System.out.println(doctor);
    }

    @Test
    public void objectEquality(){
        Doctor doctor = DoctorFactory.createDoctor("DR M.E","Zitha", "zitha@gmail.com","07284956321");
        Doctor doctor2 = DoctorFactory.createDoctor("DR J.M","Franc", "fjayde@gmail.com","0824956321");
        Doctor doctor3 = DoctorFactory.createDoctor("DR E","Khoza", "zitha@gmail.com","07984956321");
        System.out.println(doctor +"\n"+ doctor2+"\n"+doctor3);

        assertEquals(doctor, doctor2);

    }

    @Test
    public void objectIdentity(){
        Doctor doctor = DoctorFactory.createDoctor("DR M.E","Zitha", "zitha@gmail.com","07284956321");
        Doctor doctor2 = DoctorFactory.createDoctor("DR J.M","Franc", "zitha@gmail.com","07284956321");
        Doctor doctor3 = DoctorFactory.createDoctor("DR E","Khoza", "zitha@gmail.com","07284956321");
        System.out.println(doctor +"\n"+ doctor2+"\n"+doctor3);


        assertSame(doctor,doctor3);
    }
    @Test
    @Timeout(200)
    public void Timeout() throws InterruptedException {
        Doctor doctor = DoctorFactory.createDoctor("DR M.E","Zitha", "zitha@gmail.com","07284956321");
        Doctor doctor2 = DoctorFactory.createDoctor("DR J.M","Franc", "zitha@gmail.com","07284956321");
        Doctor doctor3 = DoctorFactory.createDoctor("DR E","Khoza", "zitha@gmail.com","07284956321");
        System.out.println(doctor +"\n"+ doctor2+"\n"+doctor3);

        Thread.sleep(50);
        assertSame(doctor,doctor2);

    }
    @Test
    @Disabled
    public void DisablingTests(){
        Doctor doctor = DoctorFactory.createDoctor("DR M.E","Zitha", "zitha@gmail.com","07284956321");
        Doctor doctor2 = DoctorFactory.createDoctor("DR J.M","Franc", "zitha@gmail.com","07284956321");
        Doctor doctor3 = DoctorFactory.createDoctor("DR E","Khoza", "zitha@gmail.com","07284956321");
        System.out.println(doctor +"\n"+ doctor2+"\n"+doctor3);

        assertSame(doctor,doctor2);
    }
}


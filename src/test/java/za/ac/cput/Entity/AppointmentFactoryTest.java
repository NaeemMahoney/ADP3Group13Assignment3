package za.ac.cput.Entity;

/* AppointmentFactoryTest.java
   Test class for Appointment Factory
   Author: Nolusindiso Makosa (219023557)
   Due Date: 11 June 2021
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Factory.AppointmentFactory;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentFactoryTest {
        private Appointment appointment, appointment1, appointment2;

            @Test
            void createAppointment(){
            Appointment appointment = AppointmentFactory.createAppointment("24 June 2021", "14:30PM",
                    "Consultation", "P01MM", "D01BN", "R01LK");

            Appointment appointment1 = AppointmentFactory.createAppointment("26 June 2021", "15:30PM",
                    "Fetch results", "P10PS", "D11NM", "R11OP");
            System.out.println(appointment);
            System.out.println(appointment1);
            assertNotNull(appointment);
        }

        //object equality
        @Test
        void objectEquality() {
        appointment = AppointmentFactory.createAppointment("24 June 2021", "14:30PM",
                "Consultation", "P01MM", "D01BN", "R01LK");
        appointment1 = AppointmentFactory.createAppointment("26 June 2021", "15:30PM",
                "Fetch results", "P10PS", "D11NM", "R11OP");
        appointment2 = appointment;
        assertEquals(appointment, appointment2);
    }

        //object identity
        @Test
        void objectIdentity(){
        appointment = AppointmentFactory.createAppointment("24 June 2021", "14:30PM",
                "Consultation", "P01MM", "D01BN", "R01LK");
        appointment1 = AppointmentFactory.createAppointment("26 June 2021", "15:30PM",
                "Fetch results", "P10PS", "D11NM", "R11OP");
        assertNotSame(appointment, appointment1);
    }

        //timeouts
        @Test
        @Timeout(1000)
        void testTimeouts() throws InterruptedException {
        appointment = AppointmentFactory.createAppointment("24 June 2021", "14:30PM",
                "Consultation", "P01MM", "D01BN", "R01LK");
        Thread.sleep(600);
    }

         //disable test
        @Disabled("Disabled until receptionist is up")
        @Test
        void testDisable(){
        appointment = AppointmentFactory.createAppointment("24 June 2021", "14:30PM",
                "Consultation", "P01MM", "D01BN", "R01LK");
        appointment1 = AppointmentFactory.createAppointment("26 June 2021", "15:30PM",
                "Fetch results", "P10PS", "D11NM", "R11OP");
        appointment2 = appointment;
        assertEquals(appointment, appointment2);
    }
}
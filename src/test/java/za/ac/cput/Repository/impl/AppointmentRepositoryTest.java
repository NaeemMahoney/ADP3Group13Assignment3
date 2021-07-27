package za.ac.cput.Repository.impl;

/* AppointmentRepository.java
   Test cases for Appointment Repository
   Author: Nolusindiso Makosa (219023557)
   Due Date: 26 July 2021
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Appointment;
import za.ac.cput.Factory.AppointmentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AppointmentRepositoryTest {
    private static AppointmentRepository repository = AppointmentRepository.getRepository();
    private static Appointment appointment = AppointmentFactory.createAppointment("26 July 2021", "15:30PM",
            "Fetch results", "P10PS", "D11NM", "R11OP");

    @Test
    void a_create(){
        Appointment created = repository.create(appointment);
        assertEquals(created.getAppointmentNumber(), appointment.getAppointmentNumber());
        System.out.println("Create Appointment: " + created);
    }

    @Test
    void b_read(){
        Appointment read = repository.read(appointment.getAppointmentNumber());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Appointment update = new Appointment.Builder().copy(appointment).setPatientNumber("P22JK").setDoctorNumber("D09MM").
                setReceptionistNumber("R10LO").build();
        update = repository.update(update);
        System.out.println("Updated Appointment: " + update);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(appointment.getAppointmentNumber());
        assertTrue(deleted);
        System.out.println("Appointment Deleted: "+ deleted);
    }

}
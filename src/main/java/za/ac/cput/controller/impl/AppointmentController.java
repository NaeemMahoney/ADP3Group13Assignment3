package za.ac.cput.controller.impl;
/* Appointment.java
   Controller Entity class for Appointment
   Author: Nolusindiso Makosa (219023557)
   Date: 17 August 2021
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Appointment;
import za.ac.cput.Factory.AppointmentFactory;
import za.ac.cput.Service.impl.AppointmentService;

import java.util.Set;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    //@PostMapping("/create")
    public Appointment create(@RequestBody Appointment appointment) {
        Appointment newAppointment = AppointmentFactory.createAppointment(appointment.getDate(), appointment.getTime(),
                appointment.getReason(), appointment.getPatientNumber(), appointment.getDoctorNumber(), appointment.getReceptionistNumber());

        return appointmentService.create(newAppointment);
    }

    @GetMapping("/read{appointmentNumber}")
    public Appointment read(@PathVariable String appointmentNumber) {
        return appointmentService.read(appointmentNumber);
    }

    @PostMapping("/update")
    public Appointment update(@RequestBody Appointment appointment) {
        return appointmentService.update(appointment);
    }

    @PostMapping("/delete/{appointmentNumber}")
    public boolean delete(@PathVariable String appointmentNumber) {
            return appointmentService.delete(appointmentNumber);
    }

    @GetMapping("/getAll")
    public  Set<Appointment> getAll(){
        return appointmentService.getAll();
    }

}

package za.ac.cput.Service.impl;

/* IAppointmentService.java
   Interface for Appointment Service
   Author: Nolusindiso Makosa (219023557)
   Due Date: 02 August 2021
*/

import za.ac.cput.Entity.Appointment;
import za.ac.cput.Service.iService;

import java.util.Set;

public interface IAppointmentService extends iService<Appointment, String>{
    public Set<Appointment> getAll();

}

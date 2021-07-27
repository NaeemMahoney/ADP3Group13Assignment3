package za.ac.cput.Repository;

/* IAppointmentRepository.java
   Interface Repository for Appointment
   Author: Nolusindiso Makosa (219023557)
   Due Date: 26 July 2021
*/
import za.ac.cput.Entity.Appointment;

import java.util.Set;

public interface IAppointmentRepository extends IRepository<Appointment, String> {
    public Set<Appointment> getAll();
}

package za.ac.cput.Repository.impl;

/* AppointmentRepository.java
   Repository for Appointment
   Author: Nolusindiso Makosa (219023557)
   Due Date: 26 July 2021
*/

import za.ac.cput.Entity.Appointment;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class AppointmentRepository implements IRepository<Appointment ,String>{
    private static AppointmentRepository repository = null;
    private Set<Appointment> appointmentDB = null;

    private AppointmentRepository()
    {
        appointmentDB = new HashSet<Appointment>();
    }

    public static AppointmentRepository getRepository() {
        if (repository == null)
        {
            repository = new AppointmentRepository();
        }
        return repository;
    }

    @Override
    public Appointment create(Appointment appointment) {
        boolean success = appointmentDB.add(appointment);
        if(!success)
            return null;
        return appointment;
    }

    @Override
    public Appointment read(String appointmentNumber){
        for(Appointment a : appointmentDB)
            if(a.getAppointmentNumber().equals(appointmentNumber)){
                return a;
            }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment){
        Appointment oldAppointment = read(appointment.getAppointmentNumber());
        if(oldAppointment != null){
            appointmentDB.remove(oldAppointment);
            appointmentDB.add(appointment);
            return appointment;
        }
        return null;
    }

    @Override
    public boolean delete(String appointmentNumber) {
        Appointment appointmentToDelete = read(appointmentNumber);
        if (appointmentNumber != null) {
            appointmentDB.remove(appointmentToDelete);
            return true;
        }
        return false;
    }

    public Set<Appointment> getAll() {
        return appointmentDB;
    }
}
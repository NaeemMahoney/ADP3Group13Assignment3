package za.ac.cput.Repository.impl;

/* AppointmentRepository.java
   Repository for Appointment
   Author: Nolusindiso Makosa (219023557)
   Due Date: 26 July 2021
*/

import za.ac.cput.Entity.Appointment;
import za.ac.cput.Factory.AppointmentFactory;
import za.ac.cput.Repository.IAppointmentRepository;

import java.util.HashSet;
import java.util.Set;

public class AppointmentRepository implements IAppointmentRepository {
    private static AppointmentRepository repository = null;
    private Set<Appointment> appoinmentDB;

    private AppointmentRepository()
    {
        this.appoinmentDB = new HashSet<>();
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
        this.appoinmentDB.add(appointment);
        return appointment;
    }

    @Override
    public Appointment read(String appointmentNumber){
        for(Appointment a : appoinmentDB)
            if(a.getAppointmentNumber().equals(appointmentNumber)){
                return a;
            }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment){
        Appointment oldAppointment = read(appointment.getAppointmentNumber());
        if(oldAppointment != null){
            this.appoinmentDB.remove(oldAppointment);
            this.appoinmentDB.add(appointment);
            return appointment;
        }
        return null;
    }

    @Override
    public boolean delete(String appointmentNumber) {
        Appointment appointmentToDelete = read(appointmentNumber);
        if (appointmentNumber != null) {
            this.appoinmentDB.remove(appointmentToDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Appointment> getAll() {
        return this.appoinmentDB;
    }
}
package za.ac.cput.Service.impl;

/* AppointmentService.java
   Service class for Appointment to implement interface
   Author: Nolusindiso Makosa (219023557)
   Due Date: 02 August 2021
*/

import za.ac.cput.Entity.Appointment;
import za.ac.cput.Repository.impl.AppointmentRepository;

public class AppointmentService implements IAppointmentService{
    private static AppointmentService service = null;
    private AppointmentRepository repository = null;

    private AppointmentService(){
        this.repository = AppointmentService.service.repository;
    }

    public static AppointmentService getService(){
        if (service == null) {
            service = new AppointmentService();
        }
        return service;
    }

    @Override
    public Appointment create(Appointment appointment){
        return this.repository.create(appointment);
    }

    @Override
    public Appointment read(String appointmentNumber){
        return this.repository.read(appointmentNumber);
    }

    @Override
    public Appointment update(Appointment appointment){
        return this.repository.update(appointment);
    }

    @Override
    public boolean delete(String appointmentNumber){
        return this.repository.delete(appointmentNumber);
    }

}

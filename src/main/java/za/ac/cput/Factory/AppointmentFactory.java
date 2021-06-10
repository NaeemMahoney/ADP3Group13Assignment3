package za.ac.cput.Factory;

/* AppointmentFactory.java
   Factory for Appointment
   Author: Nolusindiso Makosa (219023557)
   Due Date: 11 June 2021
*/

import za.ac.cput.Entity.Appointment;

public class AppointmentFactory {
    public static Appointment createAppointment(String date, String time, String reason,
                                                String patientNumber, String doctorNumber, String receptionistNumber)
    {
        int random = (int)(Math.random()*999)+1;
        String appointmentNumber = "AP" + Integer.toString(random);

        Appointment appointment = new Appointment.Builder()
                .setAppointmentNumber(appointmentNumber)
                .setDate(date)
                .setTime(time)
                .setReason(reason)
                .setPatientNumber(patientNumber)
                .setDoctorNumber(doctorNumber)
                .setReceptionistNumber(receptionistNumber)
                .build();

                return appointment;
    }
}

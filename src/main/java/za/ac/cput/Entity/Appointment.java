package za.ac.cput.Entity;

/* Appointment.java
   Entity for Appointment
   Author: Nolusindiso Makosa (219023557)
   Due Date: 11 June 2021
*/

public class Appointment {
    private String appointmentNumber, date, time, reason, patientNumber, doctorNumber, receptionistNumber;

    public Appointment() {
    }

    public Appointment(Builder builder) {
        this.appointmentNumber = builder.appointmentNumber;
        this.date = builder.date;
        this.time = builder.time;
        this.reason = builder.reason;
        this.patientNumber = builder.patientNumber;
        this.doctorNumber = builder.doctorNumber;
        this.receptionistNumber = builder.receptionistNumber;
    }

    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }

    public String getReceptionistNumber() {
        return receptionistNumber;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentNumber='" + appointmentNumber + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", reason='" + reason + '\'' +
                ", patientNumber='" + patientNumber + '\'' +
                ", doctorNumber='" + doctorNumber + '\'' +
                ", receptionistNumber='" + receptionistNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String appointmentNumber;
        private String date, time, reason, patientNumber, doctorNumber, receptionistNumber;

        public Builder setAppointmentNumber(String appointmentNumber)
        {
            this.appointmentNumber = appointmentNumber;
            return this;
        }
        public Builder setDate(String date)
        {
            this.date = date;
            return this;
        }
        public Builder setTime(String time)
        {
            this.time = time;
            return this;
        }
        public Builder setReason(String reason)
        {
            this.reason = reason;
            return this;
        }
        public Builder setPatientNumber(String patientNumber)
        {
            this.patientNumber = patientNumber;
            return this;
        }
        public Builder setDoctorNumber(String doctorNumber)
        {
            this.doctorNumber = doctorNumber;
            return this;
        }
        public Builder setReceptionistNumber(String receptionistNumber)
        {
            this.receptionistNumber = receptionistNumber;
            return this;
        }

        //copy method for appointment entity
        public Builder copy(Appointment appointment){
            this.appointmentNumber = appointment.appointmentNumber;
            this.date = appointment.date;
            this.time = appointment.time;
            this.reason = appointment.reason;

            return this;
        }
        //instance for builder pattern
        public Appointment build()
        {
            return new Appointment(this);
        }
    }

}

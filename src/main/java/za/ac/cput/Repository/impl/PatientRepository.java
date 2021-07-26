package za.ac.cput.Repository.impl;

import za.ac.cput.Entity.Patient;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientRepository implements IRepository<Patient, String> {
    private Set<Patient> patientDb;
    public PatientRepository(){
        this.patientDb = new HashSet<>();
    }
    @Override
    public Patient create(Patient patient) {
        this.patientDb.add(patient);
        return patient;
    }

    @Override
    public Patient read(String s) {
        Patient patient= null;
        for (Patient p :patientDb){
            if(p.getPatientNumber().equalsIgnoreCase(s)){
                patient = p;
                break;
            }
        }
        return patient;
    }

    @Override
    public Patient update(Patient patient) {
        Patient previousPatient = read(patient.getPatientNumber());
        if (previousPatient!= null){
            patientDb.remove(previousPatient);
            patientDb.add(patient);
        }
        return patient;
    }

    @Override
    public boolean delete(String s) {
        Patient p = read(s);
        if (s!=null) {
            this.patientDb.remove(p);
            return true;
        }
        return false;
    }
}

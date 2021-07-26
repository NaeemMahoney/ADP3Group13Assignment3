package za.ac.cput.Repository.impl;

import za.ac.cput.Entity.Patient;
import za.ac.cput.Entity.PatientAddress;
import za.ac.cput.Factory.PatientAddressFactory;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientAddressRepository implements IRepository<PatientAddress,String> {
    private Set<PatientAddress> patientAddressDb;
    public PatientAddressRepository(){
        this.patientAddressDb = new HashSet<>();
    }
    @Override
    public PatientAddress create(PatientAddress patientAddress) {
        this.patientAddressDb.add(patientAddress);
        return patientAddress;
    }

    @Override
    public PatientAddress read(String s) {
        PatientAddress patientAddress= null;
        for (PatientAddress pA :patientAddressDb){
            if(pA.getPatientNumber().equalsIgnoreCase(s)){
                patientAddress = pA;
                break;
            }
        }
        return patientAddress;
    }

    @Override
    public PatientAddress update(PatientAddress patientAddress) {
        PatientAddress previousPatientAddress = read(patientAddress.getPatientNumber());
        if (previousPatientAddress!= null){
            patientAddressDb.remove(previousPatientAddress);
            patientAddressDb.add(patientAddress);
        }
        return patientAddress;
    }

    @Override
    public boolean delete(String s) {
        PatientAddress pA = read(s);
        if (s!=null) {
            this.patientAddressDb.remove(pA);
            return true;
        }
        return false;
    }
}

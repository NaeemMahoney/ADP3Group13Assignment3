package za.ac.cput.Repository.impl;

import za.ac.cput.Entity.Doctor;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public  class DoctorRepository implements IRepository<Doctor, String> {

    private  static  DoctorRepository repository = null;
    private Set<Doctor> doctorDB = null;


    private DoctorRepository(){
        doctorDB = new HashSet<>();
    }

    public static DoctorRepository getRepository(){
        if (repository ==null){
            repository = new DoctorRepository();
        }
        return repository;
    }


    public Doctor create(Doctor doctor) {
       this.doctorDB.add(doctor);
        return doctor;
    }

    @Override
    public Doctor read(String doctorNumber) {
        for (Doctor d : doctorDB)
            if (d.getDoctorNumber().equals(doctorNumber)) {
                return d;
            }
        return  null;
    }

    @Override
    public Doctor update(Doctor doctor) {
        Doctor oldDoctor = read(doctor.getDoctorNumber());
        if (oldDoctor != null){
            doctorDB.remove(oldDoctor);
            doctorDB.add(doctor);
            return doctor;
        }
        return null;
    }

    @Override
    public boolean delete(String doctorNumber) {
        Doctor doctorDelete = read(doctorNumber);

        if (doctorDelete == null)
        return false;
        doctorDB.remove(doctorDelete);
        return  true;
    }

}

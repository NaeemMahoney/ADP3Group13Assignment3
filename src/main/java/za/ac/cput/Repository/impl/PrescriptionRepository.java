package za.ac.cput.Repository.impl;

/* PrescriptionFactoryTest.java
 This is the PrescriptionRepository Test class
 Author: Ratidzai Makondo - (218187289)
 Date: 26 July 2021
 */

import za.ac.cput.Entity.Prescription;
import za.ac.cput.Factory.PrescriptionFactory;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class PrescriptionRepository implements IRepository<Prescription, String> {
    private static PrescriptionRepository repository = null;

    private Set<Prescription> PrescriptionDb = null;

    private PrescriptionRepository() {
        PrescriptionDb = new HashSet<>();
    }

    public static PrescriptionRepository getRepository() {
        if (repository == null) {
            repository = new PrescriptionRepository();
        }
        return repository;
    }

    public Prescription create(Prescription prescription) {
        boolean success = PrescriptionDb.add(prescription);
        if (!success)
            return null;

        return prescription;
    }

    @Override
    public Prescription read(String PrescriptionNumber) {
        for (Prescription p: PrescriptionDb)
            if (p.getPrescriptionNumber().equals(PrescriptionNumber)) {
                return p;
            }
        return null;

    }

    @Override
    public Prescription update (Prescription prescription) {
        Prescription newPrescription = read(prescription.getPrescriptionNumber());
        if (newPrescription != null) {

            PrescriptionDb.remove(newPrescription);
            PrescriptionDb.add(prescription);
        }

        return prescription;
    }
    @Override
    public boolean delete(String PrescriptionNumber) {
        Prescription prescriptionToDelete = read(PrescriptionNumber);
        if (prescriptionToDelete == null)
            return false;
        PrescriptionDb.remove(prescriptionToDelete);
        return true;
    }

    public Set<Prescription> getAll() {
        return PrescriptionDb;
    }
}


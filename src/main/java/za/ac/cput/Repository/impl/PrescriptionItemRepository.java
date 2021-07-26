package za.ac.cput.Repository.impl;
//Na'eem Mahoney
//218190751
//ADP3
//Repository Class for PrescriptionItem Entity

import za.ac.cput.Entity.PrescriptionItem;

import java.util.Set;
import java.util.HashSet;

public class PrescriptionItemRepository implements IPrescriptionItemRepository {
    private static PrescriptionItemRepository repository = null;
    private Set <PrescriptionItem> prescriptionitemDB = null;

    private PrescriptionItemRepository(){
        prescriptionitemDB = new HashSet<PrescriptionItem>();
    }

    public static PrescriptionItemRepository getRepository() {
        if (repository == null)
        {
            repository = new PrescriptionItemRepository();
        }
        return repository;
    }

    //Create a new PrescriptionItem
    @Override
    public PrescriptionItem create(PrescriptionItem prescriptionitem){
        boolean prescriptionitemcreated = prescriptionitemDB.add(prescriptionitem);
        if(!prescriptionitemcreated) {
            return null;
        }
        return prescriptionitem;
    }

    //Read PrescriptionItem
    @Override
    public PrescriptionItem read(String prescriptionNumber){
        for (PrescriptionItem p : prescriptionitemDB)
            if(p.getPrescriptionNumber().equals(prescriptionNumber))
            {
                return p;
            }
        return null;
    }

    //Update PrescriptionItem
    @Override
    public PrescriptionItem update(PrescriptionItem prescriptionitem){
        PrescriptionItem originalPrescriptionItem = read(prescriptionitem.getPrescriptionNumber());
        if(originalPrescriptionItem != null){
            prescriptionitemDB.remove(originalPrescriptionItem);
            prescriptionitemDB.add(prescriptionitem);
            return prescriptionitem;
        }
        return null;
    }

    //Delete PrescriptionItem
    @Override
    public boolean delete(String prescriptionNumber){
        PrescriptionItem removePrescriptionItem = read(prescriptionNumber);
        if (removePrescriptionItem == null){
            return false;
        }
        prescriptionitemDB.remove(removePrescriptionItem);
        return true;
    }

    //Display All PrescriptionItems
    public Set<PrescriptionItem> getAll(){
        return prescriptionitemDB;
    }
}

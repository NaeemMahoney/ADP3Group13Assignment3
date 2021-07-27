package za.ac.cput.impl;

// Name: Vaneza Sito
// Student no: 211315044
//IRepository Class for Receptionist Entity

import za.ac.cput.Entity.Receptionist;

import java.util.HashSet;
import java.util.Set;

public class ReceptionistRepository implements IReceptionistRepository{
    private static ReceptionistRepository repository = null;
    private Set <Receptionist> receptionistDB = null;
    private Object Receptionist;

    private ReceptionistRepository(){
        receptionistDB = new HashSet<Receptionist>();
    }

    public static ReceptionistRepository getRepository() {
        if (repository == null)
        {
            repository = new ReceptionistRepository();
        }
        return repository;
    }

    public Receptionist create(Receptionist recepcionist ){
        boolean receptionistcreated = receptionistDB.add(recepcionist);
        if(!receptionistcreated) {
            return null;
        }
        return recepcionist;
    }



    @Override
    public Receptionist read(String receptionistNumber){
        for (Receptionist r : receptionistDB)
            if(r.getReceptionistNumber().equals(receptionistNumber))
            {
                return r;
            }
        return null;
    }
    @Override
    public Receptionist update(Receptionist receptionist){
        Receptionist newReceptionist = read(receptionist.getReceptionistNumber());
        if(newReceptionist != null){
            receptionistDB.remove(newReceptionist);
            receptionistDB.add((za.ac.cput.Entity.Receptionist) Receptionist);
            return receptionist;
        }
        return null;
    }
    @Override
    public boolean delete(String receptionistNumber){
        Receptionist removeReceptionist = read(receptionistNumber);
        if (removeReceptionist == null){
            return false;
        }
        receptionistDB.remove(removeReceptionist);
        return true;
    }

    public Set<Receptionist> getAll(){
        return receptionistDB;
    }

}




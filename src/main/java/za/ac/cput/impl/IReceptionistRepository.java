package za.ac.cput.impl;

import za.ac.cput.Entity.Receptionist;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface IReceptionistRepository extends IRepository<Receptionist, String> {
    public Set<Receptionist> getAll();
}


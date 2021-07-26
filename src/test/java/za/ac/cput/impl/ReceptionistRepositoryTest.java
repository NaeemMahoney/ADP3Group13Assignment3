package za.ac.cput.impl;

// Name: Vaneza Sito
// Student no: 211315044
//Class Test for Receptionist Repository


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Receptionist;
import za.ac.cput.Factory.ReceptionistFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ReceptionistRepositoryTest {
    private static ReceptionistRepository repository = ReceptionistRepository.getRepository();
    private static Receptionist receptionist = ReceptionistFactory.build("Vaneza","Sito", "0709999898");


    @Test
    void a_createItem(){
        Receptionist receptionistcreated = repository.create(receptionist);
        assertEquals(receptionistcreated.getReceptionistNumber(), receptionist.getReceptionistNumber());
        System.out.println("Create Receptionist: "+ receptionistcreated);
    }

    @Test
    void b_readReceptionis(){
        Receptionist receptionistread = repository.read(receptionist.getReceptionistNumber());
        assertEquals(receptionistread.getReceptionistNumber(), receptionist.getReceptionistNumber());
        System.out.println("Read Receptionist: "+ receptionistread);
    }




    @Test
    void d_receptionistDelete(){
        boolean deleted = repository.delete(receptionist.getReceptionistNumber());
        assertTrue(deleted);
        System.out.println("Receptionist Deleted: "+ deleted);
    }

    @Test
    void e_receptionistGetAll(){
        System.out.println("Show Receptionist number: ");
        System.out.println(repository.getAll());
    }
}


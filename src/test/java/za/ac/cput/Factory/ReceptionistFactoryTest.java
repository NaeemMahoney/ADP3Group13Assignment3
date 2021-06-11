package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Receptionist;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionistFactoryTest {
    Receptionist receptionist;
            
    @BeforeEach
    void setUp() {
        receptionist= ReceptionistFactory.build("Vaneza","Sito", "0709999898");
    }

    @Test
    void build() {
        assertNotNull(receptionist);
        System.out.println(receptionist);
    }}


/*
 author : Vaneza Sito 211315044
 Description: This is a Receptionist Entity.
 Due Date: 11 June 2021
 */

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


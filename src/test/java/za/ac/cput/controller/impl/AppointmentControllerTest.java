package za.ac.cput.controller.impl;
/* Appointment.java
   Controller Test class for Appointment
   Author: Nolusindiso Makosa (219023557)
   Date: 17 August 2021
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.Entity.Appointment;
import za.ac.cput.Factory.AppointmentFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppointmentControllerTest {
    private static Appointment appointment = AppointmentFactory.createAppointment("26 July 2021", "15:30PM",
            "Fever", "P10PS", "D11NM", "R11OP");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/appointment";

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Appointment> postResponse = restTemplate.postForEntity(url, appointment, Appointment.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        appointment = postResponse.getBody();
        System.out.println("Saved appointment data: " + appointment);
        assertEquals(appointment.getAppointmentNumber(), postResponse.getBody().getAppointmentNumber());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read" + appointment.getAppointmentNumber();
        System.out.println("URL: " + url);
        ResponseEntity<Appointment> response = restTemplate.getForEntity(url, Appointment.class);
        assertEquals(appointment.getAppointmentNumber(), response.getBody().getAppointmentNumber());
    }

    @Test
    void c_update() {
        Appointment update = new Appointment.Builder().copy(appointment).setDate("07 August").setTime("13:30").setReason("Fetch Results")
                .setPatientNumber("P22JK").setDoctorNumber("D09MM").setReceptionistNumber("R10LO").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post Appointment data: " + update);
        ResponseEntity<Appointment> response = restTemplate.postForEntity(url, update, Appointment.class);
        assertNotNull(response.getBody());
    }

   @Test
    void e_delete(){
        String url = baseURL + "/delete/" + appointment.getAppointmentNumber();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
        }

   /* @Test
    void d_getAll(){
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show all appointments: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }*/
}


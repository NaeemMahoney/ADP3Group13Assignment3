package za.ac.cput.Service.impl;
/* PrescriptionService.java
 This is the Prescription Service class
 Author: Ratidzai Makondo - (218187289)
 Date: 2 August 2021

 */
import za.ac.cput.Entity.Prescription;
import za.ac.cput.Repository.impl.PrescriptionRepository;
import za.ac.cput.Service.iService;
import java.util.Set;

public class PrescriptionService implements iPrescriptionService {
    private static PrescriptionService service = null;
    private PrescriptionRepository repository = null;



    private PrescriptionService() {
        this.repository = PrescriptionRepository.getRepository(); }

    public static PrescriptionService getService() {
            if (service ==null) {
                service = new PrescriptionService();
            }
            return service;
        }

        @Override
        public Prescription create (Prescription prescription){
            return this.repository.create(prescription);
        }

        @Override
        public Prescription read (String prescriptionNumber){
            return this.repository.read(prescriptionNumber) ;
        }

        @Override
        public Prescription update (Prescription prescription){
            return this.repository.update(prescription);
        }

        @Override
        public boolean delete (String prescriptionNumber){
            return this.repository.delete(prescriptionNumber) ;
        }


       public Set<Prescription> getAll() {
           return this.repository.getAll();
       }
}




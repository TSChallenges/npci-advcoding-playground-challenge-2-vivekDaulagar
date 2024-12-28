
import java.util.Queue;
import java.util.LinkedList;   // LinkedList also implements Queue
import java.util.Set;
import java.util.HashSet;
import java.util.*;

class Clinic {

    private Queue<Patient> patientQueue;
    private Set<Patient> admittedPatients;
    private int dayCount;

    // Constructor to initialize the clinic with a queue and a set of admitted patients
    public Clinic() {
        this.patientQueue = new LinkedList<>();       // no patient in queue yet
        this.admittedPatients = new HashSet<>();      // no patient admitted yet
        this.dayCount = 1;    // Start with Day 1
    }


    // Admit a patient to the clinic
    public void admitPatient(Patient patient) {
        // Add the patient to the queue and print "Patient <name> admitted."

        // TODO
        patientQueue.add(patient);
        System.out.println("Patient " +patient.getName()+" admitted.");
        
    }
    

    // Schedule appointments (maximum 3 patients per day)
    public void getSchedule() {
        // Assign appointment day to patients(eg. Day 1, Day 2, and so on) as per their order in queue. 
        // Give appointment to maximum 3 patients per day.
        // Once appointment is given to a patient, add that patient to `admittedPatients` set. Also, print "Scheduled <name> on <appointmentDay>"
           
       // TODO

            int c = 0;
            while (!patientQueue.isEmpty()) {
                if (c == 0) {
                    System.out.println("Scheduling appointment for Day " + dayCount + "...");
                }
                Patient patient = patientQueue.poll();
                if (patient != null) {
                	if (c == 3) {
                        dayCount++;
                        c = 0;
                    }
                    patient.setAppointmentDay("Day " + dayCount);
                    admittedPatients.add(patient);
                    System.out.println("Scheduled " + patient.getName() + " on " + patient.getAppointmentDay());
                    c++;
 
                }
            }
    	}


    // Provide treatment or prescription for a patient after their appointment
    public void providedTreatment(Patient patient, String treatment) {
        // Provide treatment to a patient only if the patient is admitted. Print "Treatment provided to <name>: <treatment>"
        // Else print "Patient not found in the admitted list."
        
        // TODO
    	if(admittedPatients.contains(patient)) {
    		patient.setTreatment(treatment);
    		System.out.println("Treatment provided to "+patient.getName());
    	}
    	else {
    		System.out.println("Patient not found in the admitted list.");
    	}
    }


    // Get the details of a patient
    public void getPatientDetails(Patient patient) {
        // Print patient details only if the patient is admitted.
        // Else print "Patient not found in the admitted list."
        
        // TODO
    	
    	if(admittedPatients.contains(patient)) {
    		patient.toString();
    	}
    }


    // Get the appointment details of a patient
    public void getAppointmentDetails(Patient patient) {
        // Print appointment details of a patient only if the patient is admitted. "Appointment Details: <name> is scheduled on <appointmentDay>"
        // Else print "Patient not found in the admitted list."
        
        // TODO
    	if(admittedPatients.contains(patient)) {
    		System.out.println("Appointment Details: "+ patient.getName()+ " is scheduled on "+patient.getAppointmentDay());
    	}
    	else {
    		System.out.println("Patient not found in the admitted list.");
    	}
    }


    // Discharge a patient from the clinic
    public void dischargePatient(Patient patient) {
        // Remove the patient from admitted patients list. Print "Patient <name> discharged."

        // TODO
    	admittedPatients.remove(patient);
    	System.out.println("Patient "+patient.getName()+" discharged.");
    }
}


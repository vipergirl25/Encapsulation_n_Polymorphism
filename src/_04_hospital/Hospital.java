package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor>doctors = new ArrayList<Doctor>();
	ArrayList<Patient>patients = new ArrayList<Patient>();
	int patient = 0;
	void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	void addPatient(Patient patient) {
		patients.add(patient);
	}
	ArrayList getDoctors() {
		return doctors;
	}
	
	ArrayList getPatients() {
		return patients;
	}
	void assignPatientsToDoctors() {
		for (Doctor doctor : doctors) {
			for (int i = 0; i < 3; i++) {
				try {
					doctor.assignPatient(patients.get(patient));
					System.out.println(patient);
				} catch (DoctorFullException e) {
					e.printStackTrace();
				}
				patient++;
				if(patient==patients.size()) {
					break;
				}
			}
		}
	}
}

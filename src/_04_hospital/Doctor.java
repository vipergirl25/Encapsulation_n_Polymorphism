package _04_hospital;

import java.util.ArrayList;

class Doctor {
	ArrayList<Patient>patients = new ArrayList<Patient>();
	boolean donestuff;
	boolean performsSurgery() {
		return false;
	}
	boolean makesHouseCalls() {
		return false;
	}
	void assignPatient(Patient patient) throws DoctorFullException{
		if(patients.size()>=3) {
			throw new DoctorFullException();
		}else {
			patients.add(patient);
		}
	}
	ArrayList getPatients() {
		return patients;
	}
	void doMedicine() {
		donestuff = true;
		for (Patient patient : patients) {
			patient.caredFor = true;
		}
	}
}

class GeneralPractitioner extends Doctor {
	boolean performsSurgery() {
		return false;
	}
	boolean makesHouseCalls() {
		return true;
	}
}

class Surgeon extends Doctor {
	boolean performsSurgery() {
		return true;
	}
	boolean makesHouseCalls() {
		return false;
	}
}

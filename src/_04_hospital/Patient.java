package _04_hospital;

public class Patient {
	boolean pulseCheck;
	boolean caredFor;
	boolean checkPulse() {
		return pulseCheck = true;
	}
	boolean feelsCaredFor() {
		if(pulseCheck==true || caredFor==true) {
			return true;
		}else {
			return false;
		}
	}
}

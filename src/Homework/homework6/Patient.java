package Homework.homework6;

public class Patient {

    private int treatPlan;
    private ClinicDoctor doctor;

    public Patient(int treatPlan) {
        this.treatPlan = treatPlan;
    }

    public int getTreatPlan() {
        return treatPlan;
    }

    public ClinicDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(ClinicDoctor doctor) {
        this.doctor = doctor;
    }
}

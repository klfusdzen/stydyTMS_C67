package Homework.homework6;

public class Therapist extends ClinicDoctor {
    void treat() {
        System.out.println("Prescribe treatment");
    }

    void AppointDoctor(Patient object){
        switch (object.getTreatPlan()){
            case 1 -> {
                object.setDoctor(new Dentist());
                object.getDoctor().treat();
            }
            case 2 -> {
                object.setDoctor(new Surgeon());
                object.getDoctor().treat();
            }
            default -> {
                object.setDoctor(new Therapist());
                object.getDoctor().treat();
            }
        }
    }
}

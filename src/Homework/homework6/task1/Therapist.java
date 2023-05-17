package Homework.homework6.task1;

public class Therapist extends ClinicDoctor {
    void treat() {
        System.out.println("Prescribe treatment");
    }

    void appointDoctor(Patient object){
        switch (object.getTreatPlan()){
            case 1 -> {
                object.setDoctor(new Dentist());
            }
            case 2 -> {
                object.setDoctor(new Surgeon());
            }
            default -> {
                object.setDoctor(new Therapist());
            }
        }
        object.getDoctor().treat();
    }
}

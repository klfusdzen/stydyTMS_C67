package Homework.homework6.task1;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(3);
        Patient patient3 = new Patient(2);

        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient1);
        therapist.appointDoctor(patient2);
        therapist.appointDoctor(patient3);
    }
}

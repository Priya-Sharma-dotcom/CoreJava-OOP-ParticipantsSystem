package coreJavaProject;

public class Main {
    public static void main(String[] args) {
        Batch batch = new Batch();

        BeginnerParticipant bp = new BeginnerParticipant("Riya", "riya@gmail.com", "OOP Basics");
        AdvancedParticipant ap = new AdvancedParticipant("Priya", "priya@gmail.com", "JavaFX");

        batch.addParticipant(bp);
        batch.addParticipant(ap);

        batch.displayAllParticipants();
    }
}

package coreJavaProject;

import java.util.ArrayList;

public class Batch {
    private ArrayList<Participant> participants;

    public Batch() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Participant p) {
        participants.add(p);
    }

    public void displayAllParticipants() {
        for (Participant p : participants) {
            p.displayDetails();
            System.out.println("------------------");
        }
    }
}

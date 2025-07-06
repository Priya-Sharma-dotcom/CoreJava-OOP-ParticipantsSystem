package coreJavaProject;

public class BeginnerParticipant extends Participant {
    private String beginnerTopic;

    public BeginnerParticipant(String name, String email, String beginnerTopic) {
        super(name, email, "Beginner");
        this.beginnerTopic = beginnerTopic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Participant Type: Beginner");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Topic: " + beginnerTopic);
    }
}

package coreJavaProject;

public class AdvancedParticipant extends Participant {
    private String advancedTool;

    public AdvancedParticipant(String name, String email, String advancedTool) {
        super(name, email, "Advanced");
        this.advancedTool = advancedTool;
    }

    @Override
    public void displayDetails() {
        System.out.println("Participant Type: Advanced");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Tool: " + advancedTool);
    }
}

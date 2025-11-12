package tut02;

public class AgentAssigned {
	private String agentName;
    private String agentPhone;

    public AgentAssigned(String agentName, String agentPhone) {
        this.agentName = agentName;
        this.agentPhone = agentPhone;
    }

    public void showAgent() {
        System.out.println("Agent Name: " + agentName);
        System.out.println("Agent Phone: " + agentPhone);
    }

}

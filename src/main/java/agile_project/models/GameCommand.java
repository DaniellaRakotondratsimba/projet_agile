package agile_project.models;

import java.util.List;

public class GameCommand {
    private int numberOfPlayers;
    private List<Long> selectedPlayers;
    private String rules;
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public List<Long> getSelectedPlayers() {
		return selectedPlayers;
	}
	public void setSelectedPlayers(List<Long> selectedPlayers) {
		this.selectedPlayers = selectedPlayers;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	
	public GameCommand(int numberOfPlayers, List<Long> selectedPlayers, String rules) {
		super();
		this.numberOfPlayers = numberOfPlayers;
		this.selectedPlayers = selectedPlayers;
		this.rules = rules;
	}
	
	public GameCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
}

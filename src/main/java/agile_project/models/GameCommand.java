package agile_project.models;

import java.util.List;

public class GameCommand {
	//nombre de joueur
    private int numberOfPlayers;
    
    //liste des joueurs sélectionnés
    private List<Long> selectedPlayers;
    
    //règle du jeu
    private String rules;
    
    //getters et setters
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
	
	//constructeur
	public GameCommand(int numberOfPlayers, List<Long> selectedPlayers, String rules) {
		super();
		this.numberOfPlayers = numberOfPlayers;
		this.selectedPlayers = selectedPlayers;
		this.rules = rules;
	}
	
	//constructeur par défaut
	public GameCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
}

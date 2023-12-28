package agile_project.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {
	//Id généré automatiquement
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_game;
	
	//nombre de joueurs
	private int numberOfPlayers;
	
	//Liste des joueurs sélectionnés
	@ElementCollection
    private List<Long> selectedPlayers;
	
	//règle du jeu
    private String rules;
    
    //getters et setters
	public Long getId_game() {
		return id_game;
	}
	public void setId_game(Long id_game) {
		this.id_game = id_game;
	}
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
	public Game(Long id_game, int numberOfPlayers, List<Long> selectedPlayers, String rules) {
		super();
		this.id_game = id_game;
		this.numberOfPlayers = numberOfPlayers;
		this.selectedPlayers = selectedPlayers;
		this.rules = rules;
	}
	
	//constructeur par défaut
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
}

package agile_project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vote {
	//Id généré automatiquement
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vote;
	
	//Relation many to one avec l'objet player
    @ManyToOne
    private Player player;
    
    //Relation many to one avec l'objet task
    @ManyToOne
    private Task task;
    
    //Relation many to one avec l'objet game
    @ManyToOne
    private Game game;
    
    //Estimation du vote
    private int estimation;
    
    //Création des getters et setters pour tous les champs
	public Long getId_vote() {
		return id_vote;
	}
	public void setId_vote(Long id_vote) {
		this.id_vote = id_vote;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public int getEstimation() {
		return estimation;
	}
	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}
	
	//Constructeur
	public Vote(Long id_vote, Player player, Task task, Game game, int estimation) {
		super();
		this.id_vote = id_vote;
		this.player = player;
		this.task = task;
		this.game = game;
		this.estimation = estimation;
	}
	
	//Constructeur par défaut
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

package agile_project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vote {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vote;
    @ManyToOne
    private Player player;
    @ManyToOne
    private Task task;
    @ManyToOne
    private Game game;
    private int estimation;
    
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
	
	public Vote(Long id_vote, Player player, Task task, Game game, int estimation) {
		super();
		this.id_vote = id_vote;
		this.player = player;
		this.task = task;
		this.game = game;
		this.estimation = estimation;
	}
	
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

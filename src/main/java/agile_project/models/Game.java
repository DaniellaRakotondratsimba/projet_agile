package agile_project.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Game {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_game;
	private String current_mode;
	@OneToMany(mappedBy = "game")
	private List<Vote> votes;
	
	public Long getId_game() {
		return id_game;
	}
	public void setId_game(Long id_game) {
		this.id_game = id_game;
	}
	public String getCurrent_mode() {
		return current_mode;
	}
	public void setCurrent_mode(String current_mode) {
		this.current_mode = current_mode;
	}
	public List<Vote> getVotes() {
		return votes;
	}
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}
	
	public Game(Long id_game, String current_mode, List<Vote> votes) {
		super();
		this.id_game = id_game;
		this.current_mode = current_mode;
		this.votes = votes;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
}

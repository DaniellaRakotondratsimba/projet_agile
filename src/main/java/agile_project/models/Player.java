package agile_project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_player;
	private String player_name;
	private String role;
	
	public Long getId_player() {
		return id_player;
	}
	public void setId_player(Long id_player) {
		this.id_player = id_player;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Player(Long id_player, String player_name, String role) {
		super();
		this.id_player = id_player;
		this.player_name = player_name;
		this.role = role;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

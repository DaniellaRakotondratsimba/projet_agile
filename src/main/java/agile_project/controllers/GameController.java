package agile_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import agile_project.models.Game;
import agile_project.models.GameCommand;
import agile_project.models.Player;
import agile_project.repositories.GameRepository;
import agile_project.repositories.PlayerRepository;

@Controller
public class GameController {
	
	@Autowired
    private GameRepository gameRepository;
	@Autowired
    private PlayerRepository playerRepository;


	@GetMapping("/createGame")
    public String showCreateGameForm(Model model) {
        List<Player> players = playerRepository.findAll();
        model.addAttribute("players", players);
        model.addAttribute("gameCommand", new GameCommand());
        return "createGame";
    }

    @GetMapping("/resumeGame")
    public String showResumeGameForm(Model model) {
        return "resumeGame";
    }
    
    @PostMapping("/createGame")
    public String createGame(@ModelAttribute GameCommand gameCommand) {
        // Convertir les données du formulaire en une instance de Game
        Game newGame = convertToGame(gameCommand);

        // Enregistrer le jeu dans la base de données
        gameRepository.save(newGame);

        // Rediriger ou effectuer d'autres actions nécessaires
        return "game";
    }
    
    private Game convertToGame(GameCommand gameCommand) {
        Game game = new Game();
        game.setNumberOfPlayers(gameCommand.getNumberOfPlayers());
        game.setRules(gameCommand.getRules());
        game.setSelectedPlayers(gameCommand.getSelectedPlayers());

        return game;
    }
	
}

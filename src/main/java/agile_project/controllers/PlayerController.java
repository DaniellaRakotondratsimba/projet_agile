package agile_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import agile_project.models.Player;
import agile_project.repositories.PlayerRepository;


@Controller
public class PlayerController {
	@Autowired
    private PlayerRepository playerRepository;

    //afficher la liste des joueurs
    @GetMapping("/players")
    public String showListPlayer(Model model) {
        model.addAttribute("players", playerRepository.findAll());
        return "listPlayer";
    }

    @GetMapping("/listPlayer")
    public String showPlayerForm(Player player) {
        return "listPlayer";
    }

    //Ajouter un joueur
    @PostMapping("/addPlayer")
    public String addPlayer(Player player) {
        playerRepository.save(player);
        return "redirect:/listPlayer";
    }
}

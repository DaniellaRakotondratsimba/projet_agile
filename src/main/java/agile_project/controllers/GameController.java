package agile_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

	@GetMapping("/createGame")
    public String showCreateGameForm(Model model) {
        return "createGame";
    }

    @GetMapping("/resumeGame")
    public String showResumeGameForm(Model model) {
        return "resumeGame";
    }
	
}

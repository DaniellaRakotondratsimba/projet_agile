package agile_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agile_project.models.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

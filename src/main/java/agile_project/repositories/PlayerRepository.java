package agile_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agile_project.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}

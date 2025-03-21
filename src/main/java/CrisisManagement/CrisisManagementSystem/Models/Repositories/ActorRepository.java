package CrisisManagement.CrisisManagementSystem.Models.Repositories;

import CrisisManagement.CrisisManagementSystem.Models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
